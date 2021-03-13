package com.hfad.buttonsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.button);
        //two = findViewById(R.id.button2);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sirensound);
        final MediaPlayer sp = MediaPlayer.create(this, R.raw.nochange);

        ToggleButton toggle = findViewById(R.id.toggle_button);
        toggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                one.setOnClickListener(view -> mp.start());
            } else {
                one.setOnClickListener(view -> sp.start());
            }
        });
    }

}