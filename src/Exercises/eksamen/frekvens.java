package Exercises.eksamen;

public class frekvens {
    public static void main(String[] args) {
        int[] a = {3,3,4,5,5,6,7,7,7,8};
        frekvensFordeling(a);

    }

    public static void frekvensFordeling(int[] a){
        int sum = 0;

        if(a.length == 0){
            System.out.println("0 0");
            return;
        }

        for (int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                throw new IllegalStateException("Ikke sortert");
            }
        }

        int verdi = a[0];
        int antall = 0;

        for (int i = 0; i<a.length; i++){
            if (a[i] == verdi){
                antall++;
            }
            if(a[i] > verdi){
                System.out.println(verdi + " " + antall);
                verdi = a[i];
                antall = 1;
            }
        }
        System.out.println(verdi + " " + antall);
    }
}
