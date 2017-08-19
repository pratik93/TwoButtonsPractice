package com.example.pratikthapa.twobuttonspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;
    List<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==button1.getId()){

                    String btn1=button1.getText().toString();
//                    Toast.makeText(MainActivity.this, btn1+"", Toast.LENGTH_SHORT).show();
                    list.add(btn1);
                }
            }
        });
        button2=(Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==button2.getId()){

                    String btn2=button2.getText().toString();
//                    Toast.makeText(MainActivity.this, btn2+"", Toast.LENGTH_SHORT).show();
                    list.add(btn2);

                }

            }
        });
        button3=(Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==button3.getId()){

                    Toast.makeText(MainActivity.this, list+ "", Toast.LENGTH_SHORT).show();

                }

            }
        });
//        for(String x:list) {
//            Toast.makeText(MainActivity.this, x+ "", Toast.LENGTH_SHORT).show();
//        }
    }

}
