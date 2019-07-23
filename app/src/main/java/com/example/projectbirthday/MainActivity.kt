package com.example.projectbirthday

import android.animation.ObjectAnimator
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.Window
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import androidx.core.view.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var birthdayTune = MediaPlayer.create(this , R.raw.happybirthdaytune)
        birthdayTune.start()

        linearHappyBirthday.scaleX = 0f
        linearHappyBirthday.scaleY = 0f
        linearHappyBirthday.animate().setDuration(10000).scaleX(1f).scaleY(1f).rotation(3600f).startDelay = 500

        Handler().postDelayed({
            makeNextButtonVisible()
            birthdayTune.stop()
            birthdayTune.release()
        }, 11000)
    }

    fun gotoNextPage(view: View) = startActivity(Intent(this , ImagesPageActivity::class.java))

    fun makeNextButtonVisible(){
       tvNextPage.scaleX = 0f
       tvNextPage.scaleY = 0f
       tvNextPage.visibility = View.VISIBLE
       tvNextPage.animate().setDuration(1500).scaleX(1f).scaleY(1f)
    }

}