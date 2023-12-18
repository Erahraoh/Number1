package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton i_image;
    private MediaPlayer i_sound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i_image = findViewById(R.id.imageButton3);

        i_sound = MediaPlayer.create(this,R.raw.i);

        i_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            soundPlayButton(i_sound);
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
    public void choose(View v){
        Intent intent = new Intent(this, razdel.class);
        startActivity(intent);
    }


}