% Definición de colores - Se sabe que para el ejercicio el mínimo de colores que se necesitan son 3, por conocimientos en grafos.
color(amarillo). color(azul). color(rojo).

coloreo_mapas(A, B, C, D, E, F, G, H, I) :-
    
    % Recorrido de arriba a abajo, en orden
    color(A),
    
    color(B), \+ A = B,
    color(C), \+ C = A, \+ C = B,
    
    color(D), \+ D = B,
    color(E), \+ E = D, \+ E = B, \+ E = C,
    color(F), \+ F = D, \+ F = E, \+ F = C,
    
    color(G), \+ G = D, \+ G = F,
    color(H), \+ H = G, \+ H = F,
    color(I), \+ I = F, \+ I = H.