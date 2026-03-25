package com.example.quizatron3000.screens.Quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModule: ViewModel() {
    private val _paginaQuiz = MutableLiveData<Int>(1)
    private val _respostasCorretas = MutableLiveData<Int>(0)

    var paginaQuiz: LiveData<Int> = _paginaQuiz
    var respostasCorretas: LiveData<Int> = _respostasCorretas

    fun avancarPagina(): LiveData<Int> {
        _paginaQuiz.value = paginaQuiz.value?.plus(1)
        return _paginaQuiz
    }
    fun atualizarPagina(novaPagina: Int): MutableLiveData<Int> {
        _paginaQuiz.value = novaPagina
        return _paginaQuiz
    }

    fun somarRespostaCorreta(){
        _respostasCorretas.value = _respostasCorretas.value?.plus(1)
    }
}