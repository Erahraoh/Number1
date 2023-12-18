package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private View milk_image,fish_image,kiwi_image, meat_image ;
    private MediaPlayer milk_sound,fish_sound, kiwi_sound, meat_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




        kiwi_image = findViewById(R.id.imageView8);
        kiwi_sound = MediaPlayer.create(this,R.raw.kiwi);

        meat_image = findViewById(R.id.imageView7);
        meat_sound = MediaPlayer.create(this,R.raw.meat);

        fish_image = findViewById(R.id.imageView6);
        fish_sound = MediaPlayer.create(this,R.raw.fish);

        milk_image = findViewById(R.id.imageView4);
        milk_sound = MediaPlayer.create(this,R.raw.milk);


        milk_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(milk_sound);
            }
        });
        fish_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(fish_sound);
            }
        });
        kiwi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(kiwi_sound);
            }
        });
        meat_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(meat_sound);
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
    public void page1(View v) {
        Intent intent = new Intent(this, SecondActivity1.class);
        startActivity(intent);
    }
    public void page0(View v) {
        Intent intent = new Intent(this, SecondActivity3.class);
        startActivity(intent);
    }

}