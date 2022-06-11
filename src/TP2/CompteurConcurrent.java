package TP2;

/**
 *
 * @author Kazwell
 */
public class CompteurConcurrent {
    private int cpt = 0;
    public int getValue () {
         return cpt ; 
    }
    @Override
    public String toString () {
             return ""+cpt ;
    }
    synchronized public void incremente() {
     cpt++;
    }
    synchronized public void incremente(int i) {
     cpt = cpt+i ;
    }
}
