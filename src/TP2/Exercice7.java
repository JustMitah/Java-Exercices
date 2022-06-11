/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

/**
 *
 * @author Kazwell
 */
public class Exercice7 extends Thread {
    private int first_nbr,last_nbr;
    Exercice7(int start_nbr,int finish_nbr){
        this.first_nbr = start_nbr;
        this.last_nbr = finish_nbr;
    }
    synchronized public void PairCounting(){
                    switch(last_nbr){
                        case 249: 
                            for (int i=first_nbr;i<last_nbr+1;i++){
                                if (i%2==0){
                                System.out.println("T1 : "+i+" ");
                                }
                            }
                        case 499: 
                            for (int i=first_nbr;i<last_nbr+1;i++){
                                if (i%2==0){
                                System.out.println("T2 : "+i+" ");
                                }
                            }
                        case 749: 
                            for (int i=first_nbr;i<last_nbr+1;i++){
                                if (i%2==0){
                                System.out.println("T3 : "+i+" ");
                                }
                            }
                        case 999: 
                            for (int i=first_nbr;i<last_nbr+1;i++){
                                if (i%2==0){
                                System.out.println("T4 : "+i+" ");
                                }
                            }
                        
                    }
        }
     public void run(){
        PairCounting();
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Exercice7 T1 = new Exercice7(1,249);
        T1.start();
        Exercice7 T2 = new Exercice7(250,499);
        T2.start();
        Exercice7 T3 = new Exercice7(500,749);
        T3.start();
        Exercice7 T4 = new Exercice7(750,999);
        T4.start();
    }
}
