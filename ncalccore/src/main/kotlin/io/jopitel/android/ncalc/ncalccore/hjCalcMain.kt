package io.jopitel.android.ncalc.ncalccore

/**
 *
 */
object hjCalcMain {
  enum class PlatformType(val type: String) {
    Desktop("Desktop"),
    Mobile("Mobile")
  }
  /**
   *
   * @param args Array<String>
   */
  @JvmStatic fun main(args: Array<String>, platform: PlatformType = PlatformType.Mobile) {
    val left = 4
    val right = 2

    println("===========================================")
    println("- platform: $platform, args: $args")
    println("- hjCalcMain - called hjCalcSingleton by test platform")
    println("===========================================")
    println("$left + $right  = ${hjCalcSingleton.plus(left, right)}")
    println("$left - $right  = ${hjCalcSingleton.minus(left, right)}")
    println("$left * $right  = ${hjCalcSingleton.multiple(left, right)}")
    println("$left / $right  = ${hjCalcSingleton.devide(left, right)}")

    println("-------------------------------------------")
    println("- hjCalcMain - called hjCalc by test")
    println("-------------------------------------------")
    val calc = hjCalc<Int>("magmajo", "1", "2")
    println("$left + $right  = ${calc.plus(left, right)}")
    println("$left - $right  = ${calc.minus(left, right)}")
    println("$left * $right  = ${calc.multiple(left, right)}")
    println("$left / $right  = ${calc.devide(left, right)}")

    println("-------------------------------------------")
    println("- hjCalcMain - called hjCalcEx by test")
    println("-------------------------------------------")
    val calcEx = hjCalcEx<Int>("magmajo")
    println("$left + $right  = ${calcEx.plus(left, right)}")
    println("$left - $right  = ${calcEx.minus(left, right)}")
    println("$left * $right  = ${calcEx.multiple(left, right)}")
    println("$left / $right  = ${calcEx.devide(left, right)}")
    println("sum(1,2,3,4,5,6)    = ${calcEx.sum(1,2,3,4,5,6)}")
  }
}