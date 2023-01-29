# World building

- da wir ein "unendliche" map machen, kommen um prozedurale generierung nicht herum
- ein kompromiss wäre es fix "Abschnitte" zu haben, die 
  - eine fixe Länge (x) und fixe Höhe (screen.y = 160px) besitzen
  - dynmisch mit obstacles, enemies, traps etc. befüllt werden
  - dynamisch mit "Farben" versehen werden

- mit Beginn eines neuen Abschnitts vergrößert sich der Schwierigkeitsgrad, der entweder
  - höhere Geschwindigkeit
  - schwerere obstacles
  - schwerere enemies
  - schwerere traps bedeutet

## Beispiel

```
|             |             |             |      ---    |        []   |     []      |             |
|   A         |  B    ------|  C          |   D  ---    |---E---------|  F          |   G         | --->
|             |   ------    |---       [] |      ---    |             |             |             |
|----^^^------|---^^^^^^^^^^|^^^^^--------|------^^^^---|-------------|-------------|-------------|-------
===========================================================================================================


-- Ground
[] Enemy
^^ Trap
```

## Pseudocode für world building algorithmus (noch unstrukturiert)

- lade ersten Abschnitt
- wenn user x% des Abschnitts absolviert hat, lade nächsten Abschnitt
- für zu ladenden Abschnitt,
   - errechne aktuellen score (aktuelle Position + gesammelte powerups usw.)
   - platziere Farbpalette, basierend auf score
   - platziere enemies, basierend auf score
   - platziere obstacles, basierend auf score
