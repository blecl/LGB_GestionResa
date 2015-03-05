/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gwen0309
 */
public class Reservation {
   // Attributs
    private int numReservation;
    private Date dateReservation;
    private String classe;
    private int nombrePlace;
    private double acompte;
    private double paiement; // montant restant a payer
    private ArrayList<Passager> listepassager;
    private ArrayList<Vol> listevol;

    
    // Constructeur
    public Reservation (int noResa, Date dresa, String c, int nbPlace, double a, double p, Passager pass, Vol v) {
        numReservation = noResa;
        dateReservation = dresa;
        classe = c;
        nombrePlace = nbPlace;
        acompte = a;
        paiement = p;
        listepassager = new ArrayList(); // iniialisation du tableau
        listepassager.add(pass); // ajouter passager au tableau pour cardinalité 1 *
        listevol = new ArrayList(); // iniialisation du tableau
        listevol.add(v);

    }
    
    // GET

    public int getNumReservation() {
        return numReservation;
    }

    public Date getDateReservation() {
        return dateReservation;
    }
    
    public String getClasse() {
        return classe;
    }
    
    public int getNombrePlace() {
        return nombrePlace;
    }
    
    public double getAcompte() {
        return acompte;
    }
    
    public double getPaiement() {
        return paiement;
    }

    public ArrayList<Passager> getListepassager() {
        return listepassager;
    }

    public ArrayList<Vol> getListevol() {
        return listevol;
    }
    
    
    
    // SET
    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public void setAcompte(double acompte) {
        this.acompte = acompte;
    }

    public void setPaiement(double paiement) {
        this.paiement = paiement;
    }

    public void setListepassager(ArrayList<Passager> listepassager) {
        this.listepassager = listepassager;
    }

    public void setListevol(ArrayList<Vol> listevol) {
        this.listevol = listevol;
    }
    
}
