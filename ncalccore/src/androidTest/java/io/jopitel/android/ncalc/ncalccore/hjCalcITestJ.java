package io.jopitel.android.ncalc.ncalccore;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class hjCalcITestJ {
  public String TAG = "[hjjo]";
  public String PACKAGE_NAME = "io.jopitel.android.ncalc.ncalccore.test";

  @Test
  public void useAppContext() {
    Log.d(TAG, "called useAppContext()");

    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals(PACKAGE_NAME, appContext.getPackageName());

    test_ncalccore();
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
}
