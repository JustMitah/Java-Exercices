/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
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
public class Cas2_Serveur {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        ServerSocket sos;
        sos = new ServerSocket(9999);

        System.out.println("Accrochage du socket. En attente...");
        Socket soc = sos.accept();

        InputStream is = soc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        while(true)
            {
            /* Lecture du socket */
            String nom = dis.readUTF();
            String prenom = dis.readUTF();
            int age = dis.readInt();
            Individu ind = new Individu(nom,prenom,age);

            /* Affichage dans le champ */
            System.out.println("MESSAGE RECU: "+ind.toString());
           }
}
}

