/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Kazwell
 */
public interface TemperatureSensorInterface extends Remote
{
void setTemp (double t) throws RemoteException;
	
void augmenterTemp (double tempVal) throws RemoteException;

void diminuerTemp (double tempVal) throws RemoteException;

double lire_temp () throws RemoteException;
}
