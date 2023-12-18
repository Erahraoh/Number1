package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {
    private MediaPlayer i_want_fish_sound;
    private View play_image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        play_image = findViewById(R.id.imageView5);

        i_want_fish_sound = MediaPlayer.create(this,R.raw.i_want_fish);

        play_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(i_want_fish_sound);
            }
        });
    }

    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()){
            sound.stop();
        }
        sound.start();
    }
    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }
}