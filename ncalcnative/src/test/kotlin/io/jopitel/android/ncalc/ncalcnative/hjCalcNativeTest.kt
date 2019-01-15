package io.jopitel.android.ncalc.ncalcnative

import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class hjCalcNativeTest {
  var TAG = "[hjjo][ncalc][ncalcnative] "

  @Test
  fun addition_isCorrect() {
    Assert.assertEquals(4, 2 + 2)
  }

  @Test
  fun test_ncalcnative() {
    println(TAG + "Not suuport platform with desktop")
    Assert.assertTrue(true)
  }
}
