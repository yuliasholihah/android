package com.example.audioplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button Play, Pause, Stop;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Play = findViewById(R.id.play);
        Pause = findViewById(R.id.pause);
        Stop = findViewById(R.id.stop);

        Play.setOnClickListener((View.OnClickListener) this);
        Pause.setOnClickListener((View.OnClickListener) this);
        Stop.setOnClickListener((View.OnClickListener) this);

        stateAwal();
    }

    private void stateAwal() {
        Play.setEnabled(true);
        Pause.setEnabled(false);
        Stop.setEnabled(false);

    }
    private void  playAudio(){

        mediaPlayer = MediaPlayer.create(this, R.raw.amigdala);


        Play.setEnabled(false);
        Pause.setEnabled(true);
        Stop.setEnabled(true);


        try{
            mediaPlayer.prepare();
        }catch (IllegalStateException ex){
            ex.printStackTrace();
        }catch (IOException ex1){
            ex1.printStackTrace();
        }
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
    private void  pauseAudio(){
        if(mediaPlayer.isPlaying()){
            if(mediaPlayer != null){
                mediaPlayer.pause();
                Pause.setText("Lanjutkan");
            }
        }else {


            if(mediaPlayer != null){
                mediaPlayer.start();
                Pause.setText("Pause");
            }
        }
    }
    private void stopAudio(){
        mediaPlayer.stop();
        try {
            //Menyetel audio ke status awal
            mediaPlayer.prepare();
            mediaPlayer.seekTo(0);
        }catch (Throwable t){
            t.printStackTrace();
        }
        stateAwal();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                playAudio();
                break;

            case R.id.pause:
                pauseAudio();
                break;

            case R.id.stop:
                stopAudio();
                break;
        }
    }
}







