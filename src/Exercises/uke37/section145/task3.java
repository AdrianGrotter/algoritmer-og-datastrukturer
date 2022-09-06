package Exercises.uke37.section145;

import eksempelklasser.Maaned;
import eksempelklasser.Studium;

public class task3 {
    public static void main(String[] args) {
        for (Maaned s : Maaned.høst())
        {
            System.out.println(s.toString() + " (" + s.name() + ")"+" Nr: "+s.mndnr());
        }
    }
}
