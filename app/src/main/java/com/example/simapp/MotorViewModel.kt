// MotorViewModel.kt
package com.example.simapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MotorViewModel : ViewModel() {
    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    fun cekSIM(kapasitasMesin: Int) {
        val motor = Motor(kapasitasMesin)
        _result.value = motor.jenisSIM()
    }
}
