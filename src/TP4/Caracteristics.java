/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP4;

import java.io.Serializable;

/**
 *
 * @author Kazwell
 */
public class Caracteristics implements Serializable {
    private int id_reservation;
    private String nom_client;
    private String date_reservation;
    private boolean availability;
    public Caracteristics(){    
        this.id_reservation = 0;
        this.nom_client="";
        this.date_reservation="";      
        this.availability= true;
    }

    /**
     * @return the id_reservation
     */
    public int getId_reservation() {
        return id_reservation;
    }

    /**
     * @param id_reservation the id_reservation to set
     */
    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    /**
     * @return the nom_client
     */
    public String getNom_client() {
        return nom_client;
    }

    /**
     * @param nom_client the nom_client to set
     */
    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    /**
     * @return the date_reservation
     */
    public String getDate_reservation() {
        return date_reservation;
    }

    /**
     * @param date_reservation the date_reservation to set
     */
    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }

    /**
     * @return the availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
