package com.example.spencermassey.test;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.graphics.Color;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.graphics.Color;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;
import java.util.Random;


public class WordLadder extends AppCompatActivity {

    Random rand = new Random();
    int num = rand.nextInt(22);
    //initializes count
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_ladder);

        final DBHelper db = new DBHelper(this);

        final EditText userInput = (EditText) findViewById(R.id.Answer);
        final EditText userInput1 = (EditText) findViewById(R.id.Answer1);
        final EditText userInput2 = (EditText) findViewById(R.id.Answer2);
        final EditText userInput3 = (EditText) findViewById(R.id.Answer3);
        final EditText userInput4 = (EditText) findViewById(R.id.Answer4);

        //This removes soft keyboard by default
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        //Adds an alert message if all answers are correct or not.
        Button mShowDialog = (Button) findViewById(R.id.check);
        mShowDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                {
                    Cursor AllWords = db.getAllWords();

                    AllWords.moveToPosition(num*7+1);
                    String word1 = AllWords.getString(1);

                    /*userInput.clearFocus();
                    userInput1.clearFocus();
                    userInput2.clearFocus();
                    userInput3.clearFocus();
                    userInput4.clearFocus();*/

                        if ((userInput.getText().toString().toLowerCase().equals(word1))) {
                            userInput.setTextColor(Color.GREEN);
                            userInput.setFocusable(false);
                            count++;
                        } else {
                            userInput.setTextColor(Color.RED);
                        }


                        AllWords.moveToNext();
                        String word2 = AllWords.getString(1);
                        if ((userInput1.getText().toString().toLowerCase().equals(word2))) {
                            userInput1.setTextColor(Color.GREEN);
                            userInput1.setFocusable(false);
                            count++;
                        } else {
                            userInput1.setTextColor(Color.RED);
                        }


                    AllWords.moveToNext();
                        String word3 = AllWords.getString(1);
                        if ((userInput2.getText().toString().toLowerCase().equals(word3))) {
                            userInput2.setTextColor(Color.GREEN);
                            userInput2.setFocusable(false);
                            count++;
                        } else {
                            userInput2.setTextColor(Color.RED);
                        }


                        AllWords.moveToNext();
                        String word4 = AllWords.getString(1);
                        if ((userInput3.getText().toString().toLowerCase().equals(word4))) {
                            userInput3.setTextColor(Color.GREEN);
                            userInput3.setFocusable(false);
                            count++;
                        } else {
                            userInput3.setTextColor(Color.RED);
                        }


                        AllWords.moveToNext();
                        String word5 = AllWords.getString(1);
                        if ((userInput4.getText().toString().toLowerCase().equals(word5))) {
                            userInput4.setTextColor(Color.GREEN);
                            userInput4.setFocusable(false);
                            count++;
                        } else {
                            userInput4.setTextColor(Color.RED);
                        }



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
                    } else if (count < 5) {
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
                    count = 0;
                }
            }
        });


        userInput.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput.setTextColor(Color.WHITE);
                }
            }
        });
        userInput1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput1.setTextColor(Color.WHITE);
                }
            }
        });
        userInput2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput2.setTextColor(Color.WHITE);
                }
            }
        });
        userInput3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput3.setTextColor(Color.WHITE);
                }
            }
        });
        userInput4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput4.setTextColor(Color.WHITE);
                }
            }
        });


        //If sets an Action_Done command to turn the correct answer to green and add to count
        userInput.setSingleLine(true);
        userInput.setImeOptions(EditorInfo.IME_ACTION_DONE);
        /*userInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });

        userInput1.setSingleLine(true);
        userInput1.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput1.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });
        userInput2.setSingleLine(true);
        userInput2.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput2.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });
        userInput3.setSingleLine(true);
        userInput3.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput3.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });*/
        userInput4.setSingleLine(true);
        userInput4.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput4.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });

        //final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();


        AllWords.moveToPosition(num*7);
        String word0 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+6);
        String word6 = AllWords.getString(1);
        EditText Start=(EditText) findViewById(R.id.start);
        Start.setText(word0);
        EditText End=(EditText) findViewById(R.id.end);
        End.setText(word6);
    }

    //Recreates the board
    //public void Restart(){
        //this.recreate();
    //}

    //Resets all answers
    public void Reset(View v){
        Intent nextPage = new Intent(WordLadder.this, WordLadder.class);
        startActivity(nextPage);
    }

    //switches to Main Menu
    public void exit(View v) {
        Intent swapper = new Intent(WordLadder.this, MainActivity.class);
        startActivity(swapper);
    }

    //hint1
    public void display(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+1);
        String Phrase1 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint);
        tv.setText(Phrase1);
    }
    //hint2
    public void display1(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+2);
        String Phrase2 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint1);
        tv.setText(Phrase2);
    }
    //hint3
    public void display2(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+3);
        String Phrase3 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint2);
        tv.setText(Phrase3);
    }
    //hint4
    public void display3(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+4);
        String Phrase6 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint3);
        tv.setText(Phrase6);
    }
    //hint5
    public void display4(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+5);
        String Phrase5 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint4);
        tv.setText(Phrase5);
    }
}

