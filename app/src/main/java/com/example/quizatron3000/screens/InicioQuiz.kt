package com.example.quizatron3000.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizatron3000.R

@Composable
fun InicioQuiz(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.Cyan)
            .fillMaxSize()
            .padding(horizontal = 90.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            modifier = Modifier
                .size(84.dp),
            painter = painterResource(R.drawable.quiz),
            contentDescription = "",
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            fontSize = 26.sp,
            text = "QUIZATRON 3000"
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, Color.Black, RoundedCornerShape(20)),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.yellow),
                contentColor = colorResource((R.color.black)),
            ),
            onClick = {}
        ) {
            Text(
                text = "COMEÇAR!"
            )
        }
    }
}