# US Election Simulator



## Opis

Gra turowa polegająca na zdobyciu 270 głosów elektorskich pozwalająca zdobyć fotel prezydenta USA. Początkowo gracz wybiera sprawy publiczne, jakimi będzie zajmował podczas swojej kampanii.
Następnie wykonując poszczególne decyzje takie jak podróż z przemówieniem, wyemitowanie spotu, zdobycie funduszów na kampanie zwiększa lub zmniejsza poparcie w danym stanie.
Mogą wydarzyć się niespodziewane okoliczności, które spowodują krajowe bądź lokalne zmiany poparcia. 


## Instrukcja Obsługi:
Gracz wybiera partię dla której bedzie walczył o fotel prezydencki. Inicjalizowana jest rozgrywka w losowy sposób. 
Stany zaznaczone na czerwono obrazują te stany gdzie prowadzą republikanie, natomiast na niebiesko tam gdzie prowadzą demokraci. Po lewej stronie ekranu znjaduje się panel informacji 
o danym stanie.

Jest 5 rodzajów stanów:

### stan demokratyczny i stany skłaniający się ku demokratom - stany w których akcje gracza demokartaycznego odnszą lepszy efekt
### swing states - stan dla którego akcje gracza odnoszą taki sam skutek
### stany republikański i stany skłaniający się ku republikanom - stany w których akcje gracza republikańskiegoodnszą lepszy efekt

Gracz ma do dyspozycji 3 akcje:
### Zebranie funduszy - pozwalające wykoywać inne akcje. 

### przeprowadznie wizyty - gracz wizytuje stan przekonując do siebie część NIEZDEYCDOWANYCH wyborców.  

### przepradznie kamapani telewizyjnej - powoduje przeniesienie części wyborców niezdecydwanych do puli poparcia gracza, oraz co ważne przenoszą wyborców przeciwnej partii do pulii niezdecydowanych

Aby wykonać akcje zwiększające poparacie trzeb mieć wystaczającą liczbę funduszy.
Na każdą ture przypada 3 akcje z czego nie można powtarzać danej akcji w w jednym stanie.
Wygrywa gracz który zdobędzie 274 i więcej głosów.

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

### Debate:
- _wymusza decyzje i odpowiedzi na pewne pytania_

### Issue:
- _pytanie z debaty_
- _wybór odpowiedzi_

### Answer:
- _odpowiedź na dane pytanie_
- _procent zgodności z daną partią_

### Decision:
- _wpływa na poparcie globalne lub lokalne_

### Journey:
- _czas i miejsce w jakim się odbywa_ 
- _wygłaszane są przemowy wpływające na poparacie w danym stanie_
    
### Unpredictable Event:
- _powodują nagły wzrost lub spadek poparcia lokalnie lub ogólnokrajowo_

### Klasy wizualizujace, inicjujace, ect.


### Użyta technologia:
Java 
JUnit 5