package com.meng.hlinjue.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutmeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    } // main method

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.elephant);
                mediaPlayer.start();

            }//onclick
        });
    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);
    }
} // Main class !!
