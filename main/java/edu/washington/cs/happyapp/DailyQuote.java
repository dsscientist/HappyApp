package edu.washington.cs.happyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

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
    }


    public void random(){
        rand = (int)(Math.random()* quote.length);
        textView.setText(quote[rand]);
    }

    public void clickNext(View v){
        random();
    }

}
