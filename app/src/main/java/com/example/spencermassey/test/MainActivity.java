package com.example.spencermassey.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void GoToWordJumble(View view)
    {
        Intent nextPage = new Intent(MainActivity.this, WordJumble.class);
        startActivity(nextPage);
    }
    public void GoToWordLadder(View view)
    {
        Intent nextPage = new Intent(MainActivity.this, WordLadder.class);
        startActivity(nextPage);
    }
}
