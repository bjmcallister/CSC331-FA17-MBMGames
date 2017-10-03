package com.example.spencermassey.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

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
    public void display(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint);
        //alter text of textview widget
        tv.setText("Given");

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }
    public void display1(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint1);
        //alter text of textview widget
        tv.setText("Given hint 2");

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

    public void display2(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint2);
        //alter text of textview widget
        tv.setText("Given hint 3");

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

    public void display3(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint3);
        //alter text of textview widget
        tv.setText("Given hint 4");

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }
    public void display4(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint4);
        //alter text of textview widget
        tv.setText("Given hint 5");

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

}

