package com.example.spencermassey.test;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



@RunWith(MockitoJUnitRunner.class)

//@RunWith(Moc)
public class DBHelperTest {
    private static final String FAKE_STRING = "HELLO WORLD";

    @Mock
    Context mMockContext;

    @Mock
    DBHelper mdata;

    @Before
    public void setUp() throws Exception {
        //mdata = new DBHelper(mMockContext);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getCount_returns_true() throws Exception {
        //mdata = new DBHelper(mMockContext);
        //db.getAllWords();
        //assertThat(DBHelper.getAllWords);
        //Cursor w = mdata.getAllWords();
        //DBHelper db = new DBHelper(mMockContext);
        //final DBHelper db = new DBHelper(this);
        //Cursor getall = mdata.getAllWords();
        //SQLiteDatabase db = mMockContext.();
        //DBHelper mdata = new DBHelper(mMockContext);
        mdata = new DBHelper(mMockContext);
        //SQLiteDatabase db = mdata.getReadableDatabase();


        // ...when the string is returned from the object under test...
        //SQLiteDatabase db = mdata.getReadableDatabase();
        int result = mdata.getWordCount();

        // ...then the result should be the expected one.
        assertThat(result, is(147));

    }
    @Test
    public void getAllWords_returns_words() throws Exception {
        //mdata = new DBHelper(mMockContext);
        //DBHelper db = new DBHelper(mMockContext);
        //Cursor all_result = mdata.getAllWords();
        final DBHelper mdata = new DBHelper(mMockContext);
        // ...then the result should be the expected one.
        assertThat(mdata.getAllWords().getCount(), is(147));

    }

}