package com.example.spencermassey.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;
import android.view.KeyEvent;


import static com.example.spencermassey.test.R.id.Answer;
import static com.example.spencermassey.test.R.id.editText;

public class WordLadder extends AppCompatActivity {
    public String hint = "given hint";
    public String hint1 = "given hint 1";
    public String hint2 = "given hint 2";
    public String hint3 = "given hint 3";
    public String hint4 = "given hint 4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_ladder);
        ((EditText)findViewById(R.id.youredittext)).setOnEditorActionListener(
                new EditText.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        if (actionId == EditorInfo.IME_ACTION_SEARCH ||
                                actionId == EditorInfo.IME_ACTION_DONE ||
                                event.getAction() == KeyEvent.ACTION_DOWN &&
                                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                            if (!event.isShiftPressed()) {
                                // the user is done typing.

                                return true; // consume.
                            }
                        }
                        return false; // pass on to other listeners.
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
    public void onClick(View v){
            EditText userInput = (EditText) findViewById(R.id.Answer);
            if(userInput.getText().toString().equals("apple")){
                userInput.setText("Correct");
                userInput.setTextColor(Color.GREEN);
            }
            else {
                userInput.setText("Incorrect");
                userInput.setTextColor(Color.RED);
            }
        }

}

