package com.example.simapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MvvmActivity extends AppCompatActivity {

    private MvvmViewModel mvvmViewModel;
    private EditText ccInput;
    private Button checkButton;
    private TextView simTypeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.activity_mvvm); // Pastikan nama layout sesuai

        // Inisialisasi ViewModel
        mvvmViewModel = new ViewModelProvider(this).get(MvvmViewModel.class);

        // Inisialisasi elemen UI
        ccInput = findViewById(R.id.ccInput); // Pastikan ID ini sesuai dengan layout XML
        checkButton = findViewById(R.id.checkButton); // Pastikan ID ini sesuai dengan layout XML
        simTypeText = findViewById(R.id.simTypeText); // Pastikan ID ini sesuai dengan layout XML

        // Mengamati perubahan data pada ViewModel
        mvvmViewModel.getSimType().observe(this, simType -> {
            simTypeText.setText(simType);
        });

        // Mengatur tombol untuk memeriksa SIM
        checkButton.setOnClickListener(view -> {
            String ccStr = ccInput.getText().toString();
            if (!ccStr.isEmpty()) {
                int cc = Integer.parseInt(ccStr);
                mvvmViewModel.checkSim(cc);
            }
        });
    }
}
