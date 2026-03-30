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
    fun adicionarRespostaCorreta(): LiveData<Int>{
        _respostasCorretas.value = respostasCorretas.value?.plus(1)
        return _respostasCorretas
    }
    fun reiniciarRespostas(): LiveData<Int>{
        _respostasCorretas.value = 0
        return _respostasCorretas
    }
    fun reiniciarPaginas(): LiveData<Int>{
        _paginaQuiz.value = 1
        return _paginaQuiz
    }
}