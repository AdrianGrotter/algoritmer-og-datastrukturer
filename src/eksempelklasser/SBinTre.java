package eksempelklasser;
import org.w3c.dom.Node;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class SBinTre<T> // implements Beholder<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi;                 // nodens verdi
        private Node<T> venstre, høyre;  // venstre og høyre barn

        private Node(T verdi, Node<T> v, Node<T> h)  // konstruktør
        {
            this.verdi = verdi;
            venstre = v;
            høyre = h;
        }

        private Node(T verdi)  // konstruktør
        {
            this(verdi, null, null);
        }

    } // class Node

    private Node<T> rot;                       // peker til rotnoden
    private int antall;                        // antall noder
    private final Comparator<? super T> comp;  // komparator

    public SBinTre(Comparator<? super T> c)    // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }

    public static <T extends Comparable<? super T>> SBinTre<T> sbintre()
    {
        return new SBinTre<>(Comparator.naturalOrder());
    }

    public static <T extends Comparable<? super T>> SBinTre<T> sbintre(Stream<T> s)
    {
        return sbintre(s, Comparator.naturalOrder());  // naturlig ordning
    }

    public static <T> SBinTre<T> sbintre(Stream<T> s, Comparator<? super T> c)
    {
        SBinTre<T> tre = new SBinTre<>(c);             // komparatoren c
        s.forEach(tre::leggInn);                       // bygger opp treet
        return tre;                                    // treet returneres
    }

    private static <T> Node<T> balansert(T[] a, int v, int h)  // en rekursiv metode
    {
        if (v > h) return null;                       // tomt intervall -> tomt tre

        int m = (v + h)/2;                            // midten
        T verdi = a[m];                               // midtverdien

        while (v < m && verdi.equals(a[m-1])) m--;    // til venstre

        Node<T> p = balansert(a, v, m - 1);           // venstre subtre
        Node<T> q = balansert(a, m + 1, h);           // høyre subtre

        return new Node<>(verdi, p, q);               // rotnoden
    }

    public static <T> SBinTre<T> balansert(T[] a, Comparator<? super T> c)
    {
        SBinTre<T> tre = new SBinTre<>(c);          // oppretter et tomt tre
        tre.rot = balansert(a, 0, a.length - 1);    // bruker den rekursive metoden
        tre.antall = a.length;                      // setter antallet
        return tre;                                 // returnerer treet
    }

    public static <T extends Comparable<? super T>> SBinTre<T> balansert(T[] a)
    {
        return balansert(a, Comparator.naturalOrder());
    }

    public static <T extends Comparable<? super T>> SBinTre<T> naturligOrdenTre()
    {
        return new SBinTre<>(Comparator.naturalOrder());
    }


    public static <T> SBinTre<T> komparatorTre(Comparator<? super T> c)
    {
        return new SBinTre<>(c);
    }

    public static <T> SBinTre<T> komparatorTre(T[] a, Comparator<? super T> c)
    {
        SBinTre<T> tre = new SBinTre<>(c);          // komparatoren c
        for (T verdi : a) tre.leggInn(verdi);       // bygger opp treet
        return tre;                                 // treet returneres
    }

    public static <T extends Comparable<? super T>> SBinTre<T> naturligOrdenTre(T[] a)
    {
        return komparatorTre(a, Comparator.naturalOrder());  // naturlig ordning
    }

    public int antall()        // antall verdier i treet
    {
        return antall;
    }

    public int antall(T verdi){
        int sum = 0;
        Node<T> node = rot;
        while(node != null){
            if (node.verdi.equals(verdi)){
                sum++;
            }

            if(comp.compare(node.verdi, verdi) > 0){
                node = node.venstre;
            }else{
                node = node.høyre;
            }
        }


        return sum;
    }

    public Liste<T> intervallsøk(T fraverdi, T tilverdi){
        Stakk<Node<T>> s = new TabellStakk<>();

        Node<T> p = rot;
        while (p != null)    // leter etter fraverdi
        {
            int cmp = comp.compare(fraverdi,p.verdi);
            if (cmp < 0)
            {
                s.leggInn(p); p = p.venstre;
            }
            else if (cmp > 0) p = p.høyre;
            else break;
        }

        if (p == null) p = s.taUt();  // neste i inorden

        Liste<T> liste = new TabellListe<>();

        while (p != null && comp.compare(p.verdi,tilverdi) < 0)
        {
            liste.leggInn(p.verdi);

            if (p.høyre != null)
            {
                p = p.høyre;
                while (p.venstre != null)
                {
                    s.leggInn(p); p = p.venstre;
                }
            }
            else if (!s.tom()) p = s.taUt();
            else p = null;
        }

        return liste;
    }

    public boolean tom()       // er treet tomt?
    {
        return antall == 0;
    }

    public T gulv(T verdi)
    {
        Objects.requireNonNull(verdi, "Treet har ingen nullverdier!");
        if (tom()) throw new NoSuchElementException("Treet er tomt!");

        Node<T> p = rot;
        T gulv = null;
        T sisteGulv = null;

        while (p != null)
        {
            int cmp = comp.compare(verdi, p.verdi);

            if (cmp < 0) p = p.venstre;  // gulvet ligger til venstre
            else if (cmp > 0)
            {
                gulv = p.verdi;            // nodeverdien er en kandidat
                p = p.høyre;
            }
            else sisteGulv = p.verdi;         // verdi ligger i treet
        }
        if(comp.compare(sisteGulv, verdi) == 0) return sisteGulv;
        return gulv;
    }

    public boolean leggInn(T verdi)    // skal ligge i class SBinTre
    {
        if (verdi == null) throw new NullPointerException("Ulovlig nullverdi!");

        Node<T> p = rot, q = null;               // p starter i roten
        int cmp = 0;                             // hjelpevariabel

        while (p != null)       // fortsetter til p er ute av treet
        {
            q = p;                                 // q er forelder til p
            cmp = comp.compare(verdi,p.verdi);     // bruker komparatoren
            p = cmp < 0 ? p.venstre : p.høyre;     // flytter p
        }

        // p er nå null, dvs. ute av treet, q er den siste vi passerte

        p = new Node<>(verdi);                   // oppretter en ny node

        if (q == null) rot = p;                  // p blir rotnode
        else if (cmp < 0) q.venstre = p;         // venstre barn til q
        else q.høyre = p;                        // høyre barn til q

        antall++;                                // én verdi mer i treet
        return true;                             // vellykket innlegging
    }

    private int høyde(Node<?> p)  // ? betyr vilkårlig type
    {
        if (p == null) return -1;          // et tomt tre har høyde -1


        return 1 + Math.max(høyde(p.venstre), høyde(p.høyre));
    }

    public int høyde()
    {
        return høyde(rot);                 // kaller hjelpemetoden
    }

    public String toString()                   // hører til SBinTre
    {
        StringBuilder s = new StringBuilder();   // StringBuilder
        s.append('[');                           // starter med [
        if (!tom()) toString(rot,s);             // den rekursive metoden
        s.append(']');                           // avslutter med ]
        return s.toString();                     // returnerer
    }

    private static <T> void toString(Node<T> p, StringBuilder s)
    {
        if (p.venstre != null)                   // p har et venstre subtre
        {
            toString(p.venstre, s);                // komma og mellomrom etter
            s.append(',').append(' ');             // den siste i det venstre
        }                                        // subtreet til p

        s.append(p.verdi);                       // verdien i p

        if (p.høyre != null)                     // p har et høyre subtre
        {
            s.append(',').append(' ');             // komma og mellomrom etter
            toString(p.høyre, s);                  // p siden p ikke er den
        }                                        // siste noden i inorden
    }

    public Node<T> rot(){
        return rot;
    }

    public void inOrder(Node<T> p){
        if(p == null){
            return;
        }
        inOrder(p.venstre);
        System.out.print(p.verdi+" ");
        inOrder(p.høyre);
    }

} // class SBinTre



/*public class OmvendtInordenIterator implements Iterator<T>{

    public Iterator<T> riterator(){
        return this.riterator();
    }

    public Iterator<T> riterator(T verdi){

    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}*/