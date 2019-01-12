package io.jopitel.android.ncalc.napp

import android.util.Log
import io.jopitel.android.ncalc.ncore.hjCalc
import io.jopitel.android.ncalc.ncore.hjCalcEx
import io.jopitel.android.ncalc.nnative.hjCalcNative
import io.jopitel.android.ncalc.nwrap.hjCalcWrapMain
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  val TAG = "[hjjo]"
  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }

  @Test
  fun test_ncalcnative() {
    var calc = hjCalcNative()
    Log.d(TAG, calc.stringFrom())
  }

  @Test
  fun test_ncalccore() {
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
  }

  @Test
  fun test_ncalcwrap() {
    hjCalcWrapMain.main(arrayOf("hello", "world"))
  }
}