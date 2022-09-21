/*
1.2 Omrekening seconden
Maak een programma dat een geheel aantal seconden, bijvoorbeeld 5924, omrekent in uren,
minuten en seconden.
Het resultaat kan als volgt getoond worden : U:1 M:38 S:44*/
package be.vdab.intro;

public class Omrekening {
    public static void main(String[] args) {
        int sec = 5924;
        var uur = sec / 3600;
        var min = (sec%3600);
        var sec_rest = min%60;
        System.out.println("U:"+uur);
        System.out.println("M:"+min/60);
        System.out.println("S:"+sec_rest);
    }
}

