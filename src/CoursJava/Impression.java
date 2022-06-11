/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

/**
 *
 * @author Kazwell
 */
public class Impression {
    synchronized public void imprime(String t){
        for(int i=0;i<t.length();i++){
            System.out.print(t.charAt(i));
        }
    }
}
