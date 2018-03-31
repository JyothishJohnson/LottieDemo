package com.jyothishjohnson.lottiedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    boolean play=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lottieAnimationView = findViewById(R.id.animation_view);

        lottieAnimationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!play) {
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    play=true;
                    //Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT).show();
                }
                else{
                    lottieAnimationView.setSpeed(-1);
                    lottieAnimationView.playAnimation();
                    play=false;
                    //Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
