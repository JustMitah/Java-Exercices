/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Kazwell
 */
public class Cas1_Serveur {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        String str;
        ServerSocket ssoc;
        ssoc = new ServerSocket(9999);
        boolean finished = false;
        while (!finished){
            System.out.println("Waiting...");
            Socket soc = ssoc.accept();
            System.out.println("Socket accepted");
            InputStream is = soc.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("Reading socket...");
            str = dis.readUTF();
            System.out.println("Received : "+str);
            if (str.equals("END")){
                finished = true;
            }
            soc.close();
        }
    }
}
