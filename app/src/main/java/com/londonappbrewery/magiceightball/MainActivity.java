package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_ask = (Button) findViewById(R.id.button_ask);
        final ImageView image = (ImageView) findViewById(R.id.image_ball);
        final int[] img_array ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        button_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random R_number = new Random();
                int my_int = R_number.nextInt(5);
                image.setImageResource(img_array[my_int]);

            }
        });
    }
}
