package com.test.practic_mdk;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class toolbar extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_toolbar, container, false);
        ImageButton button1 = (ImageButton) view.findViewById(R.id.home);
        ImageButton button2 = (ImageButton) view.findViewById(R.id.users);
        ImageButton button3 = (ImageButton) view.findViewById(R.id.camera);
        ImageButton button4 = (ImageButton) view.findViewById(R.id.colors);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        return view;
    }


    public void onClick(View v){
        if (v.getId()==R.id.home){
            Intent intent = new Intent(getActivity(),MainActivity.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.camera){
            Intent intent = new Intent(getActivity(),camera.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.users){
            Intent intent = new Intent(getActivity(),user.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.colors){
            Intent intent = new Intent(getActivity(),galerea.class);
            startActivity(intent);
        }


    }


}