package Exercises.uke43.section523;

import eksempelklasser.SBinTre;
import structure.Tabell;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class task3 {
    public static void main(String[] args) {
        /*Character[] bokstaver =
                {'I','O','E','A','G','M','C','F','H','K','N','B','D','J','L'};

        SBinTre<Character> tre = SBinTre.sbintre(Stream.of(bokstaver));

        System.out.println("Høyde: "+tre.høyde());
        System.out.println("Antall: "+tre.antall());
        System.out.println(tre);*/


        //for(int i = 1950; i < 2014; i++) System.out.print(i + ", ");

        //System.out.println("Første: "+"Aa".hashCode() + " Andre: "+"BB".hashCode());

        /*int n = 197;
        int[] hash = new int[n];

        for (int i = 0; i < 400; i++)
        {
            String s = "A";
            if (i < 100) s += 0;
            if (i < 10) s += 0;
            s += i;
            hash[s.hashCode() % n]++;
        }

        int m = Tabell.maks(hash);  // posisjonen til største verdi

        int maks = hash[m];         // den største verdien

        int[] frekvens = new int[maks + 1];
        for (int i = 0; i < hash.length; i++) frekvens[hash[i]]++;  // teller opp

        System.out.println(Arrays.toString(frekvens));  // [0, 48, 95, 54]*/

    }
}
