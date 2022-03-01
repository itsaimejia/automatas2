grammar Lenguaje;

@header{
    import java.util.HashMap;    
}

@members{
    HashMap<String, Integer> memoria = new HashMap<String, Integer>();
}

programa    : VOID MAIN '(' ')' '{' body* '}';
body        : declaracion | asignacion;
declaracion : INT ID SEMI;

asignacion  : ID '=' expresion+ SEMI;
expresion   : multi (('+' | '-') multi)*;
multi       : base (('*' | '/') base)*;
base        : ID | NUM | '(' expresion ')';

VOID: 'void';
MAIN: 'main';
INT: 'int';
ID: [a-zA-Z][a-zA-Z0-9]*;
NUM: [0-9]+;
SEMI: ';';
WS: [ \t\r\n]+ -> skip;