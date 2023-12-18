package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class i_apple extends AppCompatActivity {

    private View want_image,wantnt_image;
    private MediaPlayer want_sound,wantnt_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_apple);

        want_image = findViewById(R.id.imageView);
        want_sound = MediaPlayer.create(this, R.raw.want);

        wantnt_image = findViewById(R.id.imageView3);
        wantnt_sound = MediaPlayer.create(this, R.raw.wantnt);

        want_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(want_sound);
            }
        });
        wantnt_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(wantnt_sound);
            }
        });
    }
    private void soundPlayButton(MediaPlayer sound) {
        if(sound.isPlaying()){
            sound.stop();
        }
        sound.start();
    }
    public void applenext1(View v){
        Intent intent = new Intent(this, i_apple_want.class);
        startActivity(intent);
    }
    public void applenext2(View v){
        Intent intent = new Intent(this, i_apple_wantnt.class);
        startActivity(intent);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }
}