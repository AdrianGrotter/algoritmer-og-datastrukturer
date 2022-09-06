package Exercises.uke37.section141;

public class task5 {
    public static void main(String[] args) {
        String s = "Ø", t = "Æ";
        System.out.println(s.compareTo(t));

        //Regner etter ASCII verdi. ÆØÅ gir feil resultat. AAB vil være større enn AA.
    }
}
