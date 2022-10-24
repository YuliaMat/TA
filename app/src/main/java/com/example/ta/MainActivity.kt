package com.example.ta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import dev.TA.OneFragment
import java.util.*
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_first.*

var list = mutableListOf<Any>() //список куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Назначаем в контейнер созданный в xml фрагмент OneFragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, OneFragment())
        transaction.commit()
    }
}