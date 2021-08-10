package com.example.orientationdetectionudemy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //landscape oriented
            Toast.makeText(this, "Landscape on", Toast.LENGTH_SHORT).show();
        } else {
            //portrait oriented
            Toast.makeText(this, "Portrait on", Toast.LENGTH_SHORT).show();
        }
    }
}