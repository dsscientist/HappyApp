package edu.washington.cs.happyapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class SettingsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_screen);

        Switch soundSwitch = (Switch) findViewById(R.id.switch1);
        Switch musicSwitch = (Switch) findViewById(R.id.switch2);
        Switch notifSwitch = (Switch) findViewById(R.id.switch3);
        Switch fbSwitch = (Switch) findViewById(R.id.switch4);
        Button colorButton = (Button) findViewById(R.id.button2);
        colorButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    public void goToHome() {
        startActivity(new Intent(this, EnterScreen.class));
    }

    public void changeColor() {
        View v = this.getWindow().getDecorView();
        Random r = new Random();
        v.setBackgroundColor(Color.rgb(200+ r.nextInt(30),
                                     200+ r.nextInt(30),
                                      200 + r.nextInt(30)));
    }
}
