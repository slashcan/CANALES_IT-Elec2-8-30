package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private Spinner spinnerRobot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinnerRobot = findViewById(R.id.spinner2);

        String[] robot = getResources().getStringArray(R.array.robot);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, robot);
        spinnerRobot.setAdapter(adapter);


    }
}