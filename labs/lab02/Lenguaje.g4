grammar Lenguaje;

programa    : VOID MAIN '(' ')' '{' body* '}';
body        : declaracion;
declaracion : tipo_dato ID SEMI;
tipo_dato   : INT;


VOID: 'void';
MAIN: 'main';
INT: 'int';
ID: [a-zA-Z][a-zA-Z0-9]*;
SEMI: ';';
WS: [ \t\r\n]+ -> skip;