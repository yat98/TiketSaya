package com.chandra.hidayat.tiketsaya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedActivity extends AppCompatActivity {
    private Button btnSignIn,btnNewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btnSignIn = findViewById(R.id.btn_sign_in);
        btnNewAccount = findViewById(R.id.btn_new_account);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignIn = new Intent(GetStartedActivity.this, SignInActivity.class);
                startActivity(intentSignIn);
            }
        });

        btnNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAccount = new Intent(GetStartedActivity.this,NewAccountActivity.class);
                startActivity(intentNewAccount);
            }
        });
    }
}
