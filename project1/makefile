testLexer.class: testLexer.java mylexer.java
	javac testLexer.java mylexer.java -Xlint

mylexer.java: mylexer.g4
	java -Xmx500M -cp antlr-4.12.0-complete.jar org.antlr.v4.Tool mylexer.g4

run: testLexer.class test_c/hello.c test_c/function.c test_c/array.c
	java testLexer test_c/hello.c
	java testLexer test_c/function.c
	java testLexer test_c/array.c

clean:
	rm mylexer.java mylexer.tokens mylexer.interp mylexer.class
	rm testLexer.class
