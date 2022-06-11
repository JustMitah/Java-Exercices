/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Kazwell
 */
public interface GestionCompteInterface extends Remote {
	public void creerCompte(String id, double somme) throws RemoteException; //permet de créer un compte avec un identifiant et un solde
	public void ajouter(String id, double somme) throws RemoteException; //permet d’ajouter une somme à un compte existant
	public void retirer(String id, double somme) throws RemoteException ; //permet de retirer une somme à un compte existant 
	public double consulterSolde(String id) throws RemoteException; //permet de consulter le solde d’un compte existant ;
	public boolean transfererSolde(String id_C, String id_D, double somme) throws RemoteException; //permet de transférer une somme d’un compte à un autre ; 
}
