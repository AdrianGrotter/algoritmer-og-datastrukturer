package Exercises.uke39.section322;

import eksempelklasser.Liste;
import eksempelklasser.TabellListe;

public class task3 {
    public static void main(String[] args) {
        String[] s = {"Sohil",null,"Per","Thanh","Ann","Kari","Jon",null};
        Liste<String> liste = new TabellListe<>(s);

        System.out.println(liste);
    }
}
