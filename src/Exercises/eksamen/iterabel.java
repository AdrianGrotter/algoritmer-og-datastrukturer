package Exercises.eksamen;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.*;

public class iterabel {

    public static <T> T maks(Iterable<T> s, Comparator<? super T> c){

        Iterator<T> i = s.iterator();
        if (!i.hasNext()) throw new IllegalArgumentException("Listen er tom");

        T maks = i.next();
        while (i.hasNext()){
            T verdi = i.next();
            if (c.compare(maks,verdi) < 0){
                maks = verdi;
            }
        }
        return maks;
    }

    public interface Iterable<T>
    {
        Iterator<T> iterator();
    }


}
