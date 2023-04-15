package com.example.lagran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void btn2(View view) {
//        Intent intent = new Intent(this,BottomSheetFragment.class);
//        startActivity(intent);
//    }

    public void btnnext(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}