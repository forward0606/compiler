// import org.antlr.runtime.*;
import org.antlr.v4.runtime.*;

public class myChecker_test {
      public static void main(String[] args) throws Exception {

            // CharStream input = new ANTLRFileStream(args[0]);
            CharStream input = CharStreams.fromFileName(args[0]);
            myCheckerLexer lexer = new myCheckerLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            myCheckerParser parser = new myCheckerParser(tokens);
            parser.headers();
            System.out.println("symbol table:\tkey\ttype number");
            for (String i : parser.symtab.keySet()) {
                  System.out.println("\t\t" + i + "\t" + parser.symtab.get(i));
            }
      }
} 