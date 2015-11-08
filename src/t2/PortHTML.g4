grammar PortHTML; 

site
:  'site' cabecalho corpo 'fim-site'
;

cabecalho
: 'cabecalho' titulo_site 'fim-cabecalho'
;

corpo
: 'corpo' cor_fundo? tags* 'fim-corpo'
;

tags
: link | texto | titulo | subtitulo |
  cor_fundo |imagem | mapa
 | botao | slide_show | div | container | menu_fixo
;


menu_fixo
: 'menu-fixo'  link+ 'fim-fixo'
;

div
 : 'div' container? tags* 'fim-div'
 ;

container
: 'container'
;

link
: 'link' url nome_pagina 'fim-link'
;
/*
paragrafo
: 'paragrafo' texto* 'fim-paragrafo'
;
*/
texto
:  'texto' estado? CADEIA 'fim-texto'
;

botao
  : 'botao' estado? CADEIA 'fim-botao'
  ;
  
estado
: 'aviso' | 'alerta' | 'sucesso' | 'erro'
;

titulo
: 'titulo' CADEIA 'fim-titulo'
;

subtitulo
: 'subtitulo' CADEIA 'fim-subtitulo'
;

cor_fundo
:  nome_cor 
;

cor_texto
 : 'cor-texto' nome_cor 'fim-cor-texto'
;

imagem
: 'imagem' url dimensoes 'fim-imagem'
;

dimensoes
: 'dimensoes' largura altura 'fim-dimensoes'
;
  
largura
 : INT
 ; 
       
altura
: INT
;
  
mapa
: 'mapa' coordenadas 'fim-mapa'
;
  
pais
: texto+
;

cidade
: texto+
;

coordenadas
        : LATITUDE LONGITUDE
        ;

slide_show
        :'slide-show'(imagem texto?)+ 'fim-slide-show'
        ;

titulo_site
: CADEIA
;

nome_pagina
: CADEIA
;

url
: CADEIA
;
nome_cor
: 'azul' | 'vermelho' | 'branco' | 'preto' | 'verde' |
  'amarelo' | 'rosa' | 'cinza' 
;

COMENTARIO
: '{' ~('\n' | '\r')* '}' -> skip
;

/* cadeia copiada de LA */
CADEIA
    : '"' ~('\n' | '\r' | '"')* '"'
    ;

/*
CADEIA:  ( 'a'..'z' | 'A' .. 'Z' | '_' | '+' | '-' | '*' | '!' | '?' | '&' | '@' | '/')+
      ;
*/
      
INT: ('0'..'9')+
   ;

LATITUDE
: ('+'|'-')('0'..'9')?('0'..'9')+'.'
  ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
  ;

LONGITUDE
: ('+'|'-')('0'..'9')?('0'..'9')+'.'
  ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
  ;


WS
    : (' ' | '\t' | '\r' | '\n') -> channel(HIDDEN)
    ;   
     