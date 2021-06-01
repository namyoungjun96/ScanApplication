package com.example.exampleproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ScanActivity extends AppCompatActivity {
    private ImageButton scanQRBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        scanQRBtn = (ImageButton) findViewById(R.id.scanQRBtn);

        scanQRBtn.setOnClickListener(v -> {
            Intent intent = new Intent(ScanActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}