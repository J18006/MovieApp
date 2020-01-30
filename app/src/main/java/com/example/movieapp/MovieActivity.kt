package com.example.movieapp

import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_movie.*

class MovieActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler(mainLooper).postDelayed({
            var moviePath=Uri.parse("android.resource://" + packageName + "/" + R.raw.glass)
            videoView.setVideoURI(moviePath)


            videoView.setOnPreparedListener {
                videoView.start()

                videoView.setMediaController(MediaController(this))

            }

            videoView.setOnCompletionListener {
                finish()
            }


        },  200)

    }

}