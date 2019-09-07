package com.example.quizapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapplication.R
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {

    private var totalScore: Int? = null
    private var totalQuestions: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        //Get the bundle
        val bundle: Bundle = intent.extras!!

        //Extract the data
        totalScore = bundle.getInt("totalScore")
        totalQuestions = bundle.getInt("totalQuestions")

        progressBar.progress = totalScore as Int
        text_progress.text = totalScore.toString() + " out of " + totalQuestions
    }
}