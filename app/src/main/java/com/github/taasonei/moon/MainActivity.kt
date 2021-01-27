package com.github.taasonei.moon

import android.animation.Animator
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity(), View {

    private lateinit var tvAnswer: TextView
    private lateinit var button: Button
    private lateinit var animationView: LottieAnimationView
    private val presenter = Presenter(this, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAnswer = findViewById(R.id.tvAnswer)
        button = findViewById(R.id.button)
        animationView = findViewById(R.id.animationView)

        button.setOnClickListener {
            presenter.generateAnswer()
        }

        animationView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
                presenter.notifyAnimationStateChanged()
            }

            override fun onAnimationEnd(animation: Animator?) {
                presenter.notifyAnimationStateChanged()
            }

            override fun onAnimationCancel(animation: Animator?) {}
            override fun onAnimationRepeat(animation: Animator?) {}
        })
    }

    override fun setAnswer(answer: String) {
        tvAnswer.text = answer
    }

    override fun startAnimation() {
        animationView.playAnimation()
    }

    override fun toggleButton() {
        button.isEnabled = button.isEnabled != true
    }
}