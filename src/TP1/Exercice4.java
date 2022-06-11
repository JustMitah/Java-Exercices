/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kazwell
 */
public class Exercice4 {
    public void LecteurGrep(String searchedword,String filename) throws IOException{
        String directory = System.getProperty("user.dir");
        Exercice3 sF = new Exercice3();
        sF.findFile(filename,new File(directory));
        String FileDirectory = Exercice3.fullPath;
        FileReader f = null;
        try{
            f = new FileReader(FileDirectory);
            BufferedReader br = new BufferedReader(f);
            String line; 
            String[] words=null;
            while((line=br.readLine())!=null)   //Reading Content from the file
             {
                words=line.split(" ");  //Split the word using space
                 for (String word : words) 
                 {
                        if (word.equals(searchedword))   //Search for the given word
                        {
                            System.out.println(line);
                        }
                 }
            }
        } catch(IOException e){
            System.out.println("Erreur d'ouverture du fichier");
            System.out.println(e.getMessage());
            System.exit(0);
        }       
        f.close();
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        Exercice4 GrepJava = new Exercice4();
        System.out.println("Lines that contains the word 'want' in PoemToGrep.txt");
        
        GrepJava.LecteurGrep("want", "PoemToGrep.txt");
        System.out.println("--------------xxxxxxxxxxxxxxxxxxxxxxx------------------------");
        System.out.println("Lines that contains the word 'asked' in AnotherPoemToGrep.txt");
        GrepJava.LecteurGrep("asked", "AnotherPoemToGrep.txt");
    }
}
