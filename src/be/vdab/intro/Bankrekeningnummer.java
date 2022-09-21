/*
* 1.4 Bankrekeningnummer
Schrijf een programma om te testen of een bankrekeningnummer een geldig nummer is.
Je kan dit testen door het getal gevormd door de eerste 10 cijfers van het bankrekeningnummer te
delen door 97. De rest van deze deling zou gelijk moeten zijn aan het getal gevormd door de 2 laatste
cijfers van het bankrekeningnummer.
Gebruik volgende correcte rekeningnummers ter controle:
823445816730
237824199569
662431212859
737524091952
Gebruik volgende foutieve rekeningnummers ter controle:
111224444891
777553241844
* */
package be.vdab.intro;

public class Bankrekeningnummer {
    public static void main(String[] args) {
//        var bankNummer = 823445816730L;
//        var bankNummer = 237824199569L;
//        var bankNummer = 662431212859L;
//        var bankNummer = 737524091952L;
//        var bankNummer = 111224444891L;
        var bankNummer = 777553241844L;
        var eersteTien = bankNummer/100;
        var testEersteTien = eersteTien%97;
        var laatsteTwee = bankNummer%100;
        System.out.println(testEersteTien==laatsteTwee);

    }
}
