package com.example.spencermassey.test;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper myDBHelper = new DBHelper(this);
        myDBHelper = new DBHelper(this);
        try{
            myDBHelper.createDataBase();
        }catch (IOException ioe){
            throw new Error("Can't create db.");
        }
        try{
            myDBHelper.openDataBase();
        }catch (SQLiteException sqle){
            throw sqle;
        }
    }
    //Switches to Word Jumble
    public void GoToWordJumble(View view)
    {
        Intent nextPage = new Intent(MainActivity.this, WordJumble.class);
        startActivity(nextPage);
    }
    //Switches to Word Ladder
    public void GoToWordLadder(View view)
    {
        Intent nextPage = new Intent(MainActivity.this, WordLadder.class);
        startActivity(nextPage);
    }
}
