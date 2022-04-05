package com.example.lab5challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_second extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.lab5challenge.extra.REPLY";
    private Button replychanyeol;
    private Button replybaekhyun;
    private Button replykai;
    private Button replysehun;
    private Button replysuho;
    private Button replychen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replychanyeol = findViewById(R.id.buttonchanyeol);
        replybaekhyun = findViewById(R.id.buttonbaekhyun);
        replykai = findViewById(R.id.buttonkai);
        replysehun = findViewById(R.id.buttonsehun);
        replysuho = findViewById(R.id.buttonsuho);
        replychen = findViewById(R.id.buttonchen);

    }

    public void returnReplychanyeol(View view) {
        String reply = replychanyeol.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplybaekhyun(View view) {
        String reply = replybaekhyun.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplykai(View view) {
        String reply = replykai.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplysehun(View view) {
        String reply = replysehun.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplysuho(View view) {
        String reply = replysuho.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplychen(View view) {
        String reply = replychen.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}

