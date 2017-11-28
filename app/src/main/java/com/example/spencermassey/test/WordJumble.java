package com.example.spencermassey.test;

        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.graphics.Color;
        import android.os.IBinder;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.KeyEvent;
        import android.view.View;
        import android.view.inputmethod.EditorInfo;
        import android.view.inputmethod.InputMethodManager;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class WordJumble extends AppCompatActivity {

    //initializes count
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jumble);

        final EditText userInput = (EditText) findViewById(R.id.Answer1);
        final EditText userInput1 = (EditText) findViewById(R.id.Answer2);
        final EditText userInput2 = (EditText) findViewById(R.id.Answer3);
        final EditText userInput3 = (EditText) findViewById(R.id.Answer4);
        final EditText userInput4 = (EditText) findViewById(R.id.Answer5);
        final EditText userInput5 = (EditText) findViewById(R.id.Answer6);
        final EditText userInput6 = (EditText) findViewById(R.id.Answer7);

        //This removes soft keyboard by default
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        //Adds an alert message if all answers are correct or not.
        Button mShowDialog = (Button) findViewById(R.id.check);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {

                        if ((userInput.getText().toString().toLowerCase().equals("word"))) {
                            userInput.setTextColor(Color.GREEN);
                            userInput.setFocusable(false);
                            count++;
                        } else {
                            userInput.setTextColor(Color.RED);
                        }


                        if ((userInput1.getText().toString().toLowerCase().equals("lord"))) {
                            userInput1.setTextColor(Color.GREEN);
                            userInput1.setFocusable(false);
                            count++;
                        } else {
                            userInput1.setTextColor(Color.RED);
                        }



                        if ((userInput2.getText().toString().toLowerCase().equals("lard"))) {
                            userInput2.setTextColor(Color.GREEN);
                            userInput2.setFocusable(false);
                            count++;
                        } else {
                            userInput2.setTextColor(Color.RED);
                        }


                        if ((userInput3.getText().toString().toLowerCase().equals("land"))) {
                            userInput3.setTextColor(Color.GREEN);
                            userInput3.setFocusable(false);
                            count++;
                        } else {
                            userInput3.setTextColor(Color.RED);
                        }


                        if ((userInput4.getText().toString().toLowerCase().equals("lane"))) {
                            userInput4.setTextColor(Color.GREEN);
                            userInput4.setFocusable(false);
                            count++;
                        } else {
                            userInput4.setTextColor(Color.RED);
                        }


                        if ((userInput5.getText().toString().toLowerCase().equals("cane"))) {
                            userInput5.setTextColor(Color.GREEN);
                            userInput5.setFocusable(false);
                            count++;
                        } else {
                            userInput5.setTextColor(Color.RED);
                        }


                        if ((userInput6.getText().toString().toLowerCase().equals("cone"))) {
                            userInput6.setTextColor(Color.GREEN);
                            userInput6.setFocusable(false);
                            count++;
                        } else {
                            userInput6.setTextColor(Color.RED);
                        }


                    if (count >= 7) {
                        AlertDialog.Builder mBuilder = new AlertDialog.Builder(WordJumble.this);
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
                    } else if (count < 7) {
                        AlertDialog.Builder mBuilder = new AlertDialog.Builder(WordJumble.this);
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
        userInput5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput5.setTextColor(Color.WHITE);
                }
            }
        });
        userInput6.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View arg0, boolean hasfocus) {
                if (hasfocus) {
                    userInput6.setTextColor(Color.WHITE);
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
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
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
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
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
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
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
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });
        userInput4.setSingleLine(true);
        userInput4.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput4.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });
        userInput5.setSingleLine(true);
        userInput5.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput5.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });*/
        userInput6.setSingleLine(true);
        userInput6.setImeOptions(EditorInfo.IME_ACTION_DONE);
        userInput6.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                IBinder bob = getWindow().getDecorView().getRootView().getWindowToken();
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(bob, 0);
                return true;
            }
        });
    }

    //Recreates the board
    public void Restart() {
        this.recreate();
    }

    //Resets all answers
    public void Reset(View v) {
        EditText Answer1 = (EditText) findViewById(R.id.Answer1);
        Answer1.setText("");
        EditText Answer2 = (EditText) findViewById(R.id.Answer2);
        Answer2.setText("");
        EditText Answer3 = (EditText) findViewById(R.id.Answer3);
        Answer3.setText("");
        EditText Answer4 = (EditText) findViewById(R.id.Answer4);
        Answer4.setText("");
        EditText Answer5 = (EditText) findViewById(R.id.Answer5);
        Answer5.setText("");
        EditText Answer6 = (EditText) findViewById(R.id.Answer6);
        Answer6.setText("");
        EditText Answer7 = (EditText) findViewById(R.id.Answer7);
        Answer7.setText("");
        Restart();
    }

    //switches to Main Menu
    public void exit(View v) {
        Intent swapper = new Intent(WordJumble.this, MainActivity.class);
        startActivity(swapper);
    }


    //hint2
    public void hint1(View v) {
        TextView tv = (TextView) findViewById(R.id.hint1);
        tv.setText(R.string.h1);
    }

    public void hint2(View v) {
        TextView tv = (TextView) findViewById(R.id.hint2);
        tv.setText(R.string.h2);

    }

    //hint3
    public void hint3(View v) {
        TextView tv = (TextView) findViewById(R.id.hint3);
        tv.setText(R.string.h3);
    }

    //hint4
    public void hint4(View v) {
        TextView tv = (TextView) findViewById(R.id.hint4);
        tv.setText(R.string.h4);
    }

    //hint5
    public void hint5(View v) {
        TextView tv = (TextView) findViewById(R.id.hint5);
        tv.setText(R.string.h5);
    }

    public void hint6(View v) {
        TextView tv = (TextView) findViewById(R.id.hint6);
        tv.setText(R.string.h6);

    }

    public void hint7(View v) {
        TextView tv = (TextView) findViewById(R.id.hint7);
        tv.setText(R.string.h7);

    }
}