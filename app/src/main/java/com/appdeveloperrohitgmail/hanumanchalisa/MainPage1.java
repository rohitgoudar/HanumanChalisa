package com.appdeveloperrohitgmail.hanumanchalisa;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainPage1 extends AppCompatActivity {
    MediaPlayer a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage1);
        a = MediaPlayer.create(this, R.raw.shree_hanuman_chalisa);
    }

    public void play(View view) {
        if (a.isPlaying()) {
            a.pause();
        } else {
            a.start();
        }
    }
    public void Meaning(View view) {
        if (a.isPlaying()) {
            a.pause();
        }
        startActivity(new Intent(MainPage1.this, MainPage2.class));
        finish();
    }
}
