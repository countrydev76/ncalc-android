package io.jopitel.android.ncalc.ncalccore

/**
 * This is object class
 *
 * ##### 학습 가이드
 * - [Kotline HelloWorld](https://www.programiz.com/kotlin-programming/hello-world)
 * - [안드로이드 Gradle 멀티 프로젝트 사용](http://fsd-jinss.tistory.com/39)
 * - [gradle build 스크립트](https://www.tutorialspoint.com/gradle/gradle_build_script.htm)
 */
object hjCalcSingleton {
  /**
   * This metbhod is to plus
   *
   * @param l Int left argument.
   * @param r Int right argument.
   * @return Int the plus result.
   */
  @JvmStatic
  fun plus(l: Int, r: Int): Int {
    return l + r
  }

  /**
   * This metbhod is to minus
   *
   * @param l Int left argument.
   * @param r Int right argument.
   * @return Int the minus result.
   */
  fun minus(l: Int, r: Int): Int {
    return l - r
  }

  /**
   * This metbhod is to multiple
   *
   * @param l Int left argument.
   * @param r Int right argument.
   * @return Int the multiple result.
   */
  fun multiple(l: Int, r: Int): Int {
    return l * r
  }

  /**
   * This metbhod is to devide
   *
   * @param l Int left argument.
   * @param r Int right argument.
   * @return Int the devide result.
   */
  fun devide(l: Int, r: Int): Int {
    return l / r
  }
}