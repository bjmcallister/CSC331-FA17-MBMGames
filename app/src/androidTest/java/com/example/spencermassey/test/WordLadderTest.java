package com.example.spencermassey.test;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Instrumentation;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class WordLadderTest {
    @Rule
    public ActivityTestRule<WordLadder> mWordLadderRule = new ActivityTestRule<WordLadder>(WordLadder.class);

    private WordLadder mWordLadder = null;

    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(AlertDialog.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        mWordLadder = mWordLadderRule.getActivity();
    }

    @Test
    public void testCheckButton(){
        assertNotNull(mWordLadder.findViewById(R.id.check));

        onView(withId(R.id.check)).perform(click());
        Activity checkMade = getInstrumentation().waitForMonitorWithTimeout(monitor, 5000);
        assertNotNull(checkMade);
    }

    @After
    public void tearDown() throws Exception {
        mWordLadder = null;
    }

}