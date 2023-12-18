package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondActivity3 extends AppCompatActivity {
    private View peach_image,tomato_image,ougut_image, banana_image ;
    private MediaPlayer peach_sound,tomato_sound, ougut_sound, banana_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second3);
        peach_image = findViewById(R.id.imageView4);
        peach_sound = MediaPlayer.create(this,R.raw.peach);

        tomato_image = findViewById(R.id.imageView8);
        tomato_sound = MediaPlayer.create(this,R.raw.tomato);

        ougut_image = findViewById(R.id.imageView7);
        ougut_sound = MediaPlayer.create(this,R.raw.ougut);

        banana_image = findViewById(R.id.imageView6);
        banana_sound = MediaPlayer.create(this,R.raw.banana);


        peach_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(peach_sound);
            }
        });
        tomato_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(tomato_sound);
            }
        });
        ougut_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(ougut_sound);
            }
        });
        banana_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(banana_sound);
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
    public void page2(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void page0(View v) {
        Intent intent = new Intent(this, SecondActivity1.class);
        startActivity(intent);
    }

}