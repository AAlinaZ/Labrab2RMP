package com.aalinaz.generatecompliment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGetCompliment = findViewById(R.id.buttonGetCompliment);

        buttonGetCompliment.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ComplimentActivity.class);
            startActivity(intent);
        });
    }
}