package Exercises.oblig1;

import structure.Tabell;

import java.util.Arrays;

public class Oppgave4 {
    /*

    * :(
    *
    * */


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            int[] a = Tabell.randPerm(10);
            System.out.println("Array før sortering: "+ Arrays.toString(a));

            delsortering(a);
        }

    }
    public static void delsortering(int[] a){

        if(a.length == 0) return;

        int j = a.length-1;
        int i = 0;

        while(true){

            int tall1 = a[i];
            int tall2 = a[j];

            //Finner partall med "x % 2 == 0", oddetall med "x % 2 ! = 0"
            if (i>=j){
                break;
            }

            if (tall1%2==0 && tall2%2!=0){ //Venstre er partall og høyre er oddetall
                Tabell.bytt(a, i, j);
                j--;
                i++;
            }

            else if(tall1%2!=0 && tall2%2!=0) { //Begge er oddetall
                i++;
            }

            else if(tall1%2==0 && tall2%2==0){ //Begge er partall
                j--;
            }

            else{ //Venstre er oddetall og høyre er partall
                i++;
                j--;
            }

        }
        System.out.println(i+"  "+j);
        if (i == j){
            Tabell.innsettingssorteringIntervall(a, 0, i);
            Tabell.innsettingssorteringIntervall(a, j, 10);
        }else if(i<j){
            Tabell.innsettingssorteringIntervall(a, 0, i+1);
            Tabell.innsettingssorteringIntervall(a, j, 10);
        }else if(i>j){
            Tabell.innsettingssorteringIntervall(a, 0, i);
            Tabell.innsettingssorteringIntervall(a, j+1, 10);
        }
        System.out.println("Array etter sortering: "+Arrays.toString(a)+"\n\n");


    }

}
