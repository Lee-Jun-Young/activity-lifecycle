package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Test!!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "MainActivity onCreate 실행");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_next).setOnClickListener(view ->
                startActivity(new Intent(MainActivity.this, SubActivity.class))
        );
    }

    @Override
    protected void onRestart() {
        Log.v(TAG, "MainActivity onRestart 실행");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.v(TAG, "MainActivity onResume 실행");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "MainActivity onStop 실행");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "MainActivity onPause 실행");
        super.onPause();
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "MainActivity onStart 실행");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "MainActivity onDestroy 실행");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.v(TAG, "MainActivity onSaveInstanceState 실행");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle saveInstanceState) {
        Log.v(TAG, "MainActivity onRestoreInstanceState 실행");
        super.onRestoreInstanceState(saveInstanceState);
    }

}