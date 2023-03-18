testLexer.class: testLexer.java test1.java
	javac -cp ../antlr-4.12.0-complete.jar testLexer.java test1.java -Xlint

test1.java: test1.g4
	java -Xmx500M -cp ../antlr-4.12.0-complete.jar org.antlr.v4.Tool test1.g4

run: testLexer.class input.c
	java -cp ../antlr-4.12.0-complete.jar:. testLexer input.c

clean:
	rm test1.java test1.tokens test1.interp test1.class
	rm testLexer.class
