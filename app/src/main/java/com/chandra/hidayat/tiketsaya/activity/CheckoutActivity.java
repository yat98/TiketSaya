package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.chandra.hidayat.tiketsaya.R;

public class CheckoutActivity extends AppCompatActivity {
    private ImageButton btnBack;
    private Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        btnBack = findViewById(R.id.btn_back);
        btnPay = findViewById(R.id.btn_pay);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSuccess = new Intent(CheckoutActivity.this, SuccessBuyTicketActivity.class);
                startActivity(intentSuccess);
            }
        });
    }
}
