package com.github.taasonei.moon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private val answersList : Array<String> = arrayOf("Да", "Нет")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvAnswer : TextView = findViewById(R.id.tvAnswer)
        val button:Button = findViewById(R.id.button)

        button.setOnClickListener {
            tvAnswer.text = answersList[Random.nextInt(2)]
        }
    }

}