package com.example.spencermassey.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class WordLadder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_ladder);
    }

        public void GoHome(View view)
    {
        Intent nextPage = new Intent(WordLadder.this, MainActivity.class);
        startActivity(nextPage);
    }

}
