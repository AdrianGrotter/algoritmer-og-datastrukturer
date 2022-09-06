package Exercises.oblig1;

public class Oppgave2 {
    public static void main(String[] args) {

        int[] a = {1,1,1,2,2,2,3,3,4,4,5,6,7,8,8,9,9,10,11,12,13};
        int ulike = antallUlike(a);
        System.out.println("Antall ulike: "+ulike);

    }

    public static int antallUlike(int[] a){
        int antall = 1;

        for (int i = 1; i<a.length; i++){
            if (a[i] != a[i-1]){
                antall++;
            }
        }

        boolean usortert = false;
        for(int i = 0; i<a.length; i++){
            if (a[i]<a[i-1]){
                usortert = true;
            }
        }


        return antall;
    }


}
