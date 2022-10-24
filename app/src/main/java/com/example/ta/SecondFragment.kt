package dev.TA

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ta.R

class SecondFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycleView)
        button = view.findViewById(R.id.button)
        var list = mutableListOf<ModelRV>() //список куда будут класться элементы для RecycleView
        list.add(
            ModelRV(
                path = "https://visitmaldives.com/en",
                name = "Maldives"
            )
        )
        list.add(
            ModelRV(
                path = "http://www.ics.gov.sc/visa-and-travel/visiting-seychelles",
                name = "Seychelles"
            )
        )
        list.add(
            ModelRV(
                path = "https://www.visitturkey.in",
                name = "Turkey"
            )
        )
        list.add(
            ModelRV(
                path = "https://www.visitdubai.com/Maintenance",
                name = "United Arab Emirates"
            )
        )
        list.add(
            ModelRV(
                path = "https://www.tourismthailand.org/home",
                name = "Thailand"
            )
        )
        list.add(
            ModelRV(
                path = "https://www.visitcyprus.com/index.php/en",
                name = "Cyprus"
            )
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
        //присваем адаптер к  recyclerview
        recyclerView.adapter = Adapter(context = requireContext(), list, this)
        //при нажатии на кнопку накладываем на второй фрагмент ThirdFragment
        button.setOnClickListener(View.OnClickListener { view2 ->
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack("")
            transaction.add(R.id.container, ThirdFragment())
            transaction.commit()
        })
    }

}