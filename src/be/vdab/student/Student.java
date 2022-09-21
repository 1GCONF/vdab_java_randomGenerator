package be.vdab.student;

public class Student {
    private String naam;
    private int score;
    public Student( String naam){
        this.naam=naam;
    }
    public Student(String naam, int score) {
        this(naam);
        this.score = score;
    }

}
