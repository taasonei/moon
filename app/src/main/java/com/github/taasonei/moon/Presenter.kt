package com.github.taasonei.moon

import android.content.Context
import kotlin.random.Random

class Presenter(
    private val view: com.github.taasonei.moon.View,
    private val context: Context
) {

    fun generateAnswer() {
        val answers: Array<String> = context.resources.getStringArray(R.array.answers)
        view.setAnswer(answers[Random.nextInt(2)])
        view.startAnimation()
    }

    fun notifyAnimationStart() {
        view.toggleButton()
    }

    fun notifyAnimationEnd() {
        view.toggleButton()
    }

}