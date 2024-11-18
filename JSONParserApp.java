import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JSONParserApp {
    public static void main(String[] args) {
        String source="";
        try {
            source="";
            File myObj = new File("my.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                source=source+data+"\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

      

            try {
                // Cria um CharStream a partir da entrada do usuário
                CharStream charStream = CharStreams.fromString(source);

                // Inicializa o lexer e o parser com o CharStream
                JSONLexer lexer = new JSONLexer(charStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                JSONParser parser = new JSONParser(tokens);

                // Inicia o parser a partir da regra de entrada
                ParseTree tree = parser.json();

                // Exibe a árvore sintática
                System.out.println("Árvore Sintática: " + tree.toStringTree(parser));

            } catch (Exception e) {
                System.out.println("Erro ao analisar o JSON: " + e.getMessage());
            }
        
        
      
    }
}
