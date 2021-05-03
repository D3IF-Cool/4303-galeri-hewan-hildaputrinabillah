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

    private val status = MutableLiveData<HewanApi.ApiStatus>()

    private val data = MutableLiveData<List<Hewan>>()
    init {

    }
    private fun retrieveData() {
        viewModelScope.launch {
            status.value = HewanApi.ApiStatus.LOADING
            try {
                status.value = HewanApi.ApiStatus.SUCCESS

            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
                status.value = HewanApi.ApiStatus.FAILED
            }
        }
    }
    fun getData(): LiveData<List<Hewan>> = data
    fun getStatus(): LiveData<HewanApi.ApiStatus> = status
}