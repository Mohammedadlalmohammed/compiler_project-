package app;

import java.io.IOException;
import java.util.Iterator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.SqlLexer;
import antlr.SqlParser;
import utilsClasses.ASTBuilderVisitor;
import utilsClasses.ASTNode;
import utilsClasses.Program;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.print("usage : file name");
        } else {
            String fileName = args[0];
            SqlParser parser = getParser(fileName);
            // tell Antlr to build parse tree
            // parse tree from start symbol 'prog'
            ParseTree progContext = parser.test();

            // create a visitor for converting the parse tree to Model object ast
            // AntlrToProgram progVisitor=new AntlrToProgram();
            // ASTBuilderVisitor progVisitor =new ASTBuilderVisitor();
            // Step 2: Parse and Build AST
            // Expr1Parser.ProgContext progContext = parser.prog();
            ASTBuilderVisitor visitor = new ASTBuilderVisitor();
            System.out.println("hi this is run Ok");
            ASTNode ast = visitor.visit(progContext);

            // Step 3: Print the AST
            // System.out.println(ast.prettyPrint(""));
            //
            //

            //
            // ASTNode ast=progVisitor.visit(antlrAST);
            System.out.println(ast.prettyPrint(""));
            
            // Step 4: Launch GUI
             javax.swing.SwingUtilities.invokeLater(() -> {
                 utilsClasses.ASTViewer viewer = new utilsClasses.ASTViewer(ast);
                 viewer.setVisible(true);
             });

            if (visitor.semanticsErrors.isEmpty()) {
                // System.out.println("hi this is run Ok");
            } else {
                for (String error : visitor.semanticsErrors) {
                    System.out.println(error);
                }
            }
        }
    }
    // hero the type of parser and lexer are specified to the grammar name Expr.g4

    private static SqlParser getParser(String filename) {
        SqlParser parser = null;

        try {
            // System.out.println("hi this is run Ok"+filename);
            CharStream input = CharStreams.fromFileName(filename);
            // System.out.println("hi this is run Ok CharStream");
            SqlLexer lexer = new SqlLexer(input);
            // System.out.println("hi this is run Ok Expr1Lexer");
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // System.out.println("hi this is run Ok Expr1Lexer CommonTokenStream");
            parser = new SqlParser(tokens);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return parser;
    }

}
