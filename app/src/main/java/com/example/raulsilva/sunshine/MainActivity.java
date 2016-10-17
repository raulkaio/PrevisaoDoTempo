package com.example.raulsilva.sunshine;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public static int backgroundColor = Color.rgb(244, 244, 244);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        /*ActionBar actionBar = getSupportActionBar();
        getActionBar().setDisplayShowCustomEnabled(true);
        getActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME | ActionBar.DISPLAY_SHOW_TITLE);
        // Make sure that you are using android.support.v7.app.ActionBar;
        getActionBar().setLogo(R.mipmap.ic_launcher);
        getActionBar().setDisplayUseLogoEnabled(true);*/
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
