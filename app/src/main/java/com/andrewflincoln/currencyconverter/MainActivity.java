package com.andrewflincoln.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void convertFunction(View view) {
        EditText editTextPounds = (EditText) findViewById(R.id.editTextPounds);

        double pounds = Double.parseDouble(editTextPounds.getText().toString());
        double dollars = pounds * 1.3;

        Log.i("Info", "Pounds: " + pounds);
        Log.i("Info", "Dollars: " + dollars);

        Toast.makeText(this, pounds + " pounds = " + dollars + " dollars.", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}