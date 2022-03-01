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

asignacion  : ID '=' expr+ SEMI;
expr returns [int valor]
            : a= expr op = ('*' | '/') b= expr{
                if($op.text.charAt(0) == '*'){
                    $valor = $a.valor * $b.valor;
                }
                if($op.text.charAt(0) == '/'){
                    $valor = $a.valor / $b.valor;
                }
                System.out.println($valor);
            } 
            | a= expr op = ('+' | '-') b= expr{
                if($op.text.charAt(0) == '+'){
                    $valor = $a.valor + $b.valor;
                }
                if($op.text.charAt(0) == '-'){
                    $valor = $a.valor - $b.valor;
                }
                System.out.println($valor);
            } 
            | NUM {
                $valor = Integer.valueOf($NUM.text);
            }
            ;

VOID: 'void';
MAIN: 'main';
INT: 'int';
ID: [a-zA-Z][a-zA-Z0-9]*;
NUM: [0-9]+;
SEMI: ';';
WS: [ \t\r\n]+ -> skip;