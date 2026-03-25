package com.example.quizatron3000.composebles

import android.R.attr.onClick
import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.quizatron3000.R
import com.example.quizatron3000.screens.Quiz.QuizViewModule
import kotlin.math.log

@Composable
fun CriarBotao(modifier: Modifier = Modifier, serResposta: Boolean, texto: String, quizViewModule: QuizViewModule) {
    if (serResposta){
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.white),
                contentColor = colorResource((R.color.black)),
            ),
            onClick = {}
        ) {
            Text(
                text = "$texto -correto"
            )
        }
    } else{
        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.white),
                contentColor = colorResource((R.color.black)),
            ),
            onClick = {
                print("dasdas")}
        ) {
            Text(
                text = "$texto -errado"
            )
        }
    }
}