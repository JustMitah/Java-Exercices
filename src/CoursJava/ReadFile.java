package CoursJava;

import java.io.*;
/**
 *
 * @author Kazwell
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        FileReader f = null;
        try{
            f= new FileReader("test.txt");
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
