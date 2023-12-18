package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class i_milk_wantnt extends AppCompatActivity {
    private MediaPlayer i_wantnt_milk_sound;
    private View play_image;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_milk_wantnt);

        play_image = findViewById(R.id.imageView5);

        i_wantnt_milk_sound = MediaPlayer.create(this,R.raw.i_wantnt_milk);

        play_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(i_wantnt_milk_sound);
            }
        });
    }

    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }

    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()){
            sound.stop();
        }
        sound.start();
    }
}