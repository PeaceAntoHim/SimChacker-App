package com.example.simapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MvvmViewModel extends ViewModel {
    private MutableLiveData<String> simType = new MutableLiveData<>();

    public MutableLiveData<String> getSimType() {
        return simType;
    }

    // Method untuk memeriksa jenis SIM berdasarkan cc
    public void checkSim(int cc) {
        if (cc <= 250) {
            simType.setValue("SIM C");  // SIM C untuk motor <= 250cc
        } else if (cc <= 500) {
            simType.setValue("SIM C1"); // SIM C1 untuk motor 251cc - 500cc
        } else {
            simType.setValue("SIM C2"); // SIM C2 untuk motor > 500cc
        }
    }
}
