package com.example.spencermassey.test;

//import java.util.ArrayList;
//import java.util.List;
// database integration help from https://www.androidhive.info/2011/11/android-sqlite-database-tutorial/ and https://blog.reigndesign.com/blog/using-your-own-sqlite-database-in-android-applications/
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class DBHelper extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_PATH = "/data/data/com.example.spencermassey.test/databases/";
    // Database Name
    private static final String DATABASE_NAME = "words.db";

    // table name
    private static final String TABLE_WORDS = "word_db";
    //private SQLiteDatabase myDataBase;
    // Column names
    private static final String COL_ID = "_id";
    private static final String COL_WORD = "word";
    private static final String COL_PHRASE = "phrase";
    private static final String COL_SET = "set";
    private SQLiteDatabase myData;
    private final Context myContext;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.myContext = context;
    }

    // Creating Tables
    public void createDataBase() throws IOException {
        boolean dbExists = checkDatabase();
        if(dbExists)
        {
            //we have a database
        }
        else{
            this.getReadableDatabase();
            try{
                copyDatabase();
            } catch (IOException e) {
                throw new Error("Can't copy database");
            };
        }
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
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_WORDS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        return cursor;
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

    private boolean checkDatabase(){
        SQLiteDatabase checkDB = null;
        try{
            String myPath = DATABASE_PATH + DATABASE_NAME;
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        }catch (SQLiteException e){

        }
        if(checkDB != null){
            checkDB.close();
        }
        return checkDB != null ? true : false;
    }

    private void copyDatabase() throws IOException{
        InputStream myInput = myContext.getAssets().open(DATABASE_NAME);
        String outFileName = DATABASE_PATH + DATABASE_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);

        byte[] buffer = new byte[1024];
        int length;
        while((length = myInput.read(buffer))>0){
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void openDataBase() throws SQLiteException{
        String myPath = DATABASE_PATH + DATABASE_NAME;
        myData = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    @Override
    public synchronized void close() {

        if(myData != null)
            myData.close();

        super.close();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //blank, our database is preloaded
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //blank, our database is preloaded
    }
}