package io.nano.time.jni;

import org.junit.Assert;
import org.junit.Test;

public class NativeTimeNoCriticalTest {

    private static final int RUN_COUNT = 10;

    @Test
    public void currentTimeMicros() {
        long lastTime = 0;
        for (int i = 0; i < RUN_COUNT; i++) {
            long currentTimeMicros = NativeTimeNoCritical.currentTimeMicros();
            Assert.assertTrue(currentTimeMicros >= lastTime);
            lastTime = currentTimeMicros;
        }
    }

    @Test
    public void currentTimeNanos() {
        long lastTime = 0;
        for (int i = 0; i < RUN_COUNT; i++) {
            long currentTimeNanos = NativeTimeNoCritical.currentTimeNanos();
            Assert.assertTrue(currentTimeNanos >= lastTime);
            lastTime = currentTimeNanos;
        }
    }
}