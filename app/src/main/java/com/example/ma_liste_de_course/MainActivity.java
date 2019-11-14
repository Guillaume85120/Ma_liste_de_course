package com.example.ma_liste_de_course;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Liste de courses";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        @Override
        protected void onStart() {
            super.onStart();
            Log.i(TAG, "on start" + getLocalClassName());
        }


        @Override
        protected void onStop() {
            super.onStop();
            Log.i(TAG, "on start" + getLocalClassName());
        }


        @Override
        protected void onPause() {
            super.onPause();
            Log.i(TAG, "on Pause" + getLocalClassName());
        }


        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i(TAG, "on Destroy" + getLocalClassName());
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i(TAG, "on Pause" + getLocalClassName());
        }


    }
}
