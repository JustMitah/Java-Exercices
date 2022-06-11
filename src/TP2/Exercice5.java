/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kazwell
 */
public class Exercice5 extends Thread {
    //static int[][] A = new int [4][4];
    private int [][] AA,xx;
    public int [][] yy;
    private int pos_i;
    Exercice5(int[][] A, int[][] x, int[][] y, int position){
        this.AA = A;
        this.xx = x;
        this.yy = y;
        this.pos_i = position;
        this.start();
    }
    public static void fill_matrix(int[][] matrix){      
        Random random = new Random();
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[j] = random.nextInt(9) + 1;
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }      
    }
    synchronized public void multiply(){
        for (int i = 0; i<AA[0].length; i++) {
            yy[pos_i][0] += AA[pos_i][i]*xx[i][0];
        }
        System.out.println("->"+yy[pos_i][0]+"\n");
    }
    @Override
    public void run(){ 
        System.out.println("Running...");
        multiply();
  }
    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String args[]) throws InterruptedException {
        int m, n;
        Scanner row = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes pour la Matrice A : ");
        n = row.nextInt();
        System.out.print("Entrez le nombre de colonnes pour la Matrice A : ");  
        Scanner col = new Scanner(System.in);
        m = col.nextInt();
        int[][] A = new int[n][m];
        int[][] x = new int[m][1];
        int[][] y = new int[n][1];
        System.out.print("A =\n");
        fill_matrix(A);
        System.out.print("x =\n");
        fill_matrix(x);   
        for (int j = 0; j < y.length; j++) {
        Exercice5 instance = new Exercice5(A,x,y,j);
        instance.join();
        }
        System.out.println("Le résultat est y =");
        for (int j = 0;j<y.length; j++) {
                System.out.print(y[j][0] + "\n");
        }
        }
}
