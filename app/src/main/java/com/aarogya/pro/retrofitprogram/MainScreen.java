package com.aarogya.pro.retrofitprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ArrayList<String> values=new ArrayList<String>();
        String newValue = ",";
        values.add("name");
        values.add("name");
        values.add("vikas");
        values.add("yadav");
        values.add("Ram");
        values.add("yadav");
// repeated additions:
        if (!values.contains(newValue)) {
            values.add(newValue);
        }
        Log.e("values",""+values);
    }
}
