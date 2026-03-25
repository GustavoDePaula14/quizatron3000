package com.example.quizatron3000

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.quizatron3000.screens.Quiz.QuizViewModule
import com.example.quizatron3000.screens.Quiz.TelaQuiz
import com.example.quizatron3000.ui.theme.Quizatron3000Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizatron3000Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    TelaQuiz(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
