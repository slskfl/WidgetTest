package com.example.widgettest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEnabled, chkRotation;
    Button btnMsg;
    ImageView ivPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkEnabled=findViewById(R.id.chkEnabled);
        chkRotation=findViewById(R.id.chkRotation);
        btnMsg=findViewById(R.id.btnMsg);
        ivPet=findViewById(R.id.ivCat);

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "안녕하세요!", Toast.LENGTH_LONG).show();
            }
        });

        chkEnabled.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    btnMsg.setEnabled(true);
                } else{
                    btnMsg.setEnabled(false);
                }
            }
        });

        chkRotation.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    ivPet.setRotation(45);
                }else {
                    ivPet.setRotation(0);
                }
            }
        });


    }
}