package com.example.spencermassey.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;



import static com.example.spencermassey.test.R.id.Answer;
import static com.example.spencermassey.test.R.id.editText;

public class WordLadder extends AppCompatActivity {
    public String hint = "A person who has authority over others";
    public String hint1 = "The rendered fat of hogs";
    public String hint2 = "Any part of the earth's surface not covered by water";
    public String hint3 = "Part of a highway large enough for one vehicle";
    public String hint4 = "A stick or short staff used to assist one in walking";

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_ladder);

        Button mShowDialog = (Button) findViewById(R.id.check);
        mShowDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (count >= 5) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(WordLadder.this);
                    mBuilder.setIcon(android.R.drawable.sym_def_app_icon);
                    mBuilder.setTitle(R.string.Con);
                    mBuilder.setMessage(R.string.winner);

                    mBuilder.setPositiveButton("Return", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog alertDialog = mBuilder.create();
                    alertDialog.show();
                }
                if (count != 5) {
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(WordLadder.this);
                    mBuilder.setIcon(android.R.drawable.sym_def_app_icon);
                    mBuilder.setTitle(R.string.wrong);
                    mBuilder.setMessage(R.string.incor);

                    mBuilder.setNegativeButton("Return", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog alertDialog = mBuilder.create();
                    alertDialog.show();
                }
            }
        });




            ((EditText) findViewById(R.id.Answer)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    EditText userInput = (EditText) findViewById(R.id.Answer);
                    if (!hasFocus) {
                        if ((userInput.getText().toString().equals("lord"))) {
                            userInput.setTextColor(Color.GREEN);
                            count++;
                        }
                    }
                }
            });


            ((EditText) findViewById(R.id.Answer1)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    EditText userInput = (EditText) findViewById(R.id.Answer1);
                    if (!hasFocus) {
                        if ((userInput.getText().toString().equals("lard"))) {
                            userInput.setTextColor(Color.GREEN);
                            count++;
                        }
                    }
                }
            });
            ((EditText) findViewById(R.id.Answer2)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

                @Override
                public void onFocusChange(View v, boolean hasFocus) {
    /* When focus is lost check that the text field
    * has valid values.
    */
                    EditText userInput = (EditText) findViewById(R.id.Answer2);
                    if (!hasFocus) {
                        if ((userInput.getText().toString().equals("land"))) {
                            userInput.setTextColor(Color.GREEN);
                            count++;
                        }
                    }
                }
            });
            ((EditText) findViewById(R.id.Answer3)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

                @Override
                public void onFocusChange(View v, boolean hasFocus) {
    /* When focus is lost check that the text field
    * has valid values.
    */
                    EditText userInput = (EditText) findViewById(R.id.Answer3);
                    if (!hasFocus) {
                        if ((userInput.getText().toString().equals("lane"))) {
                            userInput.setTextColor(Color.GREEN);
                            count++;
                        }
                    }
                }
            });
            ((EditText) findViewById(R.id.Answer4)).setOnFocusChangeListener(new View.OnFocusChangeListener() {

                @Override
                public void onFocusChange(View v, boolean hasFocus) {
    /* When focus is lost check that the text field
    * has valid values.
    */
                    EditText userInput = (EditText) findViewById(R.id.Answer4);
                    if (!hasFocus) {
                        if ((userInput.getText().toString().equals("cane"))) {
                            userInput.setTextColor(Color.GREEN);
                            count++;
                        }
                    }
                }
            });

    }
    public void Restart(){
        this.recreate();
    }

    public void Reset(View v){
        EditText Answer=(EditText) findViewById(R.id.Answer);
        Answer.setText(R.string.blank);
        EditText Answer1=(EditText) findViewById(R.id.Answer1);
        Answer1.setText(R.string.blank);
        EditText Answer2=(EditText) findViewById(R.id.Answer2);
        Answer2.setText(R.string.blank);
        EditText Answer3=(EditText) findViewById(R.id.Answer3);
        Answer3.setText(R.string.blank);
        EditText Answer4=(EditText) findViewById(R.id.Answer4);
        Answer4.setText(R.string.blank);
        Restart();
    }

    public void exit(View v) {
        Intent swapper = new Intent(WordLadder.this, MainActivity.class);
        startActivity(swapper);
    }
    public void display(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint);
        //alter text of textview widget
        tv.setText(hint);

        //assign the textview forecolor
        //tv.setTextColor(Color.GREEN);
    }
    public void display1(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint1);
        //alter text of textview widget
        tv.setText(hint1);

        //assign the textview forecolor
        //tv.setTextColor(Color.GREEN);
    }


    public void display2(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint2);
        //alter text of textview widget
        tv.setText(hint2);

        //assign the textview forecolor
        //tv.setTextColor(Color.GREEN);
    }

    public void display3(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint3);
        //alter text of textview widget
        tv.setText(hint3);

        //assign the textview forecolor
        //tv.setTextColor(Color.GREEN);
    }
    public void display4(View v)
    {
        TextView tv= (TextView) findViewById(R.id.hint4);
        //alter text of textview widget
        tv.setText(hint4);

        //assign the textview forecolor
        //tv.setTextColor(Color.GREEN);
    }
}

