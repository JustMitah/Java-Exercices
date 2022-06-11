package CoursJava;
import java.io.*;
import java.rmi.*;
class ClientTemperature{
public static void main (String [] argv) throws IOException{
    try {
    TemperatureSensorInterface ts= (TemperatureSensorInterface) Naming.lookup 
    ("rmi://localhost:2003/SensorCourant");
    ts.setTemp(5);
    ts.augmenterTemp(2);
    ts.diminuerTemp(4);
    System.out.println ("La température courante = " + ts.lire_temp() + " degrés");
    ts.diminuerTemp(4);
    System.out.println ("La température courante = " + ts.lire_temp() + " degrés");
    }catch (Exception e) {
    System.out.println("Erreur d'accès a un objet distant");
    System.out.println(e.toString());
    }
    }
}