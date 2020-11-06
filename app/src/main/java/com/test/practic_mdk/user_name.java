package com.test.practic_mdk;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class user_name extends Fragment{
    public static user_name newInstance(int someInt) {
        user_name catFragment = new user_name();
        Bundle args = new Bundle();
        args.putInt("someInt", someInt);
        catFragment.setArguments(args);
        return catFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_name, container, false);

            ImageView ty = view.findViewById(R.id.fragment_images);
            ty.setImageResource(getArguments().getInt("someInt", 0));
        return view;
    }

}