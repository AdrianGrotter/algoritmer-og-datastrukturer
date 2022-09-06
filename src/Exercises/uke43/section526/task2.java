package Exercises.uke43.section526;

import eksempelklasser.SBinTre;

import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {
        Character[] bokstaver =
                {'I','O','E','A','G','M','M','M','M','C','F','H','K','N','B','D','J','L'};

        SBinTre<Character> tre = SBinTre.sbintre(Stream.of(bokstaver));

        System.out.println(tre.antall('M'));
    }
}
