package io.nano.time;

public class NanoTime {

    static {
        System.loadLibrary("nanotime");
//        System.load(".../target/lib/libnanotime.so");
    }

    public static native long currentTimeMicros();

    public static native long currentTimeNanos();

}
