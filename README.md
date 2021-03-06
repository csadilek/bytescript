## bytescript: a JVM bytecode to JavaScript translator

The purpose of this project is to translate Java class files into JavaScript
files that can do the same thing in a browser as the original class would have
done in a JVM.

Right now, we're just getting started. It doesn't work yet, unless your program is Hello World. :)

We aim to support all the comforts of a real JVM, including:

* dynamic class loading at runtime
* reflection
* access to the underlying system through native (JNI) methods
* working properly for bytecode generated by any JVM language compiler; not just javac

TODO:

* Figure out how instance creation will work (JavaScript new operator?)
* Figure out how Java inheritance will work (JavaScript prototype chains?)
* Figure out where instance vs. static fields will be stored
* Figure out how to implement getClass()
* Discover dependencies while processing, and recursively process those classes too
  * Support built-in base cases such as java.lang.Object and java.lang.System
* Proof-of-concept using ProGuard for upfront obfuscation, minification, and dead code elimination
  (why solve this problem again in bytescript?)
* Proof-of-concept using the Closure compiler for after-the-fact obfuscation, minification, and method inlining

Done:

* Get a basic HelloWorld class to translate and run in a browser
