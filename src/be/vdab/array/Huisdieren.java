/*Maak een programma waarin je de gebruiker vraagt hoeveel huisdieren hij/zij heeft. Toon voor de
aantallen 0 t/m 3 telkens een gepaste melding op het scherm. Voor een aantal groter dan 3, toon
dan een standaardbericht op het scherm*/

package be.vdab.array;
import java.util.Scanner;
public class Huisdieren {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("\nHoeveel huisdieren heb je?");
        var huisdieren = scanner.nextInt();
        switch (huisdieren) {
            case 0 -> System.out.println("Niet echt verzot op dieren?");
            case 1 -> System.out.println("Een eenzaam beestje?");
            case 2 -> System.out.println("Twee beestjes maken ruzie.");
            case 3 -> System.out.println("Drie beestjes, leuk!");
            default -> System.out.println("Zoveel dieren, lijkt wel klein Bokrijk!");
        }
    }

}
