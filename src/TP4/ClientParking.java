/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TP4;

import java.util.Scanner;
import java.io.*;
import java.net.MalformedURLException;
import java.rmi.*;
import java.util.HashMap;
/**
 *
 * @author Kazwell
 */
public class ClientParking {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[])throws IOException {
            int i =1;
            try {
                GestionParkingInterface gpi= (GestionParkingInterface) Naming.lookup("rmi://localhost:2003/CurrentParking");
                while(i==1){
                Scanner choice = new Scanner(System.in);
                System.out.println("----Que souhaitez vous faire?----\n 1 : Vérifiez les places disponibles \n 2 : Réserver une place dans le parking \n 3 : Annuler une réservation \n 4 : Fermer la simulation ");
                switch(choice.nextInt()){
                    case 1 -> {
                        HashMap<Integer, Caracteristics> AvailableSpots = gpi.Chercher();
                        System.out.println("numero_place   |     Disponibility");
                        AvailableSpots.entrySet().forEach(entry -> {
                        if (entry.getValue().getId_reservation()==0)
                            System.out.println("      "+entry.getKey() + "       |         " + entry.getValue().isAvailability());
                        else
                            System.out.println("      "+entry.getKey() + "       |         " + entry.getValue().isAvailability() + " | " +entry.getValue().getNom_client()+ " | " +entry.getValue().getId_reservation()+ " | " +entry.getValue().getDate_reservation());
                        });
                    }
                    case 2 -> {
                        Scanner reserve = new Scanner(System.in);
                        System.out.println("Quel numéro de place souhaitez vous réserver?");
                        int rslt_reserve = reserve.nextInt();
                        Scanner name = new Scanner(System.in);
                        System.out.print("Entrez votre nom : ");
                        String rslt_name = name.nextLine();
                        Scanner date = new Scanner(System.in);
                        System.out.print("Entrez la date de reservation (DD/MM/YYYY) : ");
                        String rslt_date = date.nextLine();
                        int placeID = gpi.Reserver(rslt_reserve,rslt_name,rslt_date);
                        System.out.println("Votre ID de réservation est : "+placeID);
                        }
                    case 3 -> {
                        Scanner reserved = new Scanner(System.in);
                        System.out.println("Donnez votre ID de résérvation : ");
                        if (gpi.Annuler(reserved.nextInt()))
                            System.out.println("Le parking spot a été libéré");
                        else
                            System.out.println("L'ID de réservation n'existe pas");
                        }
                    case 4 -> {
                        System.out.println("Au revoir!");
                        i++;
                        }
                    default -> System.out.println("Entrez une option valide!");
                }}
    }catch (MalformedURLException | NotBoundException | RemoteException e) {
    System.out.println("Erreur d'accès a un objet distant");
    System.out.println(e.toString());
    }
}}
