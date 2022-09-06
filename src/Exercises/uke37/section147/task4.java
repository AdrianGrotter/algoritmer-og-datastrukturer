package Exercises.uke37.section147;

import eksempelklasser.Komparator;
import eksempelklasser.Person;
import structure.Tabell;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen

        Tabell.innsettingssortering(p, Komparator.orden(Person::etternavn));
        System.out.println(Arrays.toString(p));
    }
}
