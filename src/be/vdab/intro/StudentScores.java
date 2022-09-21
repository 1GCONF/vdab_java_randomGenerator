/*
 1.1 Student scores
Een student behaalt op een examen volgende scores: 8, 6, 9 en 4. De maximum score voor ieder vak
is 10. Maak een programma dat het gemiddelde berekent (als decimaal getal) en het behaalde
percentage.*/
package be.vdab.intro;

public class StudentScores {
    public static void main(String[] args) {
        var scores = new double[] {0.8,0.6,0.9,0.4};
        double som = 0;
        for(int i =0; i<scores.length;i++){
            som+=scores[i];
        }
        System.out.println(som/scores.length);
    }
}

