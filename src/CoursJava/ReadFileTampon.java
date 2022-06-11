package CoursJava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.io.*;
/**
 *
 * @author Kazwell
 */
public class ReadFileTampon {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        FileReader f = null;
        try{
            f= new FileReader("src/main/java/TestJava/test.txt");
        } catch(IOException e){
            System.out.println("Erreur d'ouverture du fichier");
            System.out.println(e.getMessage());
            System.exit(0);
        }
        char T[]=new char[3];
        int n;
        while ((n=f.read(T))>0){
                String S = new String(T,0,n);
                System.out.print(S);    
        }
    }
}
