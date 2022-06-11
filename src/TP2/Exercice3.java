/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

import java.util.Random;

/**
 *
 * @author Kazwell
 */
public class Exercice3 extends Thread {
    //final int TAILLE_MIN = 50;
    static int randomized_array[] = new int[10];
    //static int randomized_array[] = {5,3,3,6,52,25,99,3};
    static CompteurConcurrent CC= new CompteurConcurrent(); 
    int occur;
    int start_i,finish_i;
    
    public Exercice3(int oc,int si, int fi){
        occur =oc;
        start_i = si;
        finish_i = fi;
    }
    public static void fill_array(){      
        Random random = new Random();
        for(int i=0;i<randomized_array.length;i++){           
           randomized_array[i]= random.nextInt(9) + 1;
           System.out.print(randomized_array[i]+" ");
        }      
    }
    public void run(){
        
        int pos;
        for(int i=start_i;i<=finish_i;i++){
            pos = i+1;
            if (randomized_array[i] == occur){
                CC.incremente();
                System.out.print("\nFound occurence n°"+CC.toString()+" of "+ occur + " at position "+pos+" \n");              
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { 
        fill_array();
        //Exercice3 Tab1 = new Exercice3(3,0,(int)(randomized_array.length/2));
        //Exercice3 Tab2 = new Exercice3(3,(int)(randomized_array.length/2)+1,(int)(randomized_array.length));
        Exercice3 Tab1 = new Exercice3(3,0,5);
        Exercice3 Tab2 = new Exercice3(3,6,9);      
        Tab1.start();
        Tab2.start();
    }
}
