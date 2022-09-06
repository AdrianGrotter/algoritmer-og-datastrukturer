package Exercises.uke43.section527;

import eksempelklasser.SBinTre;
import org.w3c.dom.Node;

import java.util.StringJoiner;
import java.util.stream.Stream;

public class task4 {
    public static void main(String[] args) {
        int[] b = {1,2,5,9,11,13,15,0,0,0};
        Mengde B = new Mengde(b, 6); // de 6 første verdiene i b
        System.out.println(B); // et implisitt kall på toString
// Utskrift: [1, 2, 5, 9, 11, 13]

    }
    public static class Mengde
    {
        private int[] a;
        public Mengde() // konstruktør
        {
            a = new int[0];
        }
        public Mengde(int[] b, int n) // konstruktør
        {
            // kode mangler - skal lages

            for (int i = 0; i<n; i++){
                if (b[i] > b[i+1]) throw new IllegalArgumentException("Ikke sortert");
                if (b[i] == b[i+1]) throw new IllegalArgumentException("Duplikat");
            }
            a = new int[n];
            for (int i = 0; i<n; i++){
                a[i] = b[i];
            }

        }
        public String toString()
        {
            StringBuilder s = new StringBuilder();

            s.append(a[0]);
            for (int i = 0; i<a.length; i++){
                s.append(",").append(" ").append(a[i]);
            }
            return s.toString();
        }
    } // class Mengde
}
