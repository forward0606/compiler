myChecker_test.class: myChecker_test.java myChecker.java
	javac -cp ./antlr-4.12.0-complete.jar *.java

myChecker.java: myChecker.g4
	java -Xmx500M -cp ./antlr-4.12.0-complete.jar org.antlr.v4.Tool myChecker.g4

run: myChecker_test.class test.c
	java -cp ./antlr-4.12.0-complete.jar:. myChecker_test test.c

clean:
	rm -rf *.class
	rm -rf myChecker.java myCheckerLexer* myCheckerParser* *Listener.java
	rm -rf *.tokens *.interp
