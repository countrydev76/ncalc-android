package io.jopitel.android.ncalc.ncalcapp


import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import io.jopitel.android.ncalc.ncalccore.hjCalc
import io.jopitel.android.ncalc.ncalccore.hjCalcEx
import io.jopitel.android.ncalc.ncalccore.hjCalcMain
import io.jopitel.android.ncalc.ncalcnative.hjCalcNative
import io.jopitel.android.ncalc.ncalcwrap.hjCalcWrapMain
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class hjCalcAppITest {
  val TAG = "[hjjo][ncalc][ncalcwrap]"
  var PACKAGE_NAME = "io.jopitel.android.ncalc.ncalcwrap.test"

  @Test
  fun useAppContext() {
    Log.d(TAG, "called useAppContext()")

    // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext()
    assertEquals(PACKAGE_NAME, appContext.packageName)

    test_ncalccore()
    test_ncalcnative()
    test_ncalcwrap()
  }

  @Test
  fun test_ncalcnative() {
    Log.d(TAG, "called test_ncalcnative()")

    val calc = hjCalcNative()
    val s = calc.stringFrom()
    assertNotEquals(s, "")

    Log.d(TAG, s)
  }

  @Test
  fun test_ncalccore() {
    Log.d(TAG, "called test_ncalccore()")

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

    hjCalcMain.main(arrayOf("hello", "world"))
  }

  @Test
  fun test_ncalcwrap() {
    Log.d(TAG, "called test_ncalcwrap()")
    hjCalcWrapMain.main(arrayOf("hello", "world"))
    Assert.assertTrue(true)
  }
}
