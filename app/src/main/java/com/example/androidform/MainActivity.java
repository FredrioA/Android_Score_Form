package com.example.androidform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String var_name, var_nim, var_score;
    EditText name, nim, score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view){
        name = findViewById(R.id.txName);
        nim = findViewById(R.id.txNIM);
        score = findViewById(R.id.txScore);

        Button submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener((v)->{
            var_name = name.getText().toString();
            var_nim = nim.getText().toString();
            var_score = score.getText().toString();
            Intent i = new Intent(MainActivity.this, tampil.class);
            Bundle b = new Bundle();
            b.putString("parse_name", var_name);
            b.putString("parse_nim", var_nim);
            b.putString("parse_score", var_score);

            i.putExtras(b);
            startActivity(i);
        });
    }
}