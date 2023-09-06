package com.example.transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.widget.ImageView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView=findViewById<ImageView>(R.id.imageView)
        val fade = Fade()

        fade.excludeTarget(android.R.id.statusBarBackground,true)
        fade.excludeTarget(android.R.id.navigationBarBackground,true)

        window.enterTransition=fade
        window.exitTransition=fade

        imageView.setOnClickListener {
            val intent=Intent(this@MainActivity,TransitionSecond::class.java)

            val options=ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity,imageView,ViewCompat.getTransitionName(imageView)!!
            )
            startActivity(intent,options.toBundle())
        }

    }
}