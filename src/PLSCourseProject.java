import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Main class where program runs from. Contains method main.
 * @author Jonah
 */
public class PLSCourseProject {

    /**
     * @param args the command line arguments
     * main starts the program by asking for DOT code input from the user.
     * It then takes the input and gives it to the lexer. Tokens are then 
     * created and given to the parser to parse. Listener is created to walk the
     * tree and which then returns the dot code in pretty-print format.
     * The pretty-print dot code is then printed out.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter dot code ending with a $ symbol:");
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String input = "";
        while (!input.contains("$"))
            input = input + br.readLine();
        input = input.replace("$", "");
        InputStream stream = new ByteArrayInputStream(input.getBytes());
        DOTLexer lexer = new DOTLexer(CharStreams.fromStream(stream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DOTParser parser = new DOTParser(tokens);
        DOTParser.GraphContext tree = parser.graph();
        DOTBaseListener listener = new DOTBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        System.out.println();
        System.out.println(listener.formmatedString());
    }
    
}
