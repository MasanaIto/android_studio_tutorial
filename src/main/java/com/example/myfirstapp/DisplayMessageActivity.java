package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // このアクティビティを開始したインテントを取得し、文字列を抽出する
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // レイアウトのTextViewをキャプチャし、文字列をテキストとして設定する
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}