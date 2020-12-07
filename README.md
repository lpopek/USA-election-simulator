# US Election Simulator

## Opis

Gra turowa polegająca na zdobyciu 270 głosów elektorskich pozwalająca zdobyć fotel prezydenta USA. Początkowo gracz wybiera sprawy publiczne, jakimi będzie zajmował podczas swojej kampanii.
Następnie wykonując poszczególne decyzje takie jak podróż z przemówieniem, wyemitowanie spotu, zdobycie funduszów na kampanie zwiększa lub zmniejsza poparcie w danym stanie.
Mogą wydarzyć się niespodziewane okoliczności, które spowodują krajowe bądź lokalne zmiany poparcia. 

## Klasy i ich funkcjonalności (zarys)

### State
- opisuje jednostkę administracyjną w USA
- opisuje ilość głosów elektorskich
- opisuje wpływy (% wpływów konserwatywnych (republikańskich), liberalnych (demokratycznych) i niezdecydowanych)
- opisuje typ stanu (demokratyczny, raczej demokratyczny, "swing state" , raczej republikański, republikański)

### Player 
- opisuje gracza grającego w grę
- opisuje z jakiej partii dany gracz i ile ma środków, które może wykorzystać na zwiększenie swojego poparcia
- wykonuje podróże do posczególnych stanów wygałaszając przemówienia
- _podejmuje decyzje wobec wydarzeń, ustosunkowuje się do wypowiedzi polityków_
- _wybiera cechy (WADY I ZALETY) które wzmacniają/zmniejszają poaprcie ludnosci_

### Game
- główna klasa obsługująca przebieg rozgrywki
- posiada informacje o wszystkich stanach i graczu
- generuje losowe wypadki

### Decision:
- _wpływa na poparcie globalne lub lokalne_

### Journey:
- _czas i miejsce w jakim się odbywa_ 
- _wygłaszane są przemowy wpływające na poparacie w danym stanie_
    
### Unpredictable Event:
- _powodują nagły wzrost lub spadek poparcia lokalnie lub ogólnokrajowo_

### Debate:
- _wymusza decyzje i odpowiedzi na pewne pytania_

### Klasy wizualizujace, inicjujace, ect.


### Użyta technologia:
Java 