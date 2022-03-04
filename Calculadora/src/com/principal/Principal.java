package com.principal;

import com.parser.CalculadoraLexer;
import com.parser.CalculadoraParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Principal {
    public static void main(String[] args) throws Exception{
        CharStream input = CharStreams.fromFileName(args[0]);
        CalculadoraLexer lexico = new CalculadoraLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        CalculadoraParser sintactico = new CalculadoraParser(tokens);
        ParseTree arbol = sintactico.program();
        MyVisitor visitas = new MyVisitor();
        visitas.visit(arbol);
        visitas.Show();
    }
}
