#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_io_jopitel_android_ncalc_ncalcnative_hjCalcNativeJ_stringFromJNI(JNIEnv *env, jobject instance) {
  std::string hello = "Hello from C++";
  return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_io_jopitel_android_ncalc_ncalcnative_hjCalcNative_stringFromJNI(JNIEnv *env, jobject instance) {
  std::string hello = "Hello from C++";
  return env->NewStringUTF(hello.c_str());
}