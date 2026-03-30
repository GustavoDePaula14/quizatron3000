package com.example.quizatron3000.screens.Quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizatron3000.R
import com.example.quizatron3000.composebles.CriarQuiz


@Composable
fun TelaQuiz(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Magenta)
            .padding(horizontal = 45.dp, vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .size(40.dp),
            painter = painterResource(R.drawable.quiz),
            contentDescription = "",
        )
        CriarQuiz(modifier = Modifier, QuizViewModule(), navController)
    }
}
