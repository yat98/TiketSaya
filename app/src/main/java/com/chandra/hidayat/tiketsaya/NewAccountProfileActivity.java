package com.chandra.hidayat.tiketsaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NewAccountProfileActivity extends AppCompatActivity {
    private ImageButton btnBack;
    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account_profile);

        btnBack = findViewById(R.id.btn_back);
        btnContinue = findViewById(R.id.btn_continue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSuccessSignUp = new Intent(NewAccountProfileActivity.this, SuccessSignUpActivity.class);
                startActivity(intentSuccessSignUp);
            }
        });
    }
}
