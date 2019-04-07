package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chandra.hidayat.tiketsaya.R;

public class SignInActivity extends AppCompatActivity {
    private TextView tvNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        tvNewAccount = findViewById(R.id.tv_create_account);
        tvNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAccount = new Intent(SignInActivity.this,NewAccountActivity.class);
                startActivity(intentNewAccount);
            }
        });
    }
}