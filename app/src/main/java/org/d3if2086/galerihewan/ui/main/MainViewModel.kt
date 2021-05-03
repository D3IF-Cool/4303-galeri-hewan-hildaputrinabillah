package org.d3if2086.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if2086.galerihewan.R
import org.d3if2086.galerihewan.model.Hewan
import org.d3if2086.galerihewan.network.HewanApi

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    init {

    }
    private fun retrieveData() {
        viewModelScope.launch {
            try {

            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
    }
    fun getData(): LiveData<List<Hewan>> = data
}