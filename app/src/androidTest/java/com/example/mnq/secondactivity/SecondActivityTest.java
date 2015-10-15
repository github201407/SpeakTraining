package com.example.mnq.secondactivity;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by chenmingqun on 2015/10/15.
 */
public class SecondActivityTest extends ActivityInstrumentationTestCase2<SecondActivity> {

    private SecondActivity mActivity;

    public SecondActivityTest() {
        super(SecondActivity.class);
    }

    @Override
    public SecondActivity getActivity() {
        return super.getActivity();
    }

    public void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
    }

    public void tearDown() throws Exception {

    }

    public void testOnCreate() throws Exception {

    }

    public void testRandom() throws Exception {
        String mStr = mActivity.random(1);
        Log.e("String:", mStr);
    }
}