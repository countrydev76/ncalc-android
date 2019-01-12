package io.jopitel.android.ncalc.nnative

/**
 *
 */
class hjCalcNative {
  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  /**
   *
   */
  external fun stringFromJNI(): String

  /**
   *
   */
  fun stringFrom() : String {
    return stringFromJNI()
  }

  /**
   *
   */
  companion object {
    // Used to load the 'native-lib' library on application startup.
    init {
      System.loadLibrary("calcnative")
    }
  }
}
