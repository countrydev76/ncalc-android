package io.jopitel.android.ncalc.nwrap;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import io.jopitel.android.ncalc.ncore.hjCalc;
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
  @Test
  public void useAppContext() {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getTargetContext();

    assertEquals("io.jopitel.android.ncalc.nwrap.test", appContext.getPackageName());

    test_ncalcnative();
    test_ncalccore();
    test_ncalcwrap();
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

  public void test_ncalcwrap() {
    String [] args = new String[2];
    args[0] = "hello";
    args[1] = "world";
    hjCalcWrapMainJ.main(args);
  }
}
