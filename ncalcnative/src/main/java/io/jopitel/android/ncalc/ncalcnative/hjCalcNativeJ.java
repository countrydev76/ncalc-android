package io.jopitel.android.ncalc.ncalcnative;

public class hjCalcNativeJ {

  /**
   * A native method that is implemented by the 'native-lib' native library,
   * which is packaged with this application.
   */
  // native
  native String stringFromJNI();
  // method
  public String stringFrom() {
    return stringFromJNI();
  }
  static {
    System.loadLibrary("ncalcnative");
  }
}
