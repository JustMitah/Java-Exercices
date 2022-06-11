/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

/**
 *
 * @author Kazwell
 */
public class TPrint extends Thread {
    static Impression mImp = new Impression();
    String txt;
    public TPrint(String t){
        txt = t;
    }
    public void run(){
        for(int j=0;j<3;j++){
            mImp.imprime(txt);
            System.out.print(" ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        TPrint a = new TPrint("bonjour");
        TPrint b = new TPrint("au revoir");
        a.start();
        b.start();
    }
}
