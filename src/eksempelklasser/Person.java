package eksempelklasser;

import java.util.Objects;

public class Person implements Comparable<Person>
{
    private final String fornavn;         // personens fornavn
    private final String etternavn;       // personens etternavn

    public Person(String fornavn, String etternavn)   // konstruktør
    {

        if(etternavn == "") throw new NullPointerException(fornavn + " sitt etternavn er null");
        if(fornavn == "") throw new NullPointerException(etternavn + " sitt fornavn er null");
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String fornavn() { return fornavn; }       // aksessor
    public String etternavn() { return etternavn; }   // aksessor

    public int compareTo(Person p)    // pga. Comparable<Person>
    {
        int cmp = etternavn.compareTo(p.etternavn);     // etternavn
        if (cmp != 0) return cmp;             // er etternavnene ulike?
        return fornavn.compareTo(p.fornavn);  // sammenligner fornavn
    }

    public boolean equals(Object o)      // vår versjon av equals
    {
        if (o == this) return true; //Sjekker om det er samme objekt
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        final Person p = (Person)o; //Kaster o til et person objekt
        return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn);
    }

    public boolean equals(Person p){
        if (p == this) return true; //Sjekker om det er samme objekt
        if (p == null) return false; //Sjekker om p er null
        return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn); //sjekker om navn er like
    }


    public int hashCode() { return Objects.hash(etternavn, fornavn); }

    public String toString() {
        return String.join(" ", fornavn, etternavn);
    }

} // class Person
