package com.example.carteiradigital.feature.unidadecurricular.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carteiradigital.feature.unidadecurricular.presentation.data.repository.FakeUnidadeCurricularRepository
import com.example.carteiradigital.feature.unidadecurricular.presentation.data.repository.UnidadeCurricularRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UnidadeCurricularViewModel(
    private val repository: UnidadeCurricularRepository = FakeUnidadeCurricularRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(UnidadeCurricularUIState())
    val uiState: StateFlow<UnidadeCurricularUIState> = _uiState.asStateFlow()

    init {
        carregarDados()
    }

    private fun carregarDados() {
        _uiState.value = _uiState.value.copy(isLoading = true)

        viewModelScope.launch {
            val result = repository.buscarUnidadesCurriculares()
            if (result.isSuccess) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    unidadesCurriculares = result.getOrDefault(emptyList())
                )
            } else {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    errorMessage = "Erro ao carregar os dados"
                )
            }
        }
    }
}