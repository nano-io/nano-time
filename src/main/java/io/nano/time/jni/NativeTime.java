package io.nano.time.jni;

public class NativeTime {

    static {
        System.loadLibrary("nativetime");
//        System.load(".../target/lib/libnativetime.so");
    }

    public static native long currentTimeMicros();

    public static native long currentTimeNanos();

}
