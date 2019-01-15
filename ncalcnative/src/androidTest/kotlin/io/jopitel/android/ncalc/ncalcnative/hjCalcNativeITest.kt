package io.jopitel.android.ncalc.ncalcnative

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.util.Log
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
class hjCalcNativeITest {
  val TAG = "[hjjo][ncalc][ncalcnative]"
  var PACKAGE_NAME = "io.jopitel.android.ncalc.ncalcnative.test"

  @Test
  fun useAppContext() {
    Log.d(TAG, "called useAppContext()")

    // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext()
    assertEquals(PACKAGE_NAME, appContext.packageName)

    test_ncalcnative()
  }

  @Test
  fun test_ncalcnative() {
    Log.d(TAG, "called test_ncalcnative()")

    var calc = hjCalcNative()
    val s = calc.stringFrom()
    assertNotEquals(s, "")

    Log.d(TAG, s)
  }
}
