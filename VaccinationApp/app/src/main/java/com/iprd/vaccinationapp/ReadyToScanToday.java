package com.iprd.vaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ReadyToScanToday extends AppCompatActivity implements View.OnClickListener {

    Button ready_to_vaccine_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ready_to_scan_today);
        ready_to_vaccine_btn = (Button) findViewById(R.id.ready_to_vaccine_btn);
        ready_to_vaccine_btn.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        switch (b.getId()) {
            case R.id.ready_to_vaccine_btn:

                Intent intent = new Intent(ReadyToScanToday.this, AutoCaptureScanner.class);
                startActivity(intent);

                break;

        }
    }
}