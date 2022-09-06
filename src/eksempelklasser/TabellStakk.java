package eksempelklasser;

import eksempelklasser.Stakk;

import java.util.*;

public class TabellStakk<T> implements Stakk<T>
{
    private T[] a;                     // en T-tabell
    private int antall;                // antall verdier på stakken

    public TabellStakk()               // konstruktør - tabellengde 8
    {
        this(8);
    }

    @SuppressWarnings("unchecked")     // pga. konverteringen: Object[] -> T[]
    public TabellStakk(int lengde)     // valgfri tabellengde
    {
        if (lengde < 0)
            throw new IllegalArgumentException("Negativ tabellengde!");

        a = (T[])new Object[lengde];     // oppretter tabellen
        antall = 0;                      // stakken er tom
    }

    // de andre metodene skal inn her!
    public void leggInn(T verdi)
    {
        if (antall == a.length)
            a = Arrays.copyOf(a, antall == 0 ? 1 : 2*antall);   // dobler

        a[antall++] = verdi;
    }
    public T kikk()
    {
        if (antall == 0)       // sjekker om stakken er tom
            throw new NoSuchElementException("Stakken er tom!");

        return a[antall-1];    // returnerer den øverste verdien
    }

    public T taUt()
    {
        if (antall == 0)       // sjekker om stakken er tom
            throw new NoSuchElementException("Stakken er tom!");

        antall--;             // reduserer antallet

        T temp = a[antall];   // tar var på det øverste objektet
        a[antall] = null;     // tilrettelegger for resirkulering

        return temp;          // returnerer den øverste verdien
    }
    public boolean tom() { return antall == 0; }

    public int antall() { return antall; }

    public void nullstill(){
        for (int i = a.length; i>= 0; i--){
            a[0] = null;
        }
        antall = 0;
    }
    public static <T> void snu(Stakk<T> A){
        /*TabellStakk<T> b = new TabellStakk<T>();
        TabellStakk<T> c = new TabellStakk<T>();

        while(!A.tom()){
            b.leggInn(A.taUt());
        }
        while(!b.tom()){
            c.leggInn(b.taUt());
        }
        while(!c.tom()){
            A.leggInn(c.taUt());
        }*/

        TabellStakk<T> B = new TabellStakk<T>();
        int n = A.antall();

        while(n > 0){
            T temp = A.taUt();
            for (int j = 0; j < n; j++) B.leggInn(A.taUt()); //Tar ut alle elementene ned til element n
            A.leggInn(temp); //Legger inn elementet som var på topp
            while (!B.tom()) A.leggInn(B.taUt()); //Legger tilbake etter at det riktige elementet er på plass
            n--; //Ett nytt element er riktig sortert
        }
    }

    public static <T> void kopier(Stakk<T> A, Stakk<T> B){
        TabellStakk<T> c = new TabellStakk<T>();
        while(!A.tom()){
            c.leggInn(A.taUt());
        }
        while(!c.tom()){
            T temp = c.taUt();
            A.leggInn(temp);
            B.leggInn(temp);
        }
    }

    public static <T> void sorter(Stakk<T> A, Comparator<? super T> c){
        Stakk<T> B = new TabellStakk<T>();
        T temp;
        int teller = 0;

        while (!A.tom())  //Kjører til A er tom
        {
            temp = A.taUt();    //Henter ut første verdi i A
            teller = 0;     //Setter teller til 0
            while (!B.tom() && c.compare(temp,B.kikk()) < 0) //Sjekker at er en verdi i B, og at øverste verdi i B er større enn temp
            {
                teller++;
                A.leggInn(B.taUt()); //Legger øverste verdi i B inn i A
            }
            B.leggInn(temp); //Når B er tom, eller verdien på toppen av B er mindre enn Temp legges temp inn
            for (int i = 0; i < teller; i++) B.leggInn(A.taUt()); //Tar ut "teller" antall verdier fra A
        }

        while (!B.tom()) A.leggInn(B.taUt());
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append('[');
        string.append(a[a.length-1]);
        for (int i = a.length-1; i>= 0; i--){
            string.append(',').append(' ').append(a[i]);
        }
        string.append(']');
        return string.toString();
    }

}  // class TabellStakk
