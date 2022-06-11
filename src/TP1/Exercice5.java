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
public class Exercice5 {
    static int cc =0;
    static int wc=0;
    static int lc=0; //cc for character count, wc for word count, lc for line count
    public void countFileCaracteristics(String filename) throws IOException{
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
            String c;
            while((line=br.readLine())!=null )   //Reading Content from the file
             {
                words=line.split(" ");  //Split the word using space
                 for (String word : words)                   
                   {       
                    for(int i = 0; i<word.length(); i++) 
                    {
                        cc++;
                    } 
                    wc++;
                    }  
                 lc++;
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
        Exercice5 Counters = new Exercice5();
        Counters.countFileCaracteristics("entree.txt");
        System.out.println("Number of lines : "+lc+"\nNumber of words : "+wc+"\nNumber of characters : "+cc);
    }
}
