package com.iprd.vaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VaccineRecognize extends AppCompatActivity implements View.OnClickListener {

    Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vaccine_recognized);
//        login_btn = (Button) findViewById(R.id.login_btn);
//        login_btn.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        switch (b.getId()) {
            case R.id.login_btn:

                Intent intent = new Intent(VaccineRecognize.this, ScanVaccineBatch.class);
                startActivity(intent);

                break;

        }
    }
}