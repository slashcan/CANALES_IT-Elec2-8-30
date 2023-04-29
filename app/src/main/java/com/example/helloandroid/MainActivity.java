package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new MyDatabaseHelper(this);

        dbHelper.deleteAllData();

        dbHelper.insertData("John", 25);
        dbHelper.insertData("Luke", 24);

        getData();

        dbHelper.updateData(2, "Mark", 26);

        getData();

        dbHelper.deleteData(2);

        getData();

        SharedPreferences prefs = getSharedPreferences("my_prefs", MODE_PRIVATE);




    }
}