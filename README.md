# Step to reproduce

- On Windows (tested on Win 7/10 With 9.0.4/10.0.2/11+28).
- Clone this repo.
- Copy `groovy/groovy-all-2.4.15.jar` to `C:\tcagent1\work-1234567890123456-subprojects-tooling-api-build-integ-test-lib\groovy-all-2.4.15.jar` (this path is at the end of `problematic-cp.txt` file). What matters is the path length.
- `cd jdk-cp-option-file-issue`.
- Run `javac -cp '.;./groovy/groovy-all-2.4.15.jar' Main.java` to perform a compilation.
- Run `java @problematic-cp.txt Main` you get a `java.lang.NoClassDefFoundError: groovy/lang/GroovyObject`.
- Modify `problematic-cp.txt`, add or remove one character in the `-cp` list (don't change the ending `C:\\tcagent1\\work-1234567890123456-subprojects-tooling-api-build-integ-test-lib\\groovy-all-2.4.15.jar;."`), for example, change `C:\\tcagent1\\work\\1234567890123456\\intTestHomeDir\\worker-1\\caches\\4.10.1-20180912160000+0000\\workerMain\\gradle-worker.jar` to `C:\\tcagent1\\work\\1234567890123456\\intTestHomeDir\\worker-1\\caches\\4.10.1-20180912160000+0000\\workerMain\\gradle-worker.ja`
- Run `java @problematic-cp.txt Main` you get the successful result.

![image](https://user-images.githubusercontent.com/12689835/45594069-98061a00-b9c6-11e8-9007-69a2aff51c76.png)

# Analysis

I did some investigation and found out the classpath is slightly modified somehow:

![qq20180917-092555](https://user-images.githubusercontent.com/12689835/45603163-c4b84100-ba5b-11e8-85ea-928c715cf562.png)
