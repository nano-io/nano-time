package io.nano.time.jni;

import org.junit.Assert;
import org.junit.Test;

/**
 * Run with -XX:+TieredCompilation -XX:+PrintCompilation to see the compiler kick in
 */
public class NativeTimeTest {

    private static final int RUN_COUNT = 200_000;

    @Test
    public void currentTimeMicros() {
        long lastTime = 0;
        for (int i = 0; i < RUN_COUNT; i++) {
            long currentTimeMicros = NativeTime.currentTimeMicros();
            Assert.assertTrue(currentTimeMicros >= lastTime);
            lastTime = currentTimeMicros;
        }
    }

    @Test
    public void currentTimeNanos() {
        long lastTime = 0;
        for (int i = 0; i < RUN_COUNT; i++) {
            long currentTimeNanos = NativeTime.currentTimeNanos();
            Assert.assertTrue(currentTimeNanos >= lastTime);
            lastTime = currentTimeNanos;
        }
    }
}