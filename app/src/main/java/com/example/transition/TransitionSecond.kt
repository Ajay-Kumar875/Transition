package com.example.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.widget.ImageView

class TransitionSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_second)

        val fade = Fade()

        fade.excludeTarget(android.R.id.statusBarBackground,true)
        fade.excludeTarget(android.R.id.navigationBarBackground,true)

        window.enterTransition=fade
        window.exitTransition=fade

    }
}