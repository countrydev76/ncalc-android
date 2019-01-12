package io.jopitel.android.ncalc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.jopitel.android.ncalc.ncore.hjCalc
import io.jopitel.android.ncalc.ncore.hjCalcEx
import io.jopitel.android.ncalc.nnative.hjCalcNative
import io.jopitel.android.ncalc.nwrap.hjCalcWrapMain
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  val TAG = "[hjjo]"
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Example of a call to a native method
    sample_text.text = stringFromJNI()

    test_ncalcnative()
    test_ncalccore()
    test_ncalcwrap()
  }

  fun test_ncalcnative() {
    var calcNative = hjCalcNative()
    Log.d(TAG, calcNative.stringFrom())
  }

  fun test_ncalccore() {
    val calc = hjCalc<Int>("magmajo", "hello", "world")
    Log.d(TAG, calc.plus(2, 2).toString())
    Log.d(TAG, calc.minus(2, 2).toString())
    Log.d(TAG, calc.multiple(2, 2).toString())
    Log.d(TAG, calc.devide(2, 2).toString())

    val calcEx = hjCalcEx<Int>("magmajo")
    Log.d(TAG, calcEx.plus(2, 2).toString())
    Log.d(TAG, calcEx.minus(2, 2).toString())
    Log.d(TAG, calcEx.multiple(2, 2).toString())
    Log.d(TAG, calcEx.devide(2, 2).toString())
    Log.d(TAG, calcEx.sum(1, 2, 3, 4, 5).toString())
  }

  fun test_ncalcwrap() {
    hjCalcWrapMain.main(arrayOf("hello", "world"))
  }

  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  external fun stringFromJNI(): String

  companion object {

    // Used to load the 'native-lib' library on application startup.
    init {
      System.loadLibrary("native-lib")
    }
  }

}
