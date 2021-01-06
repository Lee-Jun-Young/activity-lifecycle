package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SubActivity extends AppCompatActivity {
    public static final String TAG = "Test!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "SubActivity onCreate 실행");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "SubActivity onRestart 실행");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "SubActivity onResume 실행");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "SubActivity onStop 실행");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "SubActivity onPause 실행");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "SubActivity onStart 실행");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "SubActivity onDestroy 실행");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.v(TAG, "SubActivity onSaveInstanceState 실행");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        Log.v(TAG, "SubActivity onRestoreInstanceState 실행");
        super.onRestoreInstanceState(saveInstanceState);
    }

}