package com.example.widgettest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnRotation;
    ImageView imgLollipop;
    int angle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angle+=10;
                imgLollipop.setRotation(angle);
            }
        });
    }
}