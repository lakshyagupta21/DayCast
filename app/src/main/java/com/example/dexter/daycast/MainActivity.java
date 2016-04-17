package com.example.dexter.daycast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView location, temperature, humidity, weatherStatus, lastUpdated;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format;
        format = new SimpleDateFormat("E MMM dd hh:mm:ss a");
        String time = String.format("Last Updated: "+format.format(calendar.getTime()));

        location = (TextView) findViewById(R.id.location);
        temperature = (TextView) findViewById(R.id.temperature);
        humidity = (TextView) findViewById(R.id.humidity);
        weatherStatus = (TextView) findViewById(R.id.status);
        lastUpdated = (TextView) findViewById(R.id.last_updated);
        lastUpdated.setText(time);

    }
}
