package com.example.imagespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.imgspinner.AutoPlayManager;
import com.example.imgspinner.ImageIndicatorView;


public class MainActivity extends AppCompatActivity {
    ImageIndicatorView imageIndicatorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageIndicatorView = (ImageIndicatorView) findViewById(R.id.indicate_view);
        final Integer[] resArray = new Integer[] { R.drawable.a, R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e };
        imageIndicatorView.setupLayoutByDrawable(resArray);
        imageIndicatorView.setIndicateStyle(ImageIndicatorView.INDICATE_ARROW_ROUND_STYLE);
        imageIndicatorView.show();

        /*auto paly*/
        AutoPlayManager autoBrocastManager =  new AutoPlayManager(imageIndicatorView);
        autoBrocastManager.setBroadcastEnable(true);
        autoBrocastManager.setBroadCastTimes(5);//loop times
        autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//set first play time and interval
        autoBrocastManager.loop();
    }
}
