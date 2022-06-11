/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Kazwell
 */
public class Client {
    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String args[]) throws UnknownHostException, IOException, ClassNotFoundException {
        //adresse IP du serveur
        InetAddress adr = InetAddress.getByName("10.11.2.172");
        //ouverture de connexion avec le serveur sur le port 7777
        Socket socket = new Socket(adr,7777);
        //construction de flux objets à partir des flux de la socket
        ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
        //écriture d'une chaîne dans le flux de sortie : c'est-à-dire envoi de données au serveur
        output.writeObject("Salut");
        //attente de réception de données venant du serveur (avec le readObject)
        //on sait qu'on attend une chaîne, on peut donc faire un cast directement
        String chaine = (String)input.readObject();
        System.out.println("Message du serveur : "+chaine);
    }
}
