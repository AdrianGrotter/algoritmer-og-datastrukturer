package Exercises.uke37.section141;
import structure.Tabell;

public class tasks {
    public static void main(String[] args) {
        int[] a = {5,2,7,3,9,1,8,4,6};
        double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        char[] c = "JASMINZ".toCharArray();
        Integer[] i = {5,2,7,78,3,9,1,8,4,6};

        int k = Tabell.maks(a, 0, a.length);     // posisjonen til den største i a
        int l = Tabell.maks(d);     // posisjonen til den største i d
        int m = Tabell.maks(s);     // posisjonen til den største i s
        int n = Tabell.maks(c);
        int o = Tabell.maks(i);

        System.out.println(a[k] + "  " + d[l] + "  " + s[m]+"  "+c[n]+"  "+i[o]);

        // Utskrift:  9  7.12  Thanh
        // Utskrift:  9  7.12  Thanh Z 78
    }
}
