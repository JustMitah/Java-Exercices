/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


/**
 *
 * @author Kazwell
 */
public class Client_UDP {
    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     * @throws java.net.SocketException
     */
    public static void main(String args[]) throws UnknownHostException, SocketException, IOException {
        InetAddress adr;
        DatagramPacket packet;
        DatagramSocket socket;
        // adr contient l'@IP de la partie serveur
        adr = InetAddress.getByName("localhost");
        // données à envoyer : chaîne de caractères
        byte[] data = ("Hello World").getBytes();
        // création du paquet avec les données et en précisant l'adresse du
        // serveur (@IP et port sur lequel il écoute : 7777)
        packet = new DatagramPacket(data,data.length,adr,7777);
        // création d'une socket, sans la lier à un port particulier
        socket = new DatagramSocket();
        // envoi du paquet via la socket
        socket.send(packet);
    }
}
