/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP1;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kazwell
 */
public class Exercice1 {

     /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        FileReader f = null;
        try{
            f = new FileReader("src/TP1/file/test.txt");
        } catch(IOException e){
            System.out.println("Erreur d'ouverture du fichier");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        int c;
        while ((c=f.read()) !=-1){
            System.out.print((char)c);
        }
        f.close();
    }
}
