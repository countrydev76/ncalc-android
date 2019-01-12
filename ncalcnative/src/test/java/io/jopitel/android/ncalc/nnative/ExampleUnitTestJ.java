package io.jopitel.android.ncalc.nnative;

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
}