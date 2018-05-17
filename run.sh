#!/usr/bin/env bash

java -Djava.library.path=target/lib \
-XX:+UnlockDiagnosticVMOptions \
-XX:+PrintAssembly \
-XX:+LogCompilation \
-cp target/native-time.jar:target/test-classes \
io.nano.time.jni.NativeTimeRunner
