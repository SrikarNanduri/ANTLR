// import ANTLR's runtime libraries
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {

    public static void main(String[] args) throws Exception {

        String fileName = "t.expr";
        File file = new File(fileName);
        FileInputStream fis = null;
        fis = new FileInputStream(file);
// create a CharStream that reads from standard input

        ANTLRInputStream input = new ANTLRInputStream(fis);

// create a lexer that feeds off of input CharStream

        SampLexer lexer = new SampLexer(input);

// create a buffer of tokens pulled from the lexer

        CommonTokenStream tokens = new CommonTokenStream(lexer);

// create a parser that feeds off the tokens buffer

        SampParser parser = new SampParser(tokens);

        ParseTree tree = parser.message(); // begin parsing at init rule

        //System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        Json L = new Json();
        walker.walk( L , tree);
        //System.out.println();
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String jsonOutput = gson.toJson( L.getParserListenerResult() );
        System.out.println( jsonOutput );
    }

}