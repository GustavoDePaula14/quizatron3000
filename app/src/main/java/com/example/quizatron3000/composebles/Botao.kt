package com.example.quizatron3000.composebles

import android.R.attr.onClick
import android.R.color.white
import android.util.Log
import android.widget.Button
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.quizatron3000.R
import com.example.quizatron3000.screens.Quiz.QuizViewModule
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import kotlin.math.log

@Composable
fun CriarBotao(modifier: Modifier = Modifier, serResposta: Boolean, texto: String, quizViewModule: QuizViewModule) {
    var backgroundColor by remember {
        mutableStateOf(Color.White)
    }
    val scope = rememberCoroutineScope()
    Button(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            scope.launch {
                if (serResposta) {
                    backgroundColor = Color.Green
                    quizViewModule.adicionarRespostaCorreta()
                } else {
                    backgroundColor = Color.Red
                }

                delay(2000)
//                Thread.sleep(5000)
                quizViewModule.avancarPagina().value

            }
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = colorResource((R.color.black)),
        ),

    ) {
        Text(
            text = "$texto"
        )
    }
}