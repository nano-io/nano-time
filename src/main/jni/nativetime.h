/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class io_nano_nativetime_NativeTime */

#ifndef _Included_io_nano_nativetime_NativeTime
#define _Included_io_nano_nativetime_NativeTime
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     io_nano_nativetime_NativeTime
 * Method:    currentTimeMicros
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL
Java_io_nano_nativetime_NativeTime_currentTimeMicros(JNIEnv *, jobject);

/*
 * Class:     io_nano_nativetime_NativeTime
 * Method:    currentTimeNanos
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL
Java_io_nano_nativetime_NativeTime_currentTimeNanos(JNIEnv *, jobject);

JNIEXPORT jlong JNICALL
JavaCritical_io_nano_nativetime_NativeTime_currentTimeMicros();

JNIEXPORT jlong JNICALL
JavaCritical_io_nano_nativetime_NativeTime_currentTimeNanos();

#ifdef __cplusplus
}
#endif
#endif
