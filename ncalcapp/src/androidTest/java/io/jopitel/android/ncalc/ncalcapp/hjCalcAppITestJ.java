package io.jopitel.android.ncalc.ncalcapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import io.jopitel.android.ncalc.ncalccore.hjCalc;
import io.jopitel.android.ncalc.ncalccore.hjCalcMainJ;
import io.jopitel.android.ncalc.ncalcnative.hjCalcNativeJ;
import io.jopitel.android.ncalc.ncalcwrap.hjCalcWrapMainJ;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class hjCalcAppITestJ {
  public String TAG = "[hjjo][ncalc][ncalcwrap]";
  public String PACKAGE_NAME = "io.jopitel.android.ncalc.ncalcwrap.test";

  @Test
  public void useAppContext() {
    Log.d(TAG, "called useAppContext()");

    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals(PACKAGE_NAME, appContext.getPackageName());

    test_ncalccore();
    test_ncalcnative();
    test_ncalcwrap();
  }

  @Test
  public void test_ncalcnative() {
    Log.d(TAG, "called test_ncalcnative()");

    hjCalcNativeJ calc = new hjCalcNativeJ();
    String s = calc.stringFrom();
    assertNotEquals(s, "");

    Log.d(TAG, s);
  }

  @Test
  public void test_ncalccore() {
    Log.d(TAG, "called test_ncalccore()");

    hjCalc calc = new hjCalc<Integer>("magmajo", "hello", "world");
    assertEquals(calc.plus(2,2),  4);
    assertEquals(calc.minus(4,2),  2);
    assertEquals(calc.multiple(2,2),  4);
    assertEquals(calc.devide(4,2),  2);
    String [] args = new String[2];
    args[0] = "hello";
    args[1] = "world";
    hjCalcMainJ.main(args);
  }

  @Test
  public void test_ncalcwrap() {
    Log.d(TAG, "called test_ncalcwrap()");

    String [] args = new String[2];
    args[0] = "hello";
    args[1] = "world";
    hjCalcWrapMainJ.main(args);

    assertTrue(true);
  }
}
