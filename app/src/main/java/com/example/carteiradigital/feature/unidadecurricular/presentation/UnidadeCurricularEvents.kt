package com.example.carteiradigital.feature.unidadecurricular.presentation

sealed interface UnidadeCurricularEvents {
    data object OnCarregarDados : UnidadeCurricularEvents
    data object OnTentarNovamenteClick : UnidadeCurricularEvents
    data object OnVoltarClick : UnidadeCurricularEvents
}