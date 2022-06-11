/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Kazwell
 */
public class Cas2_Client {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws Exception{
       /* Creation du socket */
        Socket soc = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream os=soc.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        while(true){
            System.out.println("Quel est l'identité de cet individu?");
            int state = 0;
             /* Saisie de l'individu */
            Individu ind = new Individu();
            ind.saisir();
            /* Ecriture de la chaine dans le socket.*/
            dos.writeUTF(ind.getNom());
            dos.writeUTF(ind.getPrenom());
            dos.writeInt(ind.getAge());
            DataInputStream choice = new DataInputStream(System.in);
            System.out.println("Souhaitez-vous continuer? oui/non");
            while (state == 0){
            switch (choice.readLine()) {
                case "oui" : 
                    state++;
                    continue;
                case "non":
                    System.exit(0);
                default: 
                    System.out.println("Pardon?");
                    break;
            }
        } 
        }
}}
