//import org.antlr.runtime;
import org.antlr.v4.runtime.*;

public class testParser {
	public static void main(String[] args) throws Exception {

		//CharStream input = new ANTLRFileStream(args[0]);
		CharStream input = CharStreams.fromFileName(args[0]);
		myparserLexer lexer = new myparserLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		myparserParser parser = new myparserParser(tokens);
		parser.headers();
	}
}
