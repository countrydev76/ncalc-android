package io.jopitel.android.ncalc.ncalccore

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class hjCalcTest {
  val TAG = "[hjjo][ncalc][ncalccore] "
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun test_ncalccore() {
    println(TAG + "called test_ncalccore")

    val calc = hjCalc<Int>("magmajo", "hello", "world")
    assertEquals(calc.plus(2, 2).toLong(), 4)
    assertEquals(calc.minus(4, 2).toLong(), 2)
    assertEquals(calc.multiple(2, 2).toLong(), 4)
    assertEquals(calc.devide(4, 2).toLong(), 2)

    val calcEx = hjCalcEx<Int>("magmajo")
    assertEquals(calcEx.plus(2, 2).toLong(), 4)
    assertEquals(calcEx.minus(4, 2).toLong(), 2)
    assertEquals(calcEx.multiple(2, 2).toLong(), 4+2)
    assertEquals(calcEx.devide(4, 2).toLong(), 2)
    assertEquals(calcEx.sum(1, 2, 3, 4, 5), 15)

    hjCalcMain.main(arrayOf("hello", "world"), hjCalcMain.PlatformType.Desktop)
  }
}