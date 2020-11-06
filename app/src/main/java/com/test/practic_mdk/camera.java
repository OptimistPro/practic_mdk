package com.test.practic_mdk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class camera extends AppCompatActivity implements OnTouchListener{

    float fromPosition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        ConstraintLayout tv = findViewById(R.id.fon);
        tv.setOnTouchListener(this);
        setContentView(tv);

    }

    public boolean onTouch(View view, MotionEvent event)
    {
        if (event.getAction()==MotionEvent.ACTION_DOWN){
            fromPosition = event.getX();
        }
        if (event.getAction()==MotionEvent.ACTION_UP){
            float toPosition = event.getX();
            if (fromPosition > toPosition){
                Intent intent = new Intent(camera.this,galerea.class);
                startActivity(intent);
            }

        }
        return true;
    }
}