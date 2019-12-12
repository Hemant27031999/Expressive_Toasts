package com.example.expressivetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.expresstoast.MyToast;

public class MainActivity extends AppCompatActivity {

    private Button success;
    private Button failure;
    private Button warning;
    private Button restricted;
    private Button applause;
    private Button custom;
    private Button simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        success = findViewById(R.id.clickme);
        failure = findViewById(R.id.failure);
        warning = findViewById(R.id.warning);
        restricted = findViewById(R.id.notallowed);
        applause = findViewById(R.id.applause);
        custom = findViewById(R.id.custom);
        simple = findViewById(R.id.simple);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.success(MainActivity.this, "Successfully got the message.",Toast.LENGTH_SHORT);
            }
        });

        failure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.failure(MainActivity.this, "Failed to get the message", Toast.LENGTH_SHORT);
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.warning(MainActivity.this, "You are warned not to open this.", Toast.LENGTH_SHORT);
            }
        });

        restricted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.restricted(MainActivity.this, "This is not allowed.", Toast.LENGTH_SHORT);
            }
        });

        applause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.applause(MainActivity.this, "Applause! You have won !!!", Toast.LENGTH_SHORT);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.customToast(MainActivity.this, "Custom toast to set color and sound.","#A88860", R.raw.notallowed, Toast.LENGTH_SHORT);
            }
        });

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyToast.simple(MainActivity.this, "Simple toast with tweek sound.", Toast.LENGTH_SHORT);
            }
        });
    }
}
