# Step to reproduce

- On Windows (tested on Win 7/10 With 9.0.4/10.0.2/11+28).
- Clone this repo.
- Copy `groovy/groovy-all-2.4.15.jar` to `C:\tcagent1\work-1234567890123456-subprojects-tooling-api-build-integ-test-lib\groovy-all-2.4.15.jar` (this path is at the end of `problematic-cp.txt` file). What matters is the path length.
- Run `cd jdk-cp-option-file-issue`.
- Run `javac -cp '.:./groovy/groovy-all-2.4.15.jar' Main.java` to perform a compilation.
- Run `java @problematic-cp.txt Main` you get a `java.lang.NoClassDefFoundError: groovy/lang/GroovyObject`.
- Modify `problematic-cp.txt`, add or remove one character in the `-cp` list (don't change the ending `\\tcagent1\\work-1234567890123456-subprojects-tooling-api-build-integ-test-lib\\groovy-all-2.4.15.jar;."`) 
- Run `java @problematic-cp.txt Main` you get the successful result.
