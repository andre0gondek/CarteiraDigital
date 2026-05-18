package com.example.carteiradigital.feature.unidadecurricular.presentation.data.repository

import com.example.carteiradigital.feature.unidadecurricular.presentation.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}