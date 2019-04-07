package com.chandra.hidayat.tiketsaya;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SuccessSignUpActivity extends AppCompatActivity {
    public static final String TAG = "SuccessSignUp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_sign_up);
        new TimerAsyncTask().execute();
    }

    private class TimerAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                Log.e(TAG, "doInBackground" + e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent intentGetStarted = new Intent(SuccessSignUpActivity.this, DashboardActivity.class);
            startActivity(intentGetStarted);
            finish();
        }
    }
}
