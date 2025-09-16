num(0). num(1). num(2). num(3). num(4). num(5). num(6). num(7). num(8). num(9).

criptoaritmetica(C, R, O, S, A, D, N, G, E) :-
    
    % Recorrido número a número y de derecha a izquierda
    num(S), 
    num(R), \+ R = 0, \+ R = S,
    
    R is (S + S) mod 10,
    C1 is (S + S) // 10,
    
    % Inferencia D = 1 es por criptoaritmética
    num(D), D = 1, \+ S = D, \+ R = D,
    num(E), \+ S = E, \+ R = E, \+ D = E,
    
    E is (S + D + C1) mod 10,
    C2 is (S + D + C1) // 10,
    
    num(O), \+ O = S, \+ O = R, \+ O = D, \+ O = E,
    num(A), \+ S = A, \+ R = A, \+ A = D, \+ A = E, \+ O = A,
    num(G), \+ S = G, \+ R = G, \+ D = G, \+ G = E, \+ O = G, \+ A = G,
    
    G is (O + A + C2) mod 10,
    C3 is (O + A + C2) // 10,
    
    num(N), \+ S = N, \+ R = N, \+ D = N, \+ N = E, \+ O = N, \+ A = N, \+ N = G,
    
    N is (R + O + C3) mod 10,
    C4 is (R + O + C3) // 10,
    
    num(C), \+ C = 0, \+ C = S, \+ C = R, \+ C = D, \+ C = E, \+ C = O, \+ C = A, \+ C = G, \+ C = N,
    
    A is (C + R + C4) mod 10,
    D is (C + R + C4) // 10,
    
    !.