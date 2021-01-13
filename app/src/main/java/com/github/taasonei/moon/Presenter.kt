package com.github.taasonei.moon

import android.content.Context
import kotlin.random.Random

class Presenter constructor(private val view: com.github.taasonei.moon.View, private val context: Context){

    private val answers : Array<String> = context.resources.getStringArray(R.array.answers)

    fun generateAnswer() {
        view.setAnswer(answers[Random.nextInt(2)])
    }

}