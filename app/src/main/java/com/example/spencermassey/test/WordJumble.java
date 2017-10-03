package com.example.spencermassey.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WordJumble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jumble);
    }

        public void GoHome(View view)
    {
        Intent nextPage = new Intent(WordJumble.this, MainActivity.class);
        startActivity(nextPage);
    }

}
