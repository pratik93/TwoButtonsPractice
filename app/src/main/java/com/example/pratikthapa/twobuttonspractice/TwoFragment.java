package com.example.pratikthapa.twobuttonspractice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratikthapa on 7/29/17.
 */

public class TwoFragment extends Fragment {
    FragmentListener listener;
    List<String> list=new ArrayList<String>();
    String two;
    Button button2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two,container);
        button2=(Button)view.findViewById(R.id.idButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two=button2.getText().toString();
                list.add(two);
                listener.setResult(list);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        listener=(FragmentListener)context;
        super.onAttach(context);
    }
}
