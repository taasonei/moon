package com.github.taasonei.moon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View {

    private lateinit var tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAnswer = findViewById(R.id.tvAnswer)
        val presenter = Presenter(this, this)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            presenter.generateAnswer()
        }
    }

    override fun setAnswer(answer: String) {
        tvAnswer.text = answer
    }
}