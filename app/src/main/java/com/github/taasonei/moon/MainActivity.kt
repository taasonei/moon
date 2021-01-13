package com.github.taasonei.moon

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View {

    private lateinit var tvAnswer: TextView
    private lateinit var button: Button
    private val presenter = Presenter(this, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAnswer = findViewById(R.id.tvAnswer)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            button.isEnabled = false
            Thread.sleep(3000)
            presenter.generateAnswer()
        }
    }

    override fun setAnswer(answer: String) {
        tvAnswer.text = answer
        button.isEnabled = true
    }
}