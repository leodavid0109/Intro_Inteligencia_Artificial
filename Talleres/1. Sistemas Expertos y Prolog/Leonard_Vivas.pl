/* SISTEMA EXPERTO FUTBOLÍSTICO*/
busqueda(Jugador, Posicion, Nacionalidad, Liga, Valoracion1) :-
    write('¿En qué posición juega el jugador? (defensa / mediocentro / delantero)'),
    read(Posicion),
    write('¿Cuál es la liga en la que juega tu jugador? (espana / inglaterra / italia, francia)'),
    read(Liga),
    write('Ingrese la valoración mínima del jugador (85-94)'),
    read(Valoracion),
    compvaloracion(Jugador, Valoracion1, Posicion, Liga, Valoracion),
    jugador(Jugador, Posicion, Nacionalidad, Liga, Valoracion1).

compvaloracion(Jugador, Valoracion, Posicion, Liga, Threshold) :-
    jugador(Jugador, Posicion, _, Liga,  Valoracion), Valoracion >= Threshold.

/* HECHOS; en estos se describirán los jugadores con su nombre, posición, nacionalidad, liga y su valoración en el FIFA*/
% La Liga (España)
jugador('Lionel Messi', delantero, argentino, espana, 93).
jugador('Sergio Ramos', defensa, espanol, espana, 89).
jugador('Luka Modric', mediocentro, croata, espana, 87).
jugador('Antoine Griezmann', delantero, frances, espana, 86).
jugador('Gerard Pique', defensa, espanol, espana, 86).
jugador('Jan Oblak', portero, esloveno, espana, 91).
jugador('Karim Benzema', delantero, frances, espana, 89).
jugador('Jordi Alba', defensa, espanol, espana, 86).
jugador('Casemiro', mediocentro, brasileno, espana, 89).
jugador('Frenkie de Jong', mediocentro, neerlandes, espana, 86).

% Premier League (Inglaterra)
jugador('Virgil van Dijk', defensa, neerlandes, inglaterra, 90).
jugador('Kevin De Bruyne', mediocentro, belga, inglaterra, 91).
jugador('Mohamed Salah', delantero, egipcio, inglaterra, 90).
jugador('Harry Kane', delantero, ingles, inglaterra, 88).
jugador('Bruno Fernandes', mediocentro, portugues, inglaterra, 87).
jugador('Raheem Sterling', delantero, ingles, inglaterra, 88).
jugador('NGolo Kante', mediocentro, frances, inglaterra, 88).
jugador('Alisson Becker', portero, brasileno, inglaterra, 90).
jugador('Sadio Mane', delantero, senegales, inglaterra, 89).
jugador('Trent Alexander-Arnold', defensa, ingles, inglaterra, 87).

% Serie A (Italia)
jugador('Cristiano Ronaldo', delantero, portugues, italia, 94).
jugador('Paulo Dybala', delantero, argentino, italia, 87).
jugador('Kalidou Koulibaly', defensa, senegales, italia, 88).
jugador('Lautaro Martinez', delantero, argentino, italia, 85).
jugador('Giorgio Chiellini', defensa, italiano, italia, 87).
jugador('Wojciech Szczesny', portero, polaco, italia, 86).
jugador('Zlatan Ibrahimovic', delantero, sueco, italia, 85).
jugador('Gianluigi Donnarumma', portero, italiano, italia, 89).
jugador('Dries Mertens', delantero, belga, italia, 85).
jugador('Leonardo Bonucci', defensa, italiano, italia, 85).

% Ligue 1 (Francia)
jugador('Kylian Mbappe', delantero, frances, francia, 91).
jugador('Neymar Jr', delantero, brasileno, francia, 91).
jugador('Marco Verratti', mediocentro, italiano, francia, 86).
jugador('Marquinhos', defensa, brasileno, francia, 87).
jugador('Keylor Navas', portero, costarricense, francia, 87).
jugador('Angel Di Maria', mediocentro, argentino, francia, 86).
jugador('Memphis Depay', delantero, neerlandes, francia, 85).
jugador('Mauro Icardi', delantero, argentino, francia, 85).
jugador('Presnel Kimpembe', defensa, frances, francia, 84).
jugador('Leandro Paredes', mediocentro, argentino, francia, 83).
