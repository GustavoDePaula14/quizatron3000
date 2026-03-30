package com.example.quizatron3000

import android.R.attr.type
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.quizatron3000.screens.CriarTelaFim
import com.example.quizatron3000.screens.InicioQuiz
import com.example.quizatron3000.screens.Quiz.QuizViewModule
import com.example.quizatron3000.screens.Quiz.TelaQuiz
import com.example.quizatron3000.ui.theme.Quizatron3000Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Quizatron3000Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "inicioQuiz",
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Left,
                                animationSpec = tween(1000)
                            )
                        },
                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope
                                    .SlideDirection.Left,
                                animationSpec = tween(1000)
                            )
                        }
                    ) {
                        composable(
                            route = "inicioQuiz",
                        ){
                            InicioQuiz(modifier = Modifier, navController)
                        }
                        composable(
                            route = "telaQuiz"
                        ){
                            TelaQuiz(modifier = Modifier, navController)
                        }
                        composable(
                            route = "telaFim/{respostasCorretas}",
                            arguments = listOf(
                                navArgument("respostasCorretas"){
                                    type = NavType.IntType
                                },
                            ),) {
                            val respostasCorretas = it.arguments?.getInt("respostasCorretas")

                            CriarTelaFim(
                                navController = navController,
                                quizViewModule = QuizViewModule(),
                                respostasCorretas = respostasCorretas!!
                            )
                        }
                    }
                }
            }
        }
    }
}
