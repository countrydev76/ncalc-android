package io.jopitel.android.ncalc.ncalcnative;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class hjCalcNativeITestJ {
  public String TAG = "[hjjo][ncalc][ncalcnative]";
  public String PACKAGE_NAME = "io.jopitel.android.ncalc.ncalcnative.test";

  @Test
  public void useAppContext() {
    Log.d(TAG, "called useAppContext()");

    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals(PACKAGE_NAME, appContext.getPackageName());

    test_ncalcnative();
  }

  @Test
  public void test_ncalcnative() {
    Log.d(TAG, "called test_ncalcnative()");

    hjCalcNativeJ calc = new hjCalcNativeJ();
    String s = calc.stringFrom();
    assertNotEquals(s, "");

    Log.d(TAG, s);
  }
}
