package com.example.androidform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class tampil extends AppCompatActivity {

    TextView name,nim,score;
    String get_name, get_nim, score_value;
    Double get_score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        name = findViewById(R.id.viewName);
        nim = findViewById(R.id.viewNIM);
        score = findViewById(R.id.viewScore);

        Bundle b = getIntent().getExtras();
        get_name = b.getString("parse_name");
        get_nim = b.getString("parse_nim");
        get_score = Double.parseDouble(b.getString("parse_score"));

        if (get_score <= 4 && get_score > 3.66){
            score_value = "A";
        }else if (get_score <= 3.66 && get_score > 3.33){
            score_value = "A-";
        }else if (get_score <= 3.33 && get_score > 3){
            score_value = "B+";
        }else if (get_score <= 3 && get_score > 2.66){
            score_value = "B";
        }else if (get_score <= 2.66 && get_score > 2.33){
            score_value = "B-";
        }else if (get_score <= 2.33 && get_score > 2){
            score_value = "C+";
        }else if (get_score <= 2 && get_score > 1.66){
            score_value = "C";
        }else if (get_score <= 1.66 && get_score > 1.33){
            score_value = "C-";
        }else if (get_score <= 1.33 && get_score > 1){
            score_value = "D+";
        }else if (get_score == 1){
            score_value = "D";
        }else{
            score_value = "Input Salah";
        }

        name.setText(get_name);
        nim.setText(get_nim);
        score.setText(score_value);
    }
}