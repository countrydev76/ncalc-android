package io.jopitel.android.ncalc.napp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.jopitel.android.ncalc.ncore.hjCalcMain
import io.jopitel.android.ncalc.nnative.hjCalcNative
import io.jopitel.android.ncalc.nwrap.hjCalcWrapMain

class MainActivity : AppCompatActivity() {
  val TAG = "[hjjo]"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    test_ncalcnative()
    test_ncalccore()
    test_ncalcwrap()
  }

  fun test_ncalcnative() {
    var calcNative = hjCalcNative()
    Log.d(TAG, calcNative.stringFrom())
  }

  fun test_ncalccore() {
    hjCalcMain.main(arrayOf("hello", "world"))
  }

  fun test_ncalcwrap() {
    hjCalcWrapMain.main(arrayOf("hello", "world"))
  }
}
