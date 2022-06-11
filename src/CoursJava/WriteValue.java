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
public class WriteValue {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        FileWriter f;
        f = new FileWriter("src\\main\\java\\TestJava\\test2.txt");
        f.write("Ceci est une chaine");
        f.write(65);
        f.write('a');
        f.write(" 30.58");
        float y = (float)45.65;
        String S = Float.toString(y);
        f.write(S);
        f.write(""+y);
        f.close();
    }
}
