/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

/**
 *
 * @author Kazwell
 */
public class Exercice1 extends Thread {
    int no_fin;
    boolean ordre;
    Exercice1(int fin,boolean order) throws InterruptedException{//Constructeur
        no_fin = fin; 
        ordre = order;
    }
    @Override
    public void run(){
        if (ordre) {
        for (int i=1;i<=no_fin;i++){
            System.out.println("TA :"+i);            
        }}
        else {
            for (int i=no_fin;i>=0;i--){
            System.out.println("TB :"+i);            
        } 
        }
        }
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException  {
        Exercice1 TA = new Exercice1(1000,true);
        Exercice1 TB = new Exercice1(1000,false);
        TA.start();
        TB.start();
    }
}