package io.jopitel.android.ncalc.ncalccore

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
  val TAG = "[hjjo][ncalc][ncalccore]"
  var PACKAGE_NAME = "io.jopitel.android.ncalc.ncalccore.test"

  @Before // 각 테스트마다 인스턴스가 매번 다시 생성되어 독립적인 테스트 가능
  fun setup() {
    Log.d(TAG, "setup")
  }

  @After // 후처리 작업
  fun teardown() {
    Log.d(TAG, "teardown");
  }

  @Test
  fun useAppContext() {
    Log.d(TAG, "called useAppContext()")

    // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext()
    assertEquals(PACKAGE_NAME, appContext.packageName)

    test_ncalccore()
  }

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
}
