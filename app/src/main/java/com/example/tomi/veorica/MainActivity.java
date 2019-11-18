package com.example.tomi.veorica;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer autisti = MediaPlayer.create(this, R.raw.autisti);
        final MediaPlayer frica = MediaPlayer.create(this,R.raw.frica);
        final MediaPlayer imagine = MediaPlayer.create(this,R.raw.imagine);
        final MediaPlayer democratia = MediaPlayer.create(this,R.raw.democatie);
        final MediaPlayer preventie = MediaPlayer.create(this,R.raw.preventie);
        final MediaPlayer anteprescolar = MediaPlayer.create(this,R.raw.anteprescolar);
        final MediaPlayer boing = MediaPlayer.create(this,R.raw.boing);
        final MediaPlayer calemitati = MediaPlayer.create(this,R.raw.calemitati);

        Button playimagine = (Button) this.findViewById(R.id.imagine);
        Button playdemocratia = (Button) this.findViewById(R.id.democarie);
        Button playpreventie = (Button) this.findViewById(R.id.preventie);
        Button playanteprescolar = (Button) this.findViewById(R.id.anteprescolar);
        Button playboing = (Button) this.findViewById(R.id.boing);
        Button playcalemitati = (Button) this.findViewById(R.id.calemitati);
        Button playautisti = (Button) this.findViewById(R.id.autisti);
        Button playfrica = (Button) this.findViewById(R.id.frica);
        playimagine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagine.start();
            }
        });
        playdemocratia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                democratia.start();
            }
        });
        playpreventie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preventie.start();
            }
        });
        playanteprescolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anteprescolar.start();
            }
        });
        playboing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boing.start();
            }
        });
        playcalemitati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calemitati.start();
            }
        });
        playautisti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                autisti.start();
            }
        });
        playfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frica.start();
            }
        });

    }
}