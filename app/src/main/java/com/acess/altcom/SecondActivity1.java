package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondActivity1 extends AppCompatActivity {

    private View watermelon_image,rice_image,juice_image, apple_image ;
    private MediaPlayer watermelon_sound,rice_sound, juice_sound, apple_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);




        rice_image = findViewById(R.id.imageView8);
        rice_sound = MediaPlayer.create(this,R.raw.rice);

        juice_image = findViewById(R.id.imageView4);
        juice_sound = MediaPlayer.create(this,R.raw.juice);

        apple_image = findViewById(R.id.imageView7);
        apple_sound = MediaPlayer.create(this,R.raw.apple);

        watermelon_image = findViewById(R.id.imageView6);
        watermelon_sound = MediaPlayer.create(this,R.raw.watermelon);


        watermelon_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(watermelon_sound);
            }
        });
        rice_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(rice_sound);
            }
        });
        juice_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(juice_sound);
            }
        });
        apple_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(apple_sound);
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
        Intent intent = new Intent(this, i_watermelon.class);
        startActivity(intent);
    }
    public void next4(View v){
        Intent intent = new Intent(this, i_juice.class);
        startActivity(intent);
    }
    public void next2(View v){
        Intent intent = new Intent(this, i_rice.class);
        startActivity(intent);
    }
    public void next3(View v){
        Intent intent = new Intent(this, i_apple.class);
        startActivity(intent);
    }

    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }
    public void page2(View v) {
        Intent intent = new Intent(this, SecondActivity3.class);
        startActivity(intent);
    }
    public void page0(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}