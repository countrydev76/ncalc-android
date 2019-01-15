package io.jopitel.android.ncalc.ncalccore;

    import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class hjCalcTestJ {
  public String TAG = "[hjjo][ncalc][ncalccore] ";
  @Test
  public void addition_isCorrect() {
    assertEquals(4, 2 + 2);
  }

  @Test
  public void test_ncalccore() {
    System.out.println(TAG + "called test_ncalccore");

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