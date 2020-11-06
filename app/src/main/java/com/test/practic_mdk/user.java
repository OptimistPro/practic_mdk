package com.test.practic_mdk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        user_name catFragment = user_name.newInstance(R.drawable.images1);
        ft.add(R.id.one, catFragment);
        user_name catFragment2 = user_name.newInstance(R.drawable.images2);
        ft.add(R.id.two, catFragment2);
        user_name catFragment3 = user_name.newInstance(R.drawable.images3);
        ft.add(R.id.three, catFragment3);
        user_name catFragment4 = user_name.newInstance(R.drawable.images4);
        ft.add(R.id.four, catFragment4);
        user_name catFragment5 = user_name.newInstance(R.drawable.images5);
        ft.add(R.id.five, catFragment5);
        ft.commit();

    }



}