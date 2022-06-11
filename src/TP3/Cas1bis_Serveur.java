/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Kazwell
 */
public class Cas1bis_Serveur {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        String str;
        ServerSocket ssoc;
        ssoc = new ServerSocket(9999);
        boolean finished = false;
        System.out.println("Waiting for Client Side...");
        Socket soc = ssoc.accept();
        System.out.println("Socket accepted");
        while (!finished){    
            InputStream is = soc.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println("Reading Input...");
            str = dis.readUTF();
            System.out.println("Received : "+str);
            if (str.equals("END")){
                finished = true;
            }   
        }
        soc.close();
    }
}
