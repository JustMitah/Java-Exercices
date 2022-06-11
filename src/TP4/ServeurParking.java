/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP4;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Kazwell
 */
public class ServeurParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            GestionParking gp = new GestionParking();
            LocateRegistry.createRegistry(2003);
            System.out.println("Nouveau Parking enregistré dans RMIregistry");
            Naming.rebind("rmi://localhost:2003/CurrentParking",gp);
            System.out.println("Attente des demandes des clients");
            }
            catch (MalformedURLException | RemoteException e) {
            System.out.println("Erreur de liaison de l'objet GestionParking ");
            System.out.println(e.toString());
            }
    }
}
