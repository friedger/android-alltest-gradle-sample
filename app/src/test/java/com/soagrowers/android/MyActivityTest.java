package com.soagrowers.android;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyActivityTest {

    private MyActivity mActivity;

    @Before
    public void setup() {
        mActivity = new MyActivity();
    }

    @Test
    public void testClearState() {
        mActivity.clearState();
        assertEquals(null, mActivity.getState());
    }
}
