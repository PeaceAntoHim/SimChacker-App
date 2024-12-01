package com.example.simapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MvcActivity extends AppCompatActivity {
    private EditText editTextCC;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.activity_mvc);
        editTextCC = findViewById(R.id.editTextCC);
        resultText = findViewById(R.id.resultText);
    }

    public void checkSim(View view) {
        String ccValue = editTextCC.getText().toString();
        String result = "SIM yang diperlukan: ";

        try {
            int cc = Integer.parseInt(ccValue);
            if (cc <= 250) {
                result += "SIM C";
            } else if (cc <= 500) {
                result += "SIM C1";
            } else {
                result += "SIM C2";
            }
        } catch (NumberFormatException e) {
            result = "Input tidak valid!";
        }

        resultText.setText(result);
    }
}
