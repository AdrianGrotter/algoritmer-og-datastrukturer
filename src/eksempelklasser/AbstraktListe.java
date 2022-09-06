package eksempelklasser;

import java.util.*;

public abstract class AbstraktListe extends AbstraktBeholder implements Liste{

    public abstract void leggInn(int indeks, int t);

    protected void indeksKontroll(int indeks){
        if(indeks < 0){
            throw new IndexOutOfBoundsException("Indeks: "+indeks);
        } else if(indeks >= antall()){
            throw new IndexOutOfBoundsException("Indeks " +
                    indeks + " >= antall(" + antall() + ") noder!");
        }
    }
}
