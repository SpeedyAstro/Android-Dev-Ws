package com.example.musicapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.os.postDelayed
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var seekBar: SeekBar
    private lateinit var runnable: Runnable
    private var mediaPlayer : MediaPlayer? = null
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.sbfs)
        handler = Handler(Looper.getMainLooper())
        val pausebtn = findViewById<FloatingActionButton>(R.id.fbpause)
        val playbtn = findViewById<FloatingActionButton>(R.id.fbplay)
        val stopbtn = findViewById<FloatingActionButton>(R.id.fbstop)

        pausebtn.setOnClickListener {
           mediaPlayer?.pause()
        }
        playbtn.setOnClickListener {
            if(mediaPlayer==null){
                mediaPlayer= MediaPlayer.create(this,R.raw.langar)
                intializeSeekBar()
            }
            mediaPlayer?.start()
        }
        stopbtn.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
            handler.removeCallbacks(runnable)
            seekBar.progress = 0
        }

    }
    private fun intializeSeekBar(){
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar : SeekBar?, progress: Int, fromUser: Boolean) {
                if(fromUser) mediaPlayer?.seekTo(progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
        val tvplay = findViewById<TextView>(R.id.tvPlay)
        val tvdue = findViewById<TextView>(R.id.tvDue)
        seekBar.max = mediaPlayer!!.duration
        runnable = Runnable {
            seekBar.progress = mediaPlayer!!.currentPosition

            val playtime = mediaPlayer!!.currentPosition/1000
            tvplay.text = "$playtime sec"
            val duration = mediaPlayer!!.duration/1000
            val dueTime = duration - playtime
            tvdue.text = "$dueTime sec"
            handler.postDelayed(runnable,1000)
        }
        handler.postDelayed(runnable,1000)
    }
}

