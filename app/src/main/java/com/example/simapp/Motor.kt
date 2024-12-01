// Motor.kt
package com.example.simapp

data class Motor(val kapasitasMesin: Int) {
    fun jenisSIM(): String {
        return when {
            kapasitasMesin <= 250 -> "SIM C"
            kapasitasMesin in 251..500 -> "SIM C1"
            kapasitasMesin > 500 -> "SIM C2"
            else -> "Tidak valid"
        }
    }
}
