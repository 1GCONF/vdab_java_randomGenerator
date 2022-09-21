/*
1.3 Snoepautomaat
Gegeven: een te betalen bedrag voor een snoep uit een snoepautomaat. De kostprijs van de
verschillende snoepen varieert tussen € 0,30 en € 1,20. De klant kan enkel betalen met een muntstuk
van € 2. Het programma dient het wisselgeld uit te rekenen: hoeveel muntstukken van € 1, € 0.50,
€ 0.20, € 0.10, € 0.05, € 0.02 en € 0.01 dienen er teruggegeven te worden? Steeds met zo weinig
mogelijk munten!
Test het programma voor een aankoop van € 0.42 , voor een aankoop van € 1.02 , …
* */
package be.vdab.intro;


public class Snoepautomaat {
    public static void main(String[] args) {
        // vars

        var bedrag = 7.75;

        var keuze = 1.30;

        var restMetDecimalen = bedrag - keuze;

        // HoofdOperatie

        System.out.println("Terug te geven: "+restMetDecimalen);

        var rest = (int) (restMetDecimalen*100);

        var van_100= rest/100;
        rest-=100*van_100;
        System.out.println("Van 1: " + van_100);

        var van_50 = rest/50;
        rest-=50*van_50;
        System.out.println("Van 0.50: " + van_50);

        var van_20 = rest/20;
        rest-=20*van_20;
        System.out.println("Van 0.20: " + van_20);

        var van_10 = rest/10;
        rest-=10*van_10;
        System.out.println("Van 0.10: " + van_10);

        var van_5 = rest/5;
        rest-=5*van_5;
        System.out.println("Van 0.05: " + van_5);

        var van_2 = rest/2;
        rest-=2*van_2;
        System.out.println("Van 0.02: " + van_2);

        var van_1 = rest/1;
        rest-=1*van_1;
        System.out.println("Van 0.01: " + van_1);
    }
}
