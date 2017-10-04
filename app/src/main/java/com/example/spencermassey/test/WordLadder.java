package com.example.spencermassey.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;



import static com.example.spencermassey.test.R.id.Answer;
import static com.example.spencermassey.test.R.id.editText;

public class WordLadder extends AppCompatActivity {
    public String hint = "given hint";
    public String hint1 = "given hint 1";
    public String hint2 = "given hint 2";
    public String hint3 = "given hint 3";
    public String hint4 = "given hint 4";
    public String Correct = "Correct";
    public String Incorrect = "Incorrect";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_ladder);
        ((EditText)findViewById(R.id.Answer)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
    /* When focus is lost check that the text field
    * has valid values.
    */
                EditText userInput = (EditText) findViewById(R.id.Answer);
                if (!hasFocus) {
                    if((userInput.getText().toString().equals("apple"))){
                        userInput.setText(Correct);
                        userInput.setTextColor(Color.GREEN);}

                    else if(!((userInput.getText().toString().equals("apple")) || ((userInput.getText().toString().equals("Correct"))))){
                        userInput.setText(Incorrect);
                        userInput.setTextColor(Color.RED);
                    }
                }
            }
        });
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
        tv.setText(hint);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }
    public void display1(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint1);
        //alter text of textview widget
        tv.setText(hint1);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }


    public void display2(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint2);
        //alter text of textview widget
        tv.setText(hint2);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

    public void display3(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint3);
        //alter text of textview widget
        tv.setText(hint3);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }
    public void display4(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint4);
        //alter text of textview widget
        tv.setText(hint4);

        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }
}

