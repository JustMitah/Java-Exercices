package TP4;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.HashMap;
/**
 *
 * @author Kazwell
 */
public class GestionCompte extends UnicastRemoteObject implements GestionCompteInterface  {
    private HashMap<String,Double> accounts = new HashMap<>();
    public String ErrorMsg = "";
    public GestionCompte () throws RemoteException
    { 
        super();
    }
    @Override
    public void creerCompte(String id, double somme) throws RemoteException {
         if (accounts.containsKey(id)){
            this.ErrorMsg="Un compte sous cet id existe déjà";
        } else {
            accounts.put(id, somme);
        }
    }

    @Override
    public void ajouter(String id, double somme) throws RemoteException {
            if (accounts.containsKey(id)){
                accounts.put(id, accounts.get(id)+somme);
            } else {
                this.ErrorMsg="Cet id ne référencie aucun compte";
            }
    }

    @Override
    public void retirer(String id, double somme) throws RemoteException {
            if (accounts.containsKey(id)){
                accounts.put(id, accounts.get(id)-somme);
            } else {
                this.ErrorMsg="Cet id ne référencie aucun compte";
            }
    }

    @Override
    public double consulterSolde(String id) throws RemoteException {
            if (accounts.containsKey(id)){
               return accounts.get(id);
            } else {
               this.ErrorMsg="Cet id ne référencie aucun compte";
            }    
            return 0;
    }

    @Override
    public boolean transfererSolde(String id_C, String id_D, double somme) throws RemoteException { 
         if (accounts.containsKey(id_C) && accounts.containsKey(id_D)){
               this.retirer(id_C, somme);
               this.ajouter(id_D, somme);
               return true;
            } else {
               this.ErrorMsg="Cet id ne référencie aucun compte";
            }    
            return false;
    }
}