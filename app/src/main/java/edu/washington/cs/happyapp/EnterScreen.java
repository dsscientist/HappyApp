package edu.washington.cs.happyapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnterScreen extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_screen);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openDailyQuotes();
            }
        });

    }

    public void openDailyQuotes(){
        Intent intent = new Intent(this, DailyQuote.class);
        startActivity(intent);
    }
}
