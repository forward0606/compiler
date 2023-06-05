myCompiler_test.class: myCompiler_test.java myCompiler.java
	javac -cp ./antlr-4.12.0-complete.jar *.java

myCompiler.java: myCompiler.g4
	java -Xmx500M -cp ./antlr-4.12.0-complete.jar org.antlr.v4.Tool myCompiler.g4

run: myCompiler_test.class test_data/
	java -cp ./antlr-4.12.0-complete.jar:. myCompiler_test test_data/test1.c > test_data/test1.ll
	cat test_data/test1.ll
	lli test_data/test1.ll
	

clean:
	rm -rf *.class
	rm -rf myCompiler.java myCompilerLexer* myCompilerParser* *Listener.java
	rm -rf *.tokens *.interp