package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {
    private View phone_image,cat_image,tail_image, toy_image ;
    private MediaPlayer phone_sound,cat_sound, tail_sound, toy_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        phone_image = findViewById(R.id.imageView4);
        phone_sound = MediaPlayer.create(this,R.raw.phone);

        cat_image = findViewById(R.id.imageView8);
        cat_sound = MediaPlayer.create(this,R.raw.cat);

        tail_image = findViewById(R.id.imageView7);
        tail_sound = MediaPlayer.create(this,R.raw.tail);

        toy_image = findViewById(R.id.imageView6);
        toy_sound = MediaPlayer.create(this,R.raw.toy);


        phone_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(phone_sound);
            }
        });
        cat_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(cat_sound);
            }
        });
        tail_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(tail_sound);
            }
        });
        toy_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(toy_sound);
            }
        });
    }
    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()){
            sound.stop();
        }
        sound.start();
    }
    public void next(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
    public void next4(View v){
        Intent intent = new Intent(this, i_milk.class);
        startActivity(intent);
    }
    public void next2(View v){
        Intent intent = new Intent(this, i_kiwi.class);
        startActivity(intent);
    }
    public void next3(View v){
        Intent intent = new Intent(this, i_meat.class);
        startActivity(intent);
    }

    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }


}