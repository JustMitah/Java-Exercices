/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Kazwell
 */
public class Serveur {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String args[]) throws IOException, ClassNotFoundException {
       // serveur positionne sa socket d'écoute sur le port local 7777
       ServerSocket serverSocket = new ServerSocket(7777);
       // se met en attente de connexion de la part d'un clien distant
       Socket socket = serverSocket.accept();
       // connexion acceptée : récupère les flux objets pour communiquer 
       // avec le client qui vient de se connecter
       ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
       ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
       // attente des données venant de client
       String chaine = (String) input.readObject();
       System.out.println("Message reçu du client : "+chaine);
       // affiche les coordonnées du client qui vient de se connecter
       System.out.println("Source : "+socket.getInetAddress()+":"+socket.getPort());
       // envoi d'une réponse au client
       output.writeObject("Bien recu");
    }
}
