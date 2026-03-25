package com.example.quizatron3000.composebles

import android.R.attr.text
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quizatron3000.screens.Quiz.QuizViewModule

@Composable
fun CriarQuiz(modifier: Modifier = Modifier, quizViewModule: QuizViewModule) {
    val paginaQuiz by quizViewModule.paginaQuiz.observeAsState()
    Button(
        onClick = {
            Log.d("Teste","${quizViewModule.avancarPagina().value}")
        }
    ) { }
    Text(
        modifier = Modifier,
        text = "Pergunta ${paginaQuiz} de 3",
    )

        Column() {
            Text(
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
                    .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = Color.Black)
                    .fillMaxWidth()
                    .background(Color.Green),

                text = "Teste de titulo 1",
            )
            CriarBotao(modifier = Modifier, serResposta = true, texto = "teste", quizViewModule = QuizViewModule())
//            CriarBotao(modifier = Modifier, serResposta = false, texto = "teste")
//            CriarBotao(modifier = Modifier, serResposta = false, texto = "teste")
//            CriarBotao(modifier = Modifier, serResposta = false, texto = "teste")
//            CriarBotao(modifier = Modifier, serResposta = true, texto = "teste")
        }
    }
