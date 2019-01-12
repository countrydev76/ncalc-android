package io.jopitel.android.ncalc.nwrap;

import io.jopitel.android.ncalc.ncore.hjCalc;
import io.jopitel.android.ncalc.nnative.hjCalcNativeJ;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTestJ {
  public String TAG = "[hjjo]";
  @Test
  public void addition_isCorrect() {
    assertEquals(4, 2 + 2);
  }

  @Test
  public void test_ncalcnative() {
    hjCalcNativeJ calc = new hjCalcNativeJ();
    calc.stringFrom();
  }

  @Test
  public void test_ncalccore() {
    hjCalc calc = new hjCalc<Integer>("magmajo", "hello", "world");
    assertEquals(calc.plus(2,2),  4);
    assertEquals(calc.minus(4,2),  2);
    assertEquals(calc.multiple(2,2),  4);
    assertEquals(calc.devide(4,2),  2);
  }

  @Test
  public void test_ncalcwrap() {
    String [] args = new String[2];
    args[0] = "hello";
    args[1] = "world";
    hjCalcWrapMainJ.main(args);
  }
}