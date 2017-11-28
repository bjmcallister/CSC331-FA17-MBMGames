package com.example.spencermassey.test;

//import java.util.ArrayList;
//import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "word_new2.db";

    // table name
    private static final String TABLE_WORDS = "words";

    // Column names
    private static final String COL_ID = "id";
    private static final String COL_WORD = "word";
    private static final String COL_PHRASE = "phrase";
    private static final String COL_SET = "length";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_WORD_4_TABLE = "CREATE TABLE " + TABLE_WORDS + "("
                + COL_ID + " INTEGER PRIMARY KEY," + COL_WORD + " TEXT,"
                + COL_PHRASE+ " TEXT," + COL_SET + " TEXT" + ")";
        db.execSQL(CREATE_WORD_4_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WORDS);

        // Create tables again
        onCreate(db);
    }


    // Adding new word
    void addWord(Word word) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_WORD, word.getWord()); // word
        values.put(COL_PHRASE, word.getPhrase()); // phrase
        values.put(COL_SET, word.getSet()); // set

        // Inserting Row
        db.insert(TABLE_WORDS, null, values);
        db.close(); // Closing database connection
    }

    // Get single word
    Word getWord(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_WORDS, new String[] { COL_ID,
                        COL_WORD, COL_PHRASE, COL_SET }, COL_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Word word = new Word(Integer.parseInt(cursor.getString(0)), cursor.getString(1), cursor.getString(2),
                Integer.parseInt(cursor.getString(0)));
        return word;
    }

    // Getting All Words
    public Cursor getAllWords() {
        //List<Word> wordList = new ArrayList<Word>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_WORDS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        return cursor;
    }

    // Updating single word
    public int updateWord(Word word) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_WORD, word.getWord());
        values.put(COL_PHRASE, word.getPhrase());

        // updating row
        return db.update(TABLE_WORDS, values, COL_ID + " = ?",
                new String[] { String.valueOf(word.getID()) });
    }

    // Deleting single word
    public void deleteWord(Word word) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_WORDS, COL_ID + " = ?",
                new String[] { String.valueOf(word.getID()) });
        db.close();
    }


    // Getting word Count
    public int getWordCount() {
        String countQuery = "SELECT  * FROM " + TABLE_WORDS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}