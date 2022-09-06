package eksempelklasser;

import java.util.NoSuchElementException;

public class TabellKø<T> implements Kø<T>
{
    public static void main(String[] args) {
        Kø<Character> s = new TabellKø<>();
        s.leggInn('A');
        s.leggInn('B');
        s.leggInn('C');
        System.out.println(s);
        snu(s);
        System.out.println(s);
    }
    private T[] a;      // en tabell
    private int fra;    // posisjonen til den første i køen
    private int til;    // posisjonen til første ledige plass

    @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
    public TabellKø(int lengde)
    {
        if (lengde < 1)
            throw new IllegalArgumentException("Må ha positiv lengde!");

        a = (T[])new Object[lengde];

        fra = til = 0;    // a[fra:til> er tom
    }

    public TabellKø()   // standardkonstruktør
    {
        this(8);
    }

    @Override
    public boolean leggInn(T verdi)   // null-verdier skal være tillatt
    {
        a[til] = verdi;                                 // ny verdi bakerst
        til++;                                          // øker til med 1
        if (til == a.length) til = 0;                   // hopper til 0
        if (fra == til) a = utvidTabell(2*a.length);    // sjekker og dobler
        return true;                                    // vellykket innlegging
    }

    @Override
    public T kikk() {
        return a[fra];
    }

    @Override
    public T taUt()
    {
        if (fra == til) throw new NoSuchElementException("Køen er tom!");

        T temp = a[fra];                  // tar vare på den første i køen
        a[fra] = null;                    // nuller innholdet
        fra++;                            // øker fra med 1
        if (fra == a.length) fra = 0;     // hopper til 0
        return temp;                      // returnerer den første
    }

    @Override
    public int antall()
    {
        return fra <= til ? til - fra : a.length + til - fra;
    }

    @Override
    public boolean tom() {
        return fra == til;
    }

    @Override
    public void nullstill() {
        for (int i = fra; i<til; i++){
            a[i] = null;
        }
    }

    public int indeksTil(T verdi){
        int teller = 0; // i kan ikke brukes for indeks her, så bruker egen variabel
        for (int i = fra+1; i < til; i++){
            if (a[i] == verdi) return teller;
            teller++;
        }
        return -1;
    }

    public static <T> void snu(Stakk<T> A){
        Kø<T> k = new TabellKø<>();

        while (!A.tom()) k.leggInn(A.taUt());
        while (!k.tom()) A.leggInn(k.taUt());
    }

    public static <T> void snu(Kø<T> A){
        Stakk<T> s = new TabellStakk<T>();

        while (!A.tom()) s.leggInn(A.taUt());
        while (!s.tom()) A.leggInn(s.taUt());
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append('[');
        s.append(a[fra]);
        for (int i = fra+1; i < til; i++){
            s.append(',').append(' ').append(a[i]);
        }
        s.append(']');
        return s.toString();
    }

    // Her skal resten av metodene settes inn
    private T[] utvidTabell(int lengde)
    {
        @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
        T[] b = (T[])new Object[lengde];  // ny tabell

        // kopierer intervallet a[fra:a.length> over i b
        System.arraycopy(a,fra,b,0,a.length - fra);

        // kopierer intervallet a[0:fra> over i b
        System.arraycopy(a,0,b,a.length - fra, fra);

        fra = 0; til = a.length;
        return b;
    }

} // class TabellKø