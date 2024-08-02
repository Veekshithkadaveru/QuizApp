package com.example.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        val questionsList = Constants.getQuestions()
        Log.i("QuestionsSize is", "${questionsList.size}")

    }
}

