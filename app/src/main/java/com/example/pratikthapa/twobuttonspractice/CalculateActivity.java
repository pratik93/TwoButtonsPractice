package com.example.pratikthapa.twobuttonspractice;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CalculateActivity extends AppCompatActivity implements FragmentListener{


Button order;

    List<String> listc,listb=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        order=(Button)findViewById(R.id.idOrder);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listb=listc;
                Toast.makeText(CalculateActivity.this, listb+"", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setResult(List<String> list) {
        listc=list;

        Toast.makeText(this, listc+"", Toast.LENGTH_SHORT).show();
    }


}
