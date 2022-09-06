package Exercises.uke37.section146;

import eksempelklasser.Komparator;
import eksempelklasser.Student;
import eksempelklasser.Studium;
import structure.Tabell;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        Student[] s = new Student[5];                             // en studenttabell
        s[0] = new Student("Kari","Svendsen",Studium.Data);      // Kari Svendsen
        s[1] = new Student("Boris","Zukanovic", Studium.IT);      // Boris Zukanovic
        s[2] = new Student("Ali","Kahn", Studium.Anvendt);        // Ali Kahn
        s[3] = new Student("Azra","Zukanovic", Studium.IT);       // Azra Zukanovic
        s[4] = new Student("Kari","Pettersen", Studium.Data);     // Kari Pettersen

        /*Komparator<Student> c = (s1,s2) ->
        {
            int cmp = s1.studium().compareTo(s2.studium());
            return cmp != 0 ? cmp : s1.compareTo(s2);
        };*/

        Tabell.innsettingssortering(s, (s1,s2) ->
        {
            int cmp = s1.studium().compareTo(s2.studium());
            return cmp != 0 ? cmp : s1.compareTo(s2);
        });
        System.out.println(Arrays.toString(s));
    }
}
