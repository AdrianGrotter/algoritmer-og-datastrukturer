package Exercises.uke37.section147;

import eksempelklasser.Komparator;
import structure.Tabell;

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {
        Boolean[] b = {false, true, true, false, false, true, false, true};

        Tabell.innsettingssortering(b, Komparator.naturligOrden());
        System.out.println(Arrays.toString(b));
    }
}
