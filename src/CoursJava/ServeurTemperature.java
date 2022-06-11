/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CoursJava;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Kazwell
 */
public class ServeurTemperature {
	public static void main(String[] args)
	{       
            try {
            System.out.println("Serveur : Construction de l’implémentation");
            TemperatureSensor ts= new TemperatureSensor(15.50);
            LocateRegistry.createRegistry(2003);
            System.out.println("Objet TemperatureSensor enregistré dans RMIregistry");
            Naming.rebind("rmi://localhost:2003/SensorCourant",ts);
            System.out.println("Attente des invocations des clients ");
            }
            catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet TemperatureSensor ");
            System.out.println(e.toString());
            }
        }
}
	