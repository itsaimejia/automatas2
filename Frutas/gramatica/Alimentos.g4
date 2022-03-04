grammar Alimentos;

grupo   :(frutas+ | meses)+;
meses   :
        ENERO  frutas+  #enero
        |
        FEBRERO frutas+ #febrero
        |
        MARZO frutas+ #marzo
        |
        ABRIL  frutas+ #abril
        |
        MAYO frutas+ #mayo
        |
        JUNIO frutas+ #junio
        |
        JULIO frutas+ #julio
        |
        AGOSTO frutas+ #agosto
        |
        SEPTIEMBRE frutas+ #septiembre
        |
        OCTUBRE frutas+ #octubre
        |
        NOVIEMBRE frutas+ #noviembre
        |
        DICIEMBRE frutas+ #diciembre
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
LIMON   :('lim\u00F3n' | 'limones' |'Lim\u00F3n'|'Limones' |'LIM\u00D3N' | 'LIMONES');
MANDARINA  :('mandarina' | 'mandarinas' |'Mandarina'|'Mandarinas' |'MANDARINA' | 'MANDARINAS');
MELON   :('mel\u00F3n' | 'melones' |'Mel\u00F3n'|'Melones' |'MEL\u00D3N' | 'MELONES');
NARANJA :('naranja' | 'naranjas' |'Naranja'|'Naranjas' |'NARANJA' | 'NARANJAS');
PINA    :('pi\u00F1a' | 'pi\u00F1as' |'Pi\u00F1a'|'Pi\u00F1as' |'PI\u00D1A' | 'PI\u00D1AS');
PAPAYA  :('papaya' | 'papayas' |'Papaya'|'Papayas' |'PAPAYA' | 'PAPAYAS');
PLATANO :('pl\u00E1tano' | 'pl\u00E1tanos' |'Pl\u00E1tano'|'Pl\u00E1tanos' |'PL\u00C1TANO' | 'PL\u00C1TANOS');
TORONJA :('toronja' | 'toronjas' |'Toronja'|'Toronjas' |'TORONJA' | 'TORONJAS');
GRANADA :('granada' | 'granadas' |'Granada'|'Granadas' |'GRANADA' | 'GRANADAS');
TAMARINDO :('tamarindo' | 'tamarindos' |'Tamarindo'|'Tamarindos' |'TAMARINDO' | 'TAMARINDOS');
MAMEY   :('mamey' | 'mameyes' |'Mamey'|'Mameyes' |'MAMEY' | 'MAMEYES');
SANDIA  :('sand\u00EDa' | 'sand\u00EDas' |'Sand\u00EDa'|'Sand\u00EDas' |'SAND\u00CDA' | 'SAND\u00CDAS');
MANGO   :('mango' | 'mangos' |'Mango'|'Mangos' |'MANGO' | 'MANGOS');
CIRUELA :('ciruela' | 'ciruelas' |'Ciruela'|'Ciruelas' |'CIRUELA' | 'CIRUELAS');
CHABACANO :('chabacano' | 'chabacanos' |'Chabacano'|'Chabacanos' |'CHABACANO' | 'CHABACANOS');
PERA    :('pera' | 'peras' |'Pera'|'Peras' |'PERA' | 'PERAS');
DURAZNO :('durazno' | 'duraznos' |'Durazno'|'Duraznos' |'DURAZNO' | 'DURAZNOS');
HIGO    :('higo' | 'higos' |'Higo'|'Higos' |'HIGO' | 'HIGOS');
MEMBRILLO :('membrillo' | 'membrillos' |'Membrillo'|'Membrillos' |'MEMBRILLO' | 'MEMBRILLOS');
TUNA    :('tuna' | 'tunas' |'Tuna'|'Tunas' |'TUNA' | 'TUNAS');
UVA     :('uva' | 'uvas' |'Uva'|'Uvas' |'UVA' | 'UVAS');
CAPULIN :('capul\u00EDn' | 'capulines' |'Capul\u00EDn'|'Capulines' |'CAPUL\u00CDN' | 'CAPULINES');
CEREZA  :('cereza' | 'cerezas' |'Cereza'|'Cerezas' |'CEREZA' | 'CEREZAS');
JICAMA  :('jicama' | 'jicamas' |'Jicama'|'Jicamas' |'JICAMA' | 'JICAMAS');
CANA  :('ca\u00F1a' | 'ca\u00F1as' |'Ca\u00F1a'|'Ca\u00F1as' |'CA\u00D1A' | 'CA\u00D1AS');
CHIRIMOYA  :('chirimoya' | 'chirimoyas' |'Chirimoya'|'Chirimoyas' |'CHIRIMOYA' | 'CHIRIMOYAS');
CHICOZAPOTE  :('chicozapote' | 'chicozapotes' |'Chicozapote'|'Chicozapotes' |'CHICOZAPOTE' | 'CHICOZAPOTES');
TEJOCOTE  :('tejocote' | 'tejocotes' |'Tejocote'|'Tejocotes' |'TEJOCOTE' | 'TEJOCOTES');

ENERO   :'Enero';
FEBRERO :'Febrero';
MARZO   :'Marzo';
ABRIL   :'Abril';
MAYO    :'Mayo';
JUNIO   :'Junio';
JULIO   :'Julio';
AGOSTO  :'Agosto';
SEPTIEMBRE:'Septiembre';
OCTUBRE :'Octubre';
NOVIEMBRE:'Noviembre';
DICIEMBRE:'Diciembre';

NOCHARS :[.,:\u00BF\u003F\u0021\u00A1\u00F1\u00D1]+ -> skip;
NOVOCAL :[\u00C1-\u00DA\u00E1-\u00FA]+ -> skip;
NOWORDS :[a-zA-Z \n] -> skip;
WS      :[\t\r\n]+ -> skip;