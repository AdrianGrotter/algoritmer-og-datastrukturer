package Exercises.uke36.section135;

public class task5 {
    public static void main(String[] args) {
        int[] a = {3,8,10,12,14,16,21,24,27,30,33,33,33,37,40};
        int b = lineærsøk(a,5, 27);
        System.out.println(b);
    }
    public static int lineærsøk(int[] a, int k, int verdi){
        //k er hopplengde. Om hopplengde er 5 finnes verdien
        //blandt de 5 siste når 5 er større.

        if(k<1)
            throw new IllegalArgumentException("k er mindre enn 1");


        int j = k-1;
        for(; k<a.length && verdi > a[j]; j += k);

        int i = j-k+1;
        for(; i<a.length && verdi > a[i]; i++);

        if(a[i] == verdi) return i;
        else return -(i+1);
    }

   public static int kvadratrotsøk(int[] a, int verdi){
        //Søker med k: kvadratroten av lengden til tallet.
        //Skal gi beste resultater
        int k = (int) Math.sqrt(a.length);
       if(k<1)
           throw new IllegalArgumentException("k er mindre enn 1");


       int j = k-1;
       for(; k<a.length && verdi > a[j]; j += k);

       int i = j-k+1;
       for(; i<a.length && verdi > a[i]; i++);

       if(a[i] == verdi) return i;
       else return -(i+1);
   }
}
