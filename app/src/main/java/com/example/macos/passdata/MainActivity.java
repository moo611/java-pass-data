package com.example.macos.passdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn;

    int a=100;
    String b="hello world";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn=findViewById(R.id.button);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                  Intent i=new Intent(MainActivity.this,Main2Activity.class);
                  //pass  data
                  i.putExtra("DATA",a);
                  i.putExtra("DATA2",b);

                  startActivity(i);



             }
         });



    }
}
