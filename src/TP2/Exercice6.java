/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

/**
 *
 * @author Kazwell
 */
/*----------Just in case, clean and build project before running -------------*/
    public class Exercice6 extends Thread {
    private boolean parity = true;
    Exercice6(boolean nbr_parity){//Constructeur
        this.parity=nbr_parity;
    }
    synchronized public void Counting(){
        if (parity){
            for (int i=0;i<21;i++){
                if (i%2==0)
                    System.out.println("T1 : "+i);
            }
        } else {       
            for (int i=1;i<20;i++){
                if (!(i%2==0))
                    System.out.println("T2 : "+i);
            }
     }
    }
    @Override
    public void run(){
        Counting();
        //Uncomment the following for question 1
        /*for (int i=1;i<20;i++){
            if (parity && i%2==0)
                System.out.println("T1 : "+i);
            if (!parity && !(i%2==0))
                System.out.println("T2 : "+i);
     }*/
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Exercice6 T1 = new Exercice6(true);
        T1.start();
        Exercice6 T2 = new Exercice6(false);
        T2.start();
    }
}
