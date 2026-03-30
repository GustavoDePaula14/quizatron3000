package com.example.quizatron3000.screens

import android.R.attr.onClick
import android.R.attr.text
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizatron3000.R
import com.example.quizatron3000.screens.Quiz.QuizViewModule

@Composable
fun CriarTelaFim(modifier: Modifier = Modifier, quizViewModule: QuizViewModule, navController: NavController, respostasCorretas: Int) {

    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(50.dp))
        Image(
            modifier = Modifier
                .size(84.dp),
            painter = painterResource(R.drawable.quiz),
            contentDescription = "",
        )
        Spacer(modifier = Modifier.height(50.dp))
        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(width = 1.dp, Color.Black, RoundedCornerShape(40))
                    .background(Color.Green),
                textAlign = TextAlign.Center,
                text = "Bom trabalho",
                fontSize = 32.sp
            )
            Text(
                text = "Voce acertou $respostasCorretas de 3 Perguntas",
                fontSize = 16.sp,
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(horizontal = 30.dp)
                .border(width = 1.dp, Color.Black, RoundedCornerShape(40)),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.yellow),
                contentColor = colorResource((R.color.black)),
            ),
            onClick = {
                QuizViewModule().reiniciarPaginas()
                QuizViewModule().reiniciarRespostas()
                navController.navigate("telaQuiz")
            }
        ) {
            Text(
                text = "Tentar de novo",
                fontSize = 24.sp,
            )
        }
    }
}