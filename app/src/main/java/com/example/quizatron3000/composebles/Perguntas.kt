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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quizatron3000.screens.Quiz.QuizViewModule

@Composable
fun CriarQuiz(modifier: Modifier = Modifier, quizViewModule: QuizViewModule, navController: NavController) {
    val paginaQuiz by quizViewModule.paginaQuiz.observeAsState()
    val respostasCorretas by quizViewModule.respostasCorretas.observeAsState()
    if (paginaQuiz != 4){
        Text(
            modifier = Modifier,
            text = "Pergunta ${paginaQuiz} de 3",
        )
    }
        Column() {
            if(paginaQuiz == 1){
                Text(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = Color.Black)
                        .fillMaxWidth()
                        .background(Color.Green),
                    text = "Capital do Brasil",
                    textAlign = TextAlign.Center
                )
            CriarBotao(modifier = Modifier, serResposta = false, texto = "China", quizViewModule = quizViewModule)
            CriarBotao(modifier = Modifier, serResposta = false, texto = "São Paulo", quizViewModule = quizViewModule)
            CriarBotao(modifier = Modifier, serResposta = false, texto = "Minas Gerais", quizViewModule = quizViewModule)
            CriarBotao(modifier = Modifier, serResposta = false, texto = "Portugal", quizViewModule = quizViewModule)
            CriarBotao(modifier = Modifier, serResposta = true, texto = "Brasilia", quizViewModule = quizViewModule)

            }else if(paginaQuiz == 2){
                Text(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = Color.Black)
                        .fillMaxWidth()
                        .background(Color.Green),
                    text = "Quanto é 30 + 20 - 10",
                    textAlign = TextAlign.Center
                )

                CriarBotao(modifier = Modifier, serResposta = true, texto = "40", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "42", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "50", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "51", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "0", quizViewModule = quizViewModule)

            }else if(paginaQuiz == 3){
                Text(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .border(width = 1.dp, shape = RoundedCornerShape(15.dp), color = Color.Black)
                        .fillMaxWidth()
                        .background(Color.Green),
                    text = "Quantos dias tem um ano",
                    textAlign = TextAlign.Center
                )

                CriarBotao(modifier = Modifier, serResposta = false, texto = "10", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "20", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "30", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = true, texto = "335", quizViewModule = quizViewModule)
                CriarBotao(modifier = Modifier, serResposta = false, texto = "0", quizViewModule = quizViewModule)
            }else{
                navController.navigate("telaFim/$respostasCorretas")
            }
        }

    }
