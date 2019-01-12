package io.jopitel.android.ncalc.ncore;

import static java.lang.System.out;

public class hjCalcMainJ {
  /**
   * io.jopitel.kotlin.ncalc.ncalcpush.main define
   * @param args : support multi parameter
   */
  public static void main(String[] args) {
    int left = 4;
    int right = 2;

    out.println("-------------------------------------------");
    out.println("- hjCalcPushMainJ");
    out.println("-------------------------------------------");
    out.println(left + " + " + right + " = " + hjCalcJ.plus(left, right));
    out.println(left + " - " + right + " = " + hjCalcJ.minus(left, right));
    out.println(left + " * " + right + " = " + hjCalcJ.multiple(left, right));
    out.println(left + " / " + right + " = " + hjCalcJ.devide(left, right));
  }
}
