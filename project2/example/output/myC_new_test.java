//import org.antlr.runtime;
import org.antlr.v4.runtime.*;

public class myC_new_test {
	public static void main(String[] args) throws Exception {

		//CharStream input = new ANTLRFileStream(args[0]);
		CharStream input = CharStreams.fromFileName(args[0]);
		myC_newLexer lexer = new myC_newLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		myC_newParser parser = new myC_newParser(tokens);
		parser.program();
	}
}
