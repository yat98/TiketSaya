package com.chandra.hidayat.tiketsaya.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chandra.hidayat.tiketsaya.R;

public class SplashActivity extends AppCompatActivity {
    private String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
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
            Intent intentGetStarted = new Intent(SplashActivity.this, GetStartedActivity.class);
            startActivity(intentGetStarted);
            finish();
        }
    }
}
