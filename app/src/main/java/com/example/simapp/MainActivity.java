package com.example.simapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.xml.activity_main);

        Button btnMvc = findViewById(R.id.btnMvc);
        Button btnMvvm = findViewById(R.id.btnMvvm);

        // Tombol untuk menuju ke halaman MVC
        btnMvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MvcActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk menuju ke halaman MVVM
        btnMvvm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MvvmActivity.class);
                startActivity(intent);
            }
        });
    }
}
