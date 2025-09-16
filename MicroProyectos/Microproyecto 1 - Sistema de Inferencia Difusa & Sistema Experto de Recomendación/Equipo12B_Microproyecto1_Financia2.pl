% Base de conocimientos con reglas que definen las inversiones disponibles

% Regla 1: Diversificación baja, liquidez muy baja
inversion('Bonos Gubernamentales', Diversificacion, Liquidez) :-
    Diversificacion =< 3,
    Liquidez =< 25.

% Regla 2: Diversificación baja, liquidez baja
inversion('Bonos Corporativos', Diversificacion, Liquidez) :-
    Diversificacion =< 3,
    Liquidez > 25, Liquidez =< 55.

% Regla 3: Diversificación baja, liquidez alta
inversion('Oro', Diversificacion, Liquidez) :-
    Diversificacion =< 3,
    Liquidez > 70.

% Regla 4: Diversificación moderada, liquidez muy baja
inversion('Fondos Inmobiliarios', Diversificacion, Liquidez) :-
    Diversificacion >= 2, Diversificacion < 6,
    Liquidez =< 25.

% Regla 5: Diversificación moderada, liquidez baja
inversion('Fondos Mutuos', Diversificacion, Liquidez) :-
    Diversificacion >= 2, Diversificacion < 6,
    Liquidez > 25, Liquidez =< 55.

% Regla 6: Diversificación moderada, liquidez moderada
inversion('Certificados de Depósito', Diversificacion, Liquidez) :-
    Diversificacion > 2, Diversificacion < 6,
    Liquidez > 50, Liquidez =< 75.

% Regla 7: Diversificación alta, liquidez muy baja
inversion('Criptomonedas', Diversificacion, Liquidez) :-
    Diversificacion >= 4, Diversificacion =< 8,
    Liquidez =< 25.

% Regla 8: Diversificación alta, liquidez baja
inversion('Acciones Tecnológicas', Diversificacion, Liquidez) :-
    Diversificacion >= 4, Diversificacion =< 8,
    Liquidez > 25, Liquidez =< 55.

% Regla 9: Diversificación alta, liquidez alta
inversion('Acciones de Consumo', Diversificacion, Liquidez) :-
    Diversificacion >= 4, Diversificacion =< 8,
    Liquidez > 70.

% Regla 10: Diversificación muy alta, liquidez muy baja
inversion('Inversión en Venture Capital', Diversificacion, Liquidez) :-
    Diversificacion >= 7,
    Liquidez =< 25.

% Regla 11: Diversificación muy alta, liquidez baja
inversion('Fondos Indexados', Diversificacion, Liquidez) :-
    Diversificacion >= 7,
    Liquidez > 25, Liquidez =< 55.

% Regla 12: Diversificación muy alta, liquidez moderada
inversion('Fondos Sostenibles', Diversificacion, Liquidez) :-
    Diversificacion >= 7,
    Liquidez > 50, Liquidez =< 75.

% Consulta principal para recomendar inversiones
recomendar_inversion(Inversion) :-
    write('¿Cuál es tu nivel de diversificación? (1-10): '), read(Diversificacion),
    write('¿Cuál es tu nivel de liquidez? (0-100): '), read(Liquidez),
    write('Puedes considerar las siguientes inversiones: '), nl,
    inversion(Inversion, Diversificacion, Liquidez).

