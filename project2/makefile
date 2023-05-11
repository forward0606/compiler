testParser.class: testParser.java myparserParser.java
	javac -cp ./antlr-4.12.0-complete.jar *.java

myparserParser.java: myparser.g4
	java -Xmx500M -cp ./antlr-4.12.0-complete.jar org.antlr.v4.Tool myparser.g4

run: testParser.class test.c
	java -cp ./antlr-4.12.0-complete.jar:. testParser test.c
	java -cp ./antlr-4.12.0-complete.jar:. testParser test2.c
	java -cp ./antlr-4.12.0-complete.jar:. testParser test3.c

clean:
	rm -rf *.class
	rm -rf myparserParser.java myparserLexer* *Listener.java
	rm -rf *.tokens *.interp
