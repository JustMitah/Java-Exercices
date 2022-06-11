/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kazwell
 */
public class ThreadCompteur extends Thread {
    int no_fin;
    int time;
    ThreadCompteur(int fin, int wait) throws InterruptedException{//Constructeur
        no_fin = fin; time = wait;
        //Thread.sleep(time);
    }
    @Override
    public void run(){
        for (int i=1;i<=no_fin;i++){
            System.out.println(this.getName()+":"+i);
            try {
                sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadCompteur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException  {
        ThreadCompteur cp1 = new ThreadCompteur(100,500);
        ThreadCompteur cp2 = new ThreadCompteur(50,1000);
        cp1.start();
        cp2.start();
    }
}