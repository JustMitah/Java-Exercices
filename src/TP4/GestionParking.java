/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Random;
import java.util.HashMap;

/**
 *
 * @author Kazwell
 */
public class GestionParking extends UnicastRemoteObject implements GestionParkingInterface {
    private HashMap<Integer,Caracteristics> FreeSpots = new HashMap<>();
    private HashMap<Integer,Integer> ReservedSpots = new HashMap<>();
    private int nb_taken = 0;
    Caracteristics car = new Caracteristics();
    public GestionParking () throws RemoteException
    { 
        super();
        for(int i=10;i<90;i++){
            FreeSpots.put(i,this.car);
        }
        
    }
    @Override
    public HashMap<Integer, Caracteristics> Chercher() throws RemoteException{
        return FreeSpots;
    }
    @Override
    public int Reserver(int numero_place,String nom,String jour) throws RemoteException{
        Caracteristics ChosenSpot = FreeSpots.get(numero_place);
        ChosenSpot.setAvailability(false);
        ChosenSpot.setNom_client(nom);
        ChosenSpot.setDate_reservation(jour);
        Random r = new Random();
        int low = 1000;
        int high = 10000;
        int id_place = r.nextInt(high-low) + low;
        ChosenSpot.setId_reservation(id_place);
        ReservedSpots.put(nb_taken,id_place);
        this.nb_taken++;
        return id_place;
    }

    /**
     *
     * @param id_reservation
     * @return 
     * @throws RemoteException
     */
    @Override
    public boolean Annuler(Integer id_reservation) throws RemoteException{
        boolean found = true;
        if (ReservedSpots.containsValue(id_reservation)){
        FreeSpots.entrySet().forEach(entry ->{
            if (id_reservation.equals(entry.getValue().getId_reservation())){
                entry.setValue(new Caracteristics());
            }
        });
        ReservedSpots.remove(id_reservation);
        this.nb_taken--;
        } else{
           found = false;
        }
        return found;
    }
}