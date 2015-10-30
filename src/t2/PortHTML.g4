grammar PortHTML; 

site
:  'site' cabecalho corpo 'fim-site'
;

cabecalho
: 'cabecalho' titulo_site 'fim-cabecalho'
;

corpo
: 'corpo' tags* 'fim-corpo'
;

tags
: link | paragrafo | texto | titulo | subtitulo |
  cor_fundo | imagem | mapa
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

paragrafo
: 'paragrafo' texto* 'fim-paragrafo'
;

texto
: estado? 'texto' CADEIA 'fim-texto'
;

botao
  : 'botao' estado? CADEIA 'fim-botao'
  ;
  
estado
: 'aviso' | 'alerta' | 'sucesso' | 'erro'
;

titulo
: 'titulo' texto 'fim-titulo'
;

subtitulo
: 'subtitulo' texto 'fim-subtitulo'
;

cor_fundo
: 'cor-fundo' nome_cor 'fim-cor-fundo'
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
 : INT*
 ; 
       
altura
: INT*
;
  
mapa
: 'mapa' pais ',' cidade 'fim-mapa'
    | 'mapa' coordenadas 'fim-mapa'
;
  
pais
: texto+
;

cidade
: texto+
;

coordenadas
        : COORD COORD
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
  'amarelo' | 'rosa' | 'cinza' | 'roxo'
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

COORD
: ('+'|'-')('0'..'9')?('0'..'9')+'.'
  ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
  ;

WS
    : (' ' | '\t' | '\r' | '\n') -> channel(HIDDEN)
    ;   
     