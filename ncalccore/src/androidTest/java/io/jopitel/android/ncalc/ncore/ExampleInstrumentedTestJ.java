package io.jopitel.android.ncalc.ncore;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import io.jopitel.android.ncalc.nnative.hjCalcNativeJ;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTestJ {
  public String TAG = "[hjjo]";
  @Test
  public void useAppContext() {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals("io.jopitel.android.ncalc.ncore.test", appContext.getPackageName());

    test_ncalcnative();
    test_ncalccore();
  }

  public void test_ncalcnative() {
    hjCalcNativeJ calc = new hjCalcNativeJ();
    calc.stringFrom();
  }


  public void test_ncalccore() {
    hjCalc calc = new hjCalc<Integer>("magmajo", "hello", "world");
    assertEquals(calc.plus(2,2),  4);
    assertEquals(calc.minus(4,2),  2);
    assertEquals(calc.multiple(2,2),  4);
    assertEquals(calc.devide(4,2),  2);
  }
}
