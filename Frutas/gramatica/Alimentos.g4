grammar Alimentos;

grupos  : meses+;
meses   :
        (ENERO frutas+)   #enero
        |
        (FEBRERO frutas+) #febrero
        |
        (MARZO frutas+) #marzo
        |
        (ABRIL frutas+) #abril
        ;


frutas  :
        FRESA   #fresa
        |
        GUAYABA #guayaba
        |
        JAMAICA #jamaica
        |
        LIMA    #lima
        |
        LIMON   #limon
        |
        MANDARINA #mandarina
        |
        MELON   #melon
        |
        NARANJA #naranja
        |
        PINA    #pina
        |
        PAPAYA  #papaya
        |
        PLATANO #platano
        |
        TORONJA #toronja
        |
        GRANADA #granada
        |
        TAMARINDO #tamarinco
        |
        MAMEY   #mamey
        |
        SANDIA  #sandia
        |
        MANGO   #mango
        |
        CIRUELA #ciruela
        |
        CHABACANO #chabacano
        |
        PERA    #pera
        |
        DURAZNO #durazno
        |
        HIGO    #higo
        |
        MEMBRILLO #membirllo
        |
        TUNA    #tuna
        |
        UVA     #uva
        |
        CAPULIN #capulin
        |
        CEREZA  #cereza
        |
        JICAMA  #jicama
        |
        CANA    #cana
        |
        CHIRIMOYA #chirimoya
        |
        CHICOZAPOTE #chichozapote
        |
        TEJOCOTE #tejocote
        ;

FRESA   :('fresa'|'fresas' |'Fresa'| 'Fresas' | 'FRESA' | 'FRESAS');
GUAYABA :('guayaba'|'guayabas'|'Guayaba'|'Guayabas'|'GUAYABA'| 'GUAYABAS');
JAMAICA :('jamaica'|'jamaicas'|'Jamaica'|'Jamaicas'|'JAMAICA'|'JAMAICAS');
LIMA    :('lima' | 'limas' |'Lima'|'Limas' |'LIMA' | 'LIMAS');
LIMON   :('limón' | 'limones' |'Limón'|'Limones' |'LIMÓN' | 'LIMONES');
MANDARINA  :('mandarina' | 'mandarinas' |'Mandarina'|'Mandarinas' |'MANDARINA' | 'MANDARINAS');
MELON   :('melón' | 'melones' |'Melón'|'Melones' |'MELÓN' | 'MELONES');
NARANJA :('naranja' | 'naranjas' |'Naranja'|'Naranjas' |'NARANJA' | 'NARANJAS');
PINA    :('piña' | 'piñas' |'Piña'|'Piñas' |'PIÑA' | 'PIÑAS');
PAPAYA  :('papaya' | 'papayas' |'Papaya'|'Papayas' |'PAPAYA' | 'PAPAYAS');
PLATANO :('plátano' | 'plátanos' |'Plátano'|'Plátanos' |'PLÁTANO' | 'PLÁTANOS');
TORONJA :('toronja' | 'toronjas' |'Toronja'|'Toronjas' |'TORONJA' | 'TORONJAS');
GRANADA :('granada' | 'granadas' |'Granada'|'Granadas' |'GRANADA' | 'GRANADAS');
TAMARINDO :('tamarindo' | 'tamarindos' |'Tamarindo'|'Tamarindos' |'TAMARINDO' | 'TAMARINDOS');
MAMEY   :('mamey' | 'mameyes' |'Mamey'|'Mameyes' |'MAMEY' | 'MAMEYES');
SANDIA  :('sandía' | 'sandías' |'Sandía'|'Sandías' |'SANDÍA' | 'SANDÍAS');
MANGO   :('mango' | 'mangos' |'Mango'|'Mangos' |'MANGO' | 'MANGOS');
CIRUELA :('ciruela' | 'ciruelas' |'Ciruela'|'Ciruelas' |'CIRUELA' | 'CIRUELAS');
CHABACANO :('chabacano' | 'chabacanos' |'Chabacano'|'Chabacanos' |'CHABACANO' | 'CHABACANOS');
PERA    :('pera' | 'peras' |'Pera'|'Peras' |'PERA' | 'PERAS');
DURAZNO :('durazno' | 'duraznos' |'Durazno'|'Duraznos' |'DURAZNO' | 'DURAZNOS');
HIGO    :('higo' | 'higos' |'Higo'|'Higos' |'HIGO' | 'HIGOS');
MEMBRILLO :('membrillo' | 'membrillos' |'Membrillo'|'Membrillos' |'MEMBRILLO' | 'MEMBRILLOS');
TUNA    :('tuna' | 'tunas' |'Tuna'|'Tunas' |'TUNA' | 'TUNAS');
UVA     :('uva' | 'uvas' |'Uva'|'Uvas' |'UVA' | 'UVAS');
CAPULIN :('capulín' | 'capulínes' |'Capulín'|'Capulínes' |'CAPULÍN' | 'CAPULÍNES');
CEREZA  :('cereza' | 'cerezas' |'Cereza'|'Cerezas' |'CEREZA' | 'CEREZAS');
JICAMA  :('jicama' | 'jicamas' |'Jicama'|'Jicamas' |'JICAMA' | 'JICAMAS');
CANA  :('caña' | 'cañas' |'Caña'|'Cañas' |'CAÑA' | 'CAÑAS');
CHIRIMOYA  :('chirimoya' | 'chirimoyas' |'Chirimoya'|'Chirimoyas' |'CHIRIMOYA' | 'CHIRIMOYAS');
CHICOZAPOTE  :('chicozapote' | 'chicozapotes' |'Chicozapote'|'Chicozapotes' |'CHICOZAPOTE' | 'CHICOZAPOTES');
TEJOCOTE  :('tejocote' | 'tejocotes' |'Tejocote'|'Tejocotes' |'TEJOCOTE' | 'TEJOCOTES');

ENERO   :'Enero';
FEBRERO :'Febrero';
MARZO   :'Marzo';
ABRIL   :'Abril';


NOSPACE :[a-zA-Z \n] -> skip;
WS      :[\t\r\n]+ -> skip;