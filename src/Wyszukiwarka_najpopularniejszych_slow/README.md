# Wyszukiwarka najpopularniejszych słów

###Zaimportowano do projektu bibliotekę jsoup, można ją pobrać z adresu: https://jsoup.org/download

**Program wyszukuje w popularnych serwisach internetowych nagłówków artykułów, a następnie zapiszuje pojedyncze słowa w nich występujące do pliku o nazwie ``popular_words.txt``.**
    Działanie programu:
    
   1. Wywołuje pobieranie dla wybranych serwisów internetowych.
   2. Pomina wszystkie elementy krótsze niż 3-znakowe.
   3. Tworzy tablicę elementów wykluczonych np. oraz, ponieważ
   4. Wczytuje utworzony plik ``popular_words.txt`` i na jego podstawie tworzy plik ``filtered_popular_words.txt``, który zawierać będzie wszystkie znalezione słowa, pomijając słowa wykluczone.