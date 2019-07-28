# Kostka do gry

**W grach planszowych i papierowych RPG używa się wielu rodzajów kostek do gry, nie tylko tych dobrze znanych, sześciennych. Jedną z popularniejszych kości jest np. kostka dziesięciościenna, a nawet stuścienna!**

**Ponieważ w grach kośćmi rzuca się często, pisanie za każdym razem np. "rzuć dwiema kostkami dziesięciościennymi, a do wyniku dodaj 20", byłoby żmudne, czasochłonne i marnowałoby ogromne ilości papieru.**

**W takich sytuacjach używa się kodu skracającego polecenie np.:**
```"rzuć 2D10+20".```

Kod takiej kostki wygląda następująco: ```xDy+z```

gdzie:

    y – rodzaj kostek, których należy użyć (np. D6, D10),
    x – liczba rzutów kośćmi (jeśli rzucamy raz, ten parametr jest pomijalny),
    z – (opcjonalnie) liczba, którą należy dodać (lub odjąć) do wyniku rzutów.

Napisano funkcję, która:
1. przyjmuje w parametrze taki kod w postaci String,
2. rozpoznaje wszystkie dane wejściowe:
    - rodzaj kostki,
    - liczbę rzutów,
    - modyfikator,
3. wykonuje symulację rzutów i zwraca wynik.
