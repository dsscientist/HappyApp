package edu.washington.cs.happyapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DailyQuote extends AppCompatActivity {

    TextView textView;
    //Button b1;
    int rand;
    String[] quote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_quote);

        //Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        textView = (TextView)findViewById(R.id.textView);
        quote = getResources().getStringArray(R.array.quote);
        random();
        Button b1 = (Button) findViewById(R.id.buttonSet);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openSetting();
            }
        });

        Button b2 = (Button) findViewById(R.id.buttonGame);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openGame();
            }
        });

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.song1);
        mediaPlayer.setLooping(true);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }


    public void random(){
        rand = (int)(Math.random()* quote.length);
        textView.setText(quote[rand]);
    }

    public void clickNext(View v){
        random();
    }

    public void openSetting(){
        Intent intent = new Intent(this, SettingsScreen.class);
        startActivity(intent);
    }

    public void openGame(){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }

}
