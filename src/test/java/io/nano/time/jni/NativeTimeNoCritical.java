package io.nano.time.jni;

public class NativeTimeNoCritical {

    static {
        System.loadLibrary("nocritical");
    }

    public static native long currentTimeMicros();

    public static native long currentTimeNanos();

}
