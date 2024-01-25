package com.example.demociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView welcomeTextView = findViewById(R.id.textViewSec2);
        String username = getIntent().getStringExtra("USERNAME");

        welcomeTextView.setText(username);
    }



    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume en MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause en MainActivity", Toast.LENGTH_SHORT).show();
    }

}