/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author Kazwell
 */

public class TemperatureSensor extends UnicastRemoteObject implements TemperatureSensorInterface {
    //private static final long serialVersionUID = 1L;
    private double temp=0;
    public TemperatureSensor (double t) throws RemoteException
    { 
        super();
        temp=t;
    }
    @Override
    public void setTemp (double t) throws RemoteException
    {
        temp=t; 
    }
    @Override
    public void augmenterTemp(double tempVal) throws RemoteException
    { 
        temp = temp+tempVal;
    }
    @Override
    public void diminuerTemp (double tempVal)
    throws RemoteException
    { 
        temp=temp-tempVal; 
    }
    @Override
    public double lire_temp() throws RemoteException
    { 
        return temp;
    }
}