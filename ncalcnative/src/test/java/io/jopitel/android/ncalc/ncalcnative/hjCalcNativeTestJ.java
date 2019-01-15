package io.jopitel.android.ncalc.ncalcnative;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class hjCalcNativeTestJ {
  public String TAG = "[hjjo][ncalc][ncalcnative] ";

  @Test
  public void addition_isCorrect() {
    Assert.assertEquals(4, 2 + 2);
  }

  @Test
  public void test_ncalcnative() {
    System.out.println(TAG + "Not suuport platform with desktop");
    Assert.assertTrue(true);
  }
}