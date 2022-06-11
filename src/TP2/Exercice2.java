/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

import CoursJava.Impression;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kazwell
 */
public class Exercice2 extends Thread {
    static Impression mImp = new Impression();
    String txt;
    int time;
    int number;
    public Exercice2(String t, int repeat, int wait){
        txt = t;
        time = wait;
        number = repeat;
    }
    public void run(){
        for(int j=0;j<number;j++){
            mImp.imprime(txt);
            System.out.print("\n");
            try {
                sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(Exercice2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Exercice2 a = new Exercice2("Bonjour !",10,1000);
        Exercice2 b = new Exercice2("Salut !",5,2000);
        a.start();
        b.start();
    }
}
