package com.iprd.vaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AutoCaptureScanner extends AppCompatActivity implements View.OnClickListener{

    Button auto_capture_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_capture_scanner);
        auto_capture_btn = (Button) findViewById(R.id.auto_capture_btn);
        auto_capture_btn.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        switch (b.getId()) {
            case R.id.auto_capture_btn:

                Intent intent = new Intent(AutoCaptureScanner.this, VaccineRecognize.class);
                startActivity(intent);

                break;

        }
    }
}