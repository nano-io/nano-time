
### Overview
This library basically offers wall clock times in micro and nano second precision at the expense of an extra 5ns invocation cost.

See here for more information on JavCritical:
https://stackoverflow.com/questions/36298111/is-it-possible-to-use-sun-misc-unsafe-to-call-c-functions-without-jni/36309652#36309652

### TODO
- Banchmarks should be able to run from the command line using the uber jar benchmarks.jar. Currently not working.

### Benchmarks
The native calls do not appear to benefit from JavaCritical optimizations.
Ideally a completely different class should be created that offers no optimizations and the benchmarks can be compared directly.
Next step should be to enable compiler logging to see if/how the JNI calls are optimized.

```
Benchmark                                Mode  Cnt   Score   Error  Units
NativeTimeBench.currentTimeMillis        avgt   25  20.396 ± 0.054  ns/op
NativeTimeBench.nanoTime                 avgt   25  20.813 ± 0.935  ns/op
NativeTimeBench.nativeCurrentTimeMicros  avgt   25  25.900 ± 1.246  ns/op
NativeTimeBench.nativeCurrentTimeNanos   avgt   25  25.117 ± 1.479  ns/op
```

### See Also
https://github.com/caplin/nanotime
