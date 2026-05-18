package com.example.carteiradigital.feature.unidadecurricular.presentation

import com.example.carteiradigital.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular

data class UnidadeCurricularUIState (
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)