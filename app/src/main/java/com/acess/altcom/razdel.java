package com.acess.altcom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class razdel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_razdel);
    }
    public void gofood(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void gosome(View v){
        Intent intent = new Intent(this, SecondActivity2.class);
        startActivity(intent);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, ZeroActivity.class);
        startActivity(intent);
    }
    public void godoing(View v){
        Intent intent = new Intent(this, DoingActivity.class);
        startActivity(intent);
    }
    public void gowhere(View v){
        Intent intent = new Intent(this, WhereActivity.class);
        startActivity(intent);
    }
    public void goadd(View v){
        Intent intent = new Intent(this, activity_add.class);
        startActivity(intent);
    }
}