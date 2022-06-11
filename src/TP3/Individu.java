/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3;

import java.io.DataInputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Kazwell
 */
public class Individu {
    private String nom;
    private String prenom;
    private int age;
    public Individu()
    {
        this.nom="";
        this.prenom="";
        this.age=0;
    }
    public Individu(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void saisir() throws IOException
        {
            DataInputStream in = new DataInputStream(System.in);
            System.out.print("Nom: ");
            System.out.flush();
            this.nom= in.readLine();
            /*if (this.nom.equals("stop")){
                System.exit(0);
            } else {*/
            System.out.print("Prenom: ");
            System.out.flush();
            this.prenom= in.readLine();

            System.out.print("Age: ");
            System.out.flush();
            this.age = parseInt(in.readLine());
                  
        }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "L'individu "+nom+" "+prenom+" a "+age+" ans.";
    }
    
   
}
