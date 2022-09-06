package Exercises.uke37.section146;

import eksempelklasser.Student;
import eksempelklasser.Studium;
import structure.Tabell;

public class task3 {
    public static void main(String[] args) {
        Student[] s = new Student[5];                             // en studenttabell
        s[0] = new Student("Kari","Svendsen", Studium.Data);      // Kari Svendsen
        s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
        s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
        s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
        s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen

        Tabell.innsettingssortering(s, (s1, s2) ->{
            int k = s1.studium().compareTo(s2.studium());
            if(k != 0) return k;
            int f = s1.fornavn().compareTo(s2.fornavn());
            if (f != 0) return f;
            return s1.etternavn().compareTo(s2.etternavn());
        });
    }
}
