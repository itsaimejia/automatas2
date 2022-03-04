package principal;


import com.parser.AlimentosLexer;
import com.parser.AlimentosParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws  Exception{
        CharStream input = CharStreams.fromFileName("test.dat");
        AlimentosLexer lexico = new AlimentosLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        AlimentosParser sintactico = new AlimentosParser(tokens);
        ParseTree arbol = sintactico.grupo();
        MyVisitor visitas = new MyVisitor();
        visitas.visit(arbol);
        visitas.ShowList();
    }
}
