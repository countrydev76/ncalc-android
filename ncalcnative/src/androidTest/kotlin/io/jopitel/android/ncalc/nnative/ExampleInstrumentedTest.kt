package io.jopitel.android.ncalc.nnative

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
  val TAG = "[hjjo]"
  @Test
  fun useAppContext() {
    // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext()
    assertEquals("io.jopitel.android.ncalc.nnative.test", appContext.packageName)

    test_ncalcnative()
  }

  fun test_ncalcnative() {
    var calc = hjCalcNative()
    Log.d(TAG, calc.stringFrom())
  }
}
