package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.chandra.hidayat.tiketsaya.R;

public class SuccessBuyTicketActivity extends AppCompatActivity {
    private Button btnDashboard, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_buy_ticket);
        btnDashboard = findViewById(R.id.btn_dashboard);
        btnProfile = findViewById(R.id.btn_profile);
        btnDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDashboard = new Intent(SuccessBuyTicketActivity.this, DashboardActivity.class);
                startActivity(intentDashboard);
            }
        });
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProfile = new Intent(SuccessBuyTicketActivity.this, ProfileActivity.class);
                startActivity(intentProfile);
            }
        });
    }
}
