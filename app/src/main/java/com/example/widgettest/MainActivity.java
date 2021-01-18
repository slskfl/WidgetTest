package com.example.widgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    EditText edMemo;
    TextView tvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edMemo=findViewById(R.id.edtmemo);
        tvCount=findViewById(R.id.tvCount);

        TextWatcher watcher=new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //텍스트가 바뀔 때마다.
                byte[] bytes=null;
                try{
                    //KSC5601>> 한글, 한글은 한글자가 2바이트.
                    bytes=s.toString().getBytes("KSC5601");
                    int strCount=bytes.length;
                    tvCount.setText(strCount+"/80 바이트");
                }catch (UnsupportedEncodingException e){

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        edMemo.addTextChangedListener(watcher);
    }
}