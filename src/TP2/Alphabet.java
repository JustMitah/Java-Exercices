/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

/**
 *
 * @author Kazwell
 */
public class Alphabet implements Runnable {
    Alphabet(){}
    public void affiche() {
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
            try { Thread.sleep(10); // ms
            } catch (InterruptedException e) {}
        }
        System.out.print("\n");
    }
    public void run(){
        affiche();
    }
    public static void main(String args[]) {
        Alphabet A = new Alphabet();
        Thread AA = new Thread(A);
        AA.start();
    }

}
