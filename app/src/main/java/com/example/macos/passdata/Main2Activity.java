package com.example.macos.passdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    TextView tv,tv2;
    int data;
    String data2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);


        //get int data
        data=getIntent().getIntExtra("DATA",0);
        tv.setText(String.valueOf(data));

        //get string data
        data2=getIntent().getStringExtra("DATA2");
        tv2.setText(data2);



    }
}
