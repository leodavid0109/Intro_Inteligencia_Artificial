/*Hechos*/
profesor(diana).
profesor(manuel).
estudiante(laura).
estudiante(santiago).
estudiante(mateo).
estudiante(mariana).

profesor_de(diana, laura).
profesor_de(diana, santiago).
profesor_de(manuel, mateo).
profesor_de(manuel, mariana).

/*Reglas*/
companero(X, Y) :- estudiante(X), estudiante(Y),
    X\=Y, profesor_de(Z, X), profesor_de(Z, Y).

/*Consultas
profesor(X).
companero(X,Y).
trace, companero(X,laura).
companero(_,mateo). /*¿Alguien es compañero de Laura?*/