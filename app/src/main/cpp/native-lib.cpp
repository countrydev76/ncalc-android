#include <jni.h>
#include <string>
#include <android/log.h>

#if !defined(LOG_TAG)
#define LOG_TAG "[hjjo][ndualauth][app][native]"
#endif

#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, LOG_TAG, __VA_ARGS__)
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)
#define LOGF(...) __android_log_print(ANDROID_FATAL_ERROR, LOG_TAG, __VA_ARGS__)
#define LOGS(...) __android_log_print(ANDROID_SILENT_ERROR, LOG_TAG, __VA_ARGS__)

#if defined(__arm__)
#if defined(__ARM_ARCH_7A__)
#if defined(__ARM_NEON__)
#if defined(__ARM_PCS_VFP)
          #define ABI "armeabi-v7a/NEON (hard-float)"
        #else
          #define ABI "armeabi-v7a/NEON"
        #endif
#else
#if defined(__ARM_PCS_VFP)
#define ABI "armeabi-v7a (hard-float)"
#else
#define ABI "armeabi-v7a"
#endif
#endif
#else
#define ABI "armeabi"
#endif
#elif defined(__i386__)
#define ABI "x86"
#elif defined(__x86_64__)
#define ABI "x86_64"
#elif defined(__mips64)  /* mips64el-* toolchain defines __mips__ too */
#define ABI "mips64"
#elif defined(__mips__)
#define ABI "mips"
#elif defined(__aarch64__)
#define ABI "arm64-v8a"
#else
#define ABI "unknown"
#endif

extern "C" JNIEXPORT jstring JNICALL
Java_io_jopitel_android_ncalc_app_MainActivity_stringFromJNI(JNIEnv *env, jobject /* this */) {
  LOGD("Hello from JNI !  Compiled with ABI " ABI ".");
  return env->NewStringUTF("Hello from JNI !  Compiled with ABI " ABI ".");
}