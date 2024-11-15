grammar JSON;

// Ponto de entrada para o documento JSON
json : value EOF ;

// Definição de um valor JSON
value
    : obj               # ObjectValue
    | array             # ArrayValue
    | STRING            # StringValue
    | NUMBER            # NumberValue
    | 'true'            # TrueValue
    | 'false'           # FalseValue
    | 'null'            # NullValue
    ;

// Definição de um objeto JSON
obj : '{' pair (',' pair)* '}' | '{' '}' ;

// Par chave-valor em um objeto
pair : STRING ':' value ;

// Definição de um array JSON
array : '[' value (',' value)* ']' | '[' ']' ;

// Tokens para elementos básicos de JSON
STRING : '"' (ESC | ~["\\\r\n])* '"' ;
fragment ESC : '\\' (["\\/bfnrt] | 'u' HEX HEX HEX HEX) ;
fragment HEX : [0-9a-fA-F] ;

NUMBER : '-'? INT ('.' [0-9] +)? EXP? ;
fragment INT : '0' | [1-9] [0-9]* ;
fragment EXP : [eE] [+\-]? [0-9]+ ;

// Tokens auxiliares
WS : [ \t\r\n]+ -> skip ;

