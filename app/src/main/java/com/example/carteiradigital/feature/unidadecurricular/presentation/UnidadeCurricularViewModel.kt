package com.example.carteiradigital.feature.unidadecurricular.presentation

import androidx.lifecycle.ViewModel
import com.example.carteiradigital.feature.unidadecurricular.presentation.data.repository.FakeUnidadeCurricularRepository
import com.example.carteiradigital.feature.unidadecurricular.presentation.data.repository.UnidadeCurricularRepository

class UnidadeCurricularViewModel(
    private val repository: UnidadeCurricularRepository = FakeUnidadeCurricularRepository()
) : ViewModel() {

}