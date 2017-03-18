package com.example.android.simplemusicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kali);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View view) {

        mediaPlayer.start();
    }

    public void stopMusic(View view) {

        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();

        }

    }

    private void test(){
        int i=0;
        int ii = i+1;
    }
}
