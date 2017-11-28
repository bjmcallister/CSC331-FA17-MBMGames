package com.example.spencermassey.test;

        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.database.Cursor;
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

public class WordJumble extends AppCompatActivity {

    Random rand = new Random();
    int num = rand.nextInt(22);
    //initializes count
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_jumble);

        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        //StringBuffer buffer = new StringBuffer();
        if(AllWords.getCount()==0) {
            db.addWord(new Word(1, "word", "Used to form sentences", 1));
            db.addWord(new Word(2, "worm", "A creeping or a crawling animal", 1));
            db.addWord(new Word(3, "warm", "Not cold", 1));
            db.addWord(new Word(4, "harm", "Injure, hurt, damage", 1));
            db.addWord(new Word(5, "harp", "A musical instrument played with the fingers", 1));
            db.addWord(new Word(6, "hare", "To excite; to tease, or worry", 1));
            db.addWord(new Word(7, "have", "To hold in possession or control", 1));
            db.addWord(new Word(8, "lazy", "Disinclined to action or exertion", 2));
            db.addWord(new Word(9, "lady", "A woman", 2));
            db.addWord(new Word(10, "lads", "Boys or young men", 2));
            db.addWord(new Word(11, "lids", "Top of a container", 2));
            db.addWord(new Word(12, "bids", "Offers to buy", 2));
            db.addWord(new Word(13, "bide", "To dwell; to inhabit; to stay", 2));
            db.addWord(new Word(14, "bite", "To seize with the teeth", 2));
            db.addWord(new Word(15, "gone", "No longer present", 3));
            db.addWord(new Word(16, "gore", "Dirt; mud", 3));
            db.addWord(new Word(17, "bore", "To make a round hole in or through", 3));
            db.addWord(new Word(18, "bare", "Without clothes or covering", 3));
            db.addWord(new Word(19, "bark", "The sharp explosive cry of certain animals", 3));
            db.addWord(new Word(20, "back", "Toward the rear", 3));
            db.addWord(new Word(21, "bank", "A financial establishment", 3));
            db.addWord(new Word(22, "acid", "A chemical substance that neutralizes alkalis", 4));
            db.addWord(new Word(23, "arid", "Parched with heat; dry; barren", 4));
            db.addWord(new Word(24, "grid", "A grating of thin parallel bars", 4));
            db.addWord(new Word(25, "grin", "Express with a broad smile", 4));
            db.addWord(new Word(26, "gain", "Obtain or secure", 4));
            db.addWord(new Word(27, "gait", "A going; a walk; a march; a way", 4));
            db.addWord(new Word(28, "bait", "A thing intended to tempt or entice", 4));
            db.addWord(new Word(29, "bell", "Make a ringing sound", 5));
            db.addWord(new Word(30, "tell", "Order, instruct, or advise to do something", 5));
            db.addWord(new Word(31, "toll", "A charge a particular bridge or road", 5));
            db.addWord(new Word(32, "told", "Communicated information", 5));
            db.addWord(new Word(33, "toad", "A tailless amphibian", 5));
            db.addWord(new Word(34, "road", "A wide way leading from one place to another", 5));
            db.addWord(new Word(35, "read", "Look at and comprehend the meaning of", 5));
            db.addWord(new Word(36, "peer", "To come in sight; to appear", 6));
            db.addWord(new Word(37, "pear", "A type of fruit", 6));
            db.addWord(new Word(38, "fear", "Be afraid of", 6));
            db.addWord(new Word(39, "feat", "An achievement that requires great courage, skill, or strength", 6));
            db.addWord(new Word(40, "flat", "Smooth and even", 6));
            db.addWord(new Word(41, "slat", "A thin, narrow strip or bar of wood or metal", 6));
            db.addWord(new Word(42, "slot", "A narrow aperture for something to be inserted", 6));
            db.addWord(new Word(43, "torn", "Ripped", 7));
            db.addWord(new Word(44, "turn", "To revolve", 7));
            db.addWord(new Word(45, "burn", "To consume with fire", 7));
            db.addWord(new Word(46, "burp", "Noisily release air from the stomach through the mouth", 7));
            db.addWord(new Word(47, "bump", "To strike", 7));
            db.addWord(new Word(48, "hump", "A protuberance", 7));
            db.addWord(new Word(49, "dump", "A site for depositing garbage", 7));
            db.addWord(new Word(50, "cost", "An amount to buy something", 8));
            db.addWord(new Word(51, "coat", "An outer garment", 8));
            db.addWord(new Word(52, "coal", "A combustible black or dark brown rock", 8));
            db.addWord(new Word(53, "coil", "To wind cylindrically or spirally", 8));
            db.addWord(new Word(54, "boil", "The temperature at which a liquid bubbles and turns to vapor", 8));
            db.addWord(new Word(55, "bail", "A bucket or scoop used in bailing water out of a boat", 8));
            db.addWord(new Word(56, "wail", "A prolonged high-pitched cry of pain, grief, or anger", 8));
            db.addWord(new Word(57, "book", "Reserve accommodations", 9));
            db.addWord(new Word(58, "look", "To direct the eyes toward an object", 9));
            db.addWord(new Word(59, "lock", "Fasten or secure", 9));
            db.addWord(new Word(60, "lick", "To draw or pass the tongue over", 9));
            db.addWord(new Word(61, "lice", "A small, wingless, parasitic insect", 9));
            db.addWord(new Word(62, "nice", "Pleasant; agreeable; satisfactory", 9));
            db.addWord(new Word(63, "dice", "Small cubes used in gaming", 9));
            db.addWord(new Word(64, "boat", "A small open vessel, or water craft", 10));
            db.addWord(new Word(65, "goat", "A hardy domesticated ruminant animal", 10));
            db.addWord(new Word(66, "goal", "A point marking the end of a race", 10));
            db.addWord(new Word(67, "foal", "A young horse", 10));
            db.addWord(new Word(68, "foul", "A bird", 10));
            db.addWord(new Word(69, "four", "One more than three; twice two", 10));
            db.addWord(new Word(70, "tour", "A short trip to or through a place", 10));
            db.addWord(new Word(71, "dive", "Plunge head first into water", 11));
            db.addWord(new Word(72, "dime", "U.S. coin worth ten cents", 11));
            db.addWord(new Word(73, "lime", "Round, green citris fruit", 11));
            db.addWord(new Word(74, "limp", "To halt; to walk lamely", 11));
            db.addWord(new Word(75, "lamp", "A device for giving light", 11));
            db.addWord(new Word(76, "lisp", "A speech defect", 11));
            db.addWord(new Word(77, "wisp", "A small thin person, typically a child", 11));
            db.addWord(new Word(78, "word", "Used to form sentences", 12));
            db.addWord(new Word(79, "wore", "Cause weariness or fatigue to", 12));
            db.addWord(new Word(80, "tore", "Rip", 12));
            db.addWord(new Word(81, "tire", "A rubber covering placed around a wheel", 12));
            db.addWord(new Word(82, "tile", "A thin rectangular slab of baked clay", 12));
            db.addWord(new Word(83, "till", "A cash register or drawer for money", 12));
            db.addWord(new Word(84, "bill", "An amount of money owed", 12));
            db.addWord(new Word(85, "cute", "Attractive in a pretty or endearing way", 13));
            db.addWord(new Word(86, "cure", "Eliminate a condition with medical treatment", 13));
            db.addWord(new Word(87, "care", "A burdensome sense of responsibility", 13));
            db.addWord(new Word(88, "card", "A piece of printed paper used to send a message", 13));
            db.addWord(new Word(89, "ward", "The act of guarding", 13));
            db.addWord(new Word(90, "wand", "A small stick; a rod", 13));
            db.addWord(new Word(91, "land", "Surface of the earth that is not covered by water", 13));
            db.addWord(new Word(92, "born", "Brought forth, as an animal; brought into life; introduced by birth", 14));
            db.addWord(new Word(93, "corn", "A plant with kernels set in rows on a cob", 14));
            db.addWord(new Word(94, "cord", "A string, or small rope", 14));
            db.addWord(new Word(95, "core", "The central or most important part of something", 14));
            db.addWord(new Word(96, "care", "A burdensome sense of responsibility", 14));
            db.addWord(new Word(97, "cane", "The hollow, jointed stem of a tall grass", 14));
            db.addWord(new Word(98, "lane", "A narrow road", 14));
            db.addWord(new Word(99, "dose", "The quantity of medicine prescribed to be taken, at one time", 15));
            db.addWord(new Word(100, "lose", "To part with unintentionally or unwillingly", 15));
            db.addWord(new Word(101, "lost", "Missing", 15));
            db.addWord(new Word(102, "last", "Coming after all others in time or order; final", 15));
            db.addWord(new Word(103, "past", "Belonging to a former time", 15));
            db.addWord(new Word(104, "pant", "To breathe quickly or in a labored manner", 15));
            db.addWord(new Word(105, "rant", "Speak or shout at length in a wild, impassioned way", 15));
            db.addWord(new Word(106, "crew", "A group of people who work closely together", 16));
            db.addWord(new Word(107, "grew", "Past of grow", 16));
            db.addWord(new Word(108, "grow", "Become larger or greater over a period of time", 16));
            db.addWord(new Word(109, "prow", "The fore part of a vessel; the bow;", 16));
            db.addWord(new Word(110, "prop", "To position a pole underneath something for support", 16));
            db.addWord(new Word(111, "crop", "Cultivated plant that is grown as food", 16));
            db.addWord(new Word(112, "chop", "To cut into pieces", 16));
            db.addWord(new Word(113, "calm", "Tranquility; stilness; quiet; serenity", 17));
            db.addWord(new Word(114, "palm", "The inner part of the hand", 17));
            db.addWord(new Word(115, "pals", "Friends", 17));
            db.addWord(new Word(116, "pans", "Containers used for cooking", 17));
            db.addWord(new Word(117, "pant", "To breathe quickly or in a labored manner", 17));
            db.addWord(new Word(118, "punt", "kick a ball after it is dropped from the hands", 17));
            db.addWord(new Word(119, "hunt", "To pursue for the purpose of catching or killing", 17));
            db.addWord(new Word(120, "trip", "Catch your foot on something and stumble or fall", 18));
            db.addWord(new Word(121, "trap", "Device used to catch animals", 18));
            db.addWord(new Word(122, "tray", "A flat container used to hold items", 18));
            db.addWord(new Word(123, "gray", "A color between black and white", 18));
            db.addWord(new Word(124, "gram", "A metric unit of mass", 18));
            db.addWord(new Word(125, "cram", "To stuff; to crowd; to fill to superfluity", 18));
            db.addWord(new Word(126, "clam", "A bivalve mollusk", 18));
            db.addWord(new Word(127, "dash", "Run or travel somewhere in a great hurry", 19));
            db.addWord(new Word(128, "dish", "Used to serve food", 19));
            db.addWord(new Word(129, "wish", "To have a desire or yearning; to long; to hanker", 19));
            db.addWord(new Word(130, "wise", "Having knowledge; knowing; enlightened", 19));
            db.addWord(new Word(131, "wine", "The expressed juice of grapes", 19));
            db.addWord(new Word(132, "mine", "Belonging to me", 19));
            db.addWord(new Word(133, "mint", "New; in pristine condition", 19));
            db.addWord(new Word(134, "harp", "A musical instrument played with the fingers", 20));
            db.addWord(new Word(135, "carp", "To talk; to speak; to prattle", 20));
            db.addWord(new Word(136, "card", "A piece of printed paper used to send a message", 20));
            db.addWord(new Word(137, "cord", "A string, or small rope", 20));
            db.addWord(new Word(138, "core", "The central or most important part of something", 20));
            db.addWord(new Word(139, "cone", "an edible wafer in which ice cream is served", 20));
            db.addWord(new Word(140, "bone", "The hard, calcified tissue of the skeleton of vertebrate animals", 20));
            db.addWord(new Word(141, "pond", "A body of water, smaller than a lake", 21));
            db.addWord(new Word(142, "bond", "That which binds, ties, fastens, or confines", 21));
            db.addWord(new Word(143, "bend", "To make crooked; to curve", 21));
            db.addWord(new Word(144, "bead", "A drop of a liquid on a surface", 21));
            db.addWord(new Word(145, "bean", "An edible seed", 21));
            db.addWord(new Word(146, "lean", "Be in or move into a sloping position", 21));
            db.addWord(new Word(147, "loan", "To borrow", 21));
            db.addWord(new Word(148, "word", "Forms sentences.", 22));
            db.addWord(new Word(149, "lord", "A person who has authority over others.", 22));
            db.addWord(new Word(150, "lard", "Rendered fat of hogs.", 22));
            db.addWord(new Word(152, "land", "Surface that is not covered by water.", 22));
            db.addWord(new Word(153, "lane", "A narrow road.", 22));
            db.addWord(new Word(154, "cane", "A stick used for walking.", 22));
            db.addWord(new Word(155, "cone", "A pyramid with a circular cross section.", 22));
        }

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
        mShowDialog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                {
                    count = 0;
                    userInput.clearFocus();
                    userInput1.clearFocus();
                    userInput2.clearFocus();
                    userInput3.clearFocus();
                    userInput4.clearFocus();
                    userInput5.clearFocus();
                    userInput6.clearFocus();

                    Cursor AllWords = db.getAllWords();

                    AllWords.moveToPosition(num*7+0);
                    String word1 = AllWords.getString(1);

//I dunno why, but when you get all answers right on the first time it crashes...

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

                    AllWords.moveToNext();
                    String word6 = AllWords.getString(1);
                    if ((userInput5.getText().toString().toLowerCase().equals(word6))) {
                        userInput5.setTextColor(Color.GREEN);
                        userInput5.setFocusable(false);
                        count++;
                    } else {
                        userInput5.setTextColor(Color.RED);
                    }

                    AllWords.moveToNext();
                    String word7 = AllWords.getString(1);
                    if ((userInput6.getText().toString().toLowerCase().equals(word7))) {
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

        AllWords.moveToPosition(num*7);
        String word1 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+1);
        String word2 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+2);
        String word3 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+3);
        String word4 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+4);
        String word5 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+5);
        String word6 = AllWords.getString(1);
        AllWords.moveToPosition(num*7+6);
        String word7 = AllWords.getString(1);
        EditText Start=(EditText) findViewById(R.id.Word1);
        Start.setText(word1);
        EditText two=(EditText) findViewById(R.id.Word2);
        two.setText(word2);
        EditText three=(EditText) findViewById(R.id.Word3);
        three.setText(word3);
        EditText four=(EditText) findViewById(R.id.Word4);
        four.setText(word4);
        EditText five=(EditText) findViewById(R.id.Word5);
        five.setText(word5);
        EditText six=(EditText) findViewById(R.id.Word6);
        six.setText(word6);
        EditText End=(EditText) findViewById(R.id.Word7);
        End.setText(word7);
    }

    //Recreates the board
    //public void Restart() {
        //this.recreate();
    //}

    //Resets all answers
    public void Reset(View v) {
        Intent nextPage = new Intent(WordJumble.this, WordJumble.class);
        startActivity(nextPage);
    }

    //switches to Main Menu
    public void exit(View v) {
        Intent swapper = new Intent(WordJumble.this, MainActivity.class);
        startActivity(swapper);
    }


    //hint1
    public void hint1(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7);
        String Phrase1 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint1);
        tv.setText(Phrase1);
    }
    //hint2
    public void hint2(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+1);
        String Phrase2 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint2);
        tv.setText(Phrase2);
    }
    //hint3
    public void hint3(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+2);
        String Phrase3 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint3);
        tv.setText(Phrase3);
    }
    //hint4
    public void hint4(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+3);
        String Phrase6 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint4);
        tv.setText(Phrase6);
    }
    //hint5
    public void hint5(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+4);
        String Phrase5 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint5);
        tv.setText(Phrase5);
    }

    public void hint6(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+5);
        String Phrase5 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint6);
        tv.setText(Phrase5);
    }

    public void hint7(View v)
    {
        final DBHelper db = new DBHelper(this);
        Cursor AllWords = db.getAllWords();
        AllWords.moveToPosition(num*7+6);
        String Phrase5 = AllWords.getString(2);
        TextView tv= (TextView) findViewById(R.id.hint7);
        tv.setText(Phrase5);
    }
}