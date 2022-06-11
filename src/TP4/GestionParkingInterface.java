/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
/**
 *
 * @author Kazwell
 */
public interface GestionParkingInterface extends Remote {
    HashMap<Integer, Caracteristics> Chercher() throws RemoteException;
    int Reserver(int numero_place,String nom, String jour) throws RemoteException;
    boolean Annuler(Integer id_reservation) throws RemoteException;
}
