/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Kazwell
 */
public class Serveur_UDP {

    /**
     * @param args the command line arguments
     * @throws java.net.SocketException
     */
    public static void main(String args[]) throws SocketException, IOException {
        DatagramSocket socket;
        DatagramPacket packet;
        // création d'une socket liée au port 7777
        socket = new DatagramSocket(7777);
        // tableau de 15 octets qui contiendra les données reçues
        byte[] data = new byte[15];
        // création d'un paquet en utilisant le tableau d'octets
        packet = new DatagramPacket(data,data.length);
        // attente de la réception d'un paquet. Le paquet reçu est placé
        // dans packet et ses données dans data.
        socket.receive(packet);
        // récupération et affichage des données (une chaîne de caractères)
        String chaine = new String(packet.getData(),0,packet.getLength());
        System.out.println("Recu : "+chaine);
    }
}
