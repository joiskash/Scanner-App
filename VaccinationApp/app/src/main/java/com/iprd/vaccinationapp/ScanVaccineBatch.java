package com.iprd.vaccinationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScanVaccineBatch extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_vaccine_batch);
    }
    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        switch (b.getId()) {
            case R.id.login_btn:

                Intent intent = new Intent(ScanVaccineBatch.this, ReadyToScanToday.class);
                startActivity(intent);

                break;

        }
    }
}