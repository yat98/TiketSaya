package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.chandra.hidayat.tiketsaya.R;

public class DetailActivity extends AppCompatActivity {
    private ImageButton btnBack;
    private Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnBack = findViewById(R.id.btn_back);
        btnBuy = findViewById(R.id.btn_buy);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCheckout = new Intent(DetailActivity.this,CheckoutActivity.class);
                startActivity(intentCheckout);
            }
        });
    }
}
