package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;

public class i_peach extends AppCompatActivity {
    private View want_image,wantnt_image;
    private MediaPlayer want_sound,wantnt_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_peach);
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
    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }
    public void peachnext1(View v){
        Intent intent = new Intent(this, i_peach_want.class);
        startActivity(intent);
    }
    public void peachnext2(View v){
        Intent intent = new Intent(this, i_peach_wantnt.class);
        startActivity(intent);
    }

}