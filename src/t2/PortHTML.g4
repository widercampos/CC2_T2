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
: link | texto | titulo | subtitulo | imagem | mapa
 | botao | menu_fixo | definir | linha
;

menu_fixo
: 'menu-fixo'  nome_link+ 'fim-fixo'
;

nome_link
: link
;

linha
: 'linha' coluna_tags+ 'fim-linha'
;

coluna_tags
: 'coluna' coluna tags* 'fim-coluna'
;

coluna
: SPAN ESP?
;

definir:
  'definir' IDENT 'como' CADEIA
;


container
: 'container'
;

link
: 'link' url nome_pagina 'fim-link'
;

texto
:  'texto' cor? estado? CADEIA 'fim-texto' | 'texto' cor? estado? IDENT 'fim-texto'
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

cor
: nome_cor | IDENT
;

cor_fundo
: nome_cor
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
        : latitude longitude
        ;

/* não funcionou :P
slide_show
        :'slide-show' nome_slide imagem_texto+ 'fim-slide-show'
        ; */

nome_slide
        : CADEIA 
        ;

imagem_texto
    : imagem_slide CADEIA?
    ;

imagem_slide
: CADEIA
;

titulo_site
: CADEIA
;

nome_pagina
: CADEIA
;

url
: CADEIA | IDENT
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

ESP
: 'offset1' | 'offset2' | 'offset3' | 'offset4' | 'offset5' | 'offset6' | 'offset7'| 'offset8' |
  'offset9' | 'offset10' | 'offset11' | 'offset12'
;

SPAN
: 'span1' | 'span2' | 'span3' | 'span4' | 'span5' | 'span6' | 'span7' | 'span8' |
  'span9' | 'span10' | 'span11' | 'span12' 
;


      
IDENT: ('A'..'Z' | 'a'..'z') ('A'..'Z' | 'a'..'z' | '0'..'9' | '-' | '_')*
;

INT: ('0'..'9')+
   ;

latitude
: COORDENADA
;

longitude
: COORDENADA
;
COORDENADA
: ('+'|'-')('0'..'9')?('0'..'9')+'.'
  ('0'..'9')('0'..'9')('0'..'9')('0'..'9')
  ;


WS
    : (' ' | '\t' | '\r' | '\n') -> channel(HIDDEN)
    ;   
     