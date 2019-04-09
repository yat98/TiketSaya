package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chandra.hidayat.tiketsaya.R;

public class SignInActivity extends AppCompatActivity {
    private TextView tvNewAccount;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        tvNewAccount = findViewById(R.id.tv_create_account);
        btnSignIn = findViewById(R.id.btn_sign_in);

        tvNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAccount = new Intent(SignInActivity.this,NewAccountActivity.class);
                startActivity(intentNewAccount);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDashBoard = new Intent(SignInActivity.this,DashboardActivity.class);
                startActivity(intentDashBoard);
            }
        });
    }
}
