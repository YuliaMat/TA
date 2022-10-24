package dev.TA

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.ta.DBHelper
import com.example.ta.R
import kotlinx.android.synthetic.main.fragment_first.*

class OneFragment : Fragment() {
    private lateinit var button: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //инициализируем переменные
        button = view.findViewById(R.id.button)
        //при нажатии на кнопку, накладываем(с помощью метода add()) поверх первого фрагмент FirstFragment
        button.setOnClickListener(View.OnClickListener { view2 ->
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack("")
            transaction.add(R.id.container, FirstFragment())
            transaction.commit()
        }
        )
    }
}