/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author gwen0309
 */
public class Vol {
    //Attributs
    private String numeroVol;
    private Date dateDepart;
    private Time heureDepart;
    private Date dateArrivee;
    private Time heureArrivee;
    private double prixClasse1;
    private int quantiteClasse1;
    private double prixClasse2;
    private int quantiteClasse2;
    
    // Constructeur
    public Vol(String noVol, Date dd, Time hd, Date da, Time ha, double pc1, int qc1, double pc2, int qc2){
        numeroVol = noVol;
        dateDepart = dd;
        heureDepart = hd;
        dateArrivee = da;
        heureArrivee = ha;
        prixClasse1 = pc1;
        quantiteClasse1 = qc1;
        prixClasse2 = pc2;
        quantiteClasse2 = qc2;
    }
    
    //GET
    public String getNumeroVol() {
        return numeroVol;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Time getHeureDepart() {
        return heureDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public Time getHeureArrivee() {
        return heureArrivee;
    }

    public double getPrixClasse1() {
        return prixClasse1;
    }

    public int getQuantiteClasse1() {
        return quantiteClasse1;
    }

    public double getPrixClasse2() {
        return prixClasse2;
    }

    public int getQuantiteClasse2() {
        return quantiteClasse2;
    }
    
    // SET

    public void setNumeroVol(String numeroVol) {
        this.numeroVol = numeroVol;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public void setHeureArrivee(Time heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public void setPrixClasse1(double prixClasse1) {
        this.prixClasse1 = prixClasse1;
    }

    public void setQuantiteClasse1(int quantiteClasse1) {
        this.quantiteClasse1 = quantiteClasse1;
    }

    public void setPrixClasse2(double prixClasse2) {
        this.prixClasse2 = prixClasse2;
    }

    public void setQuantiteClasse2(int quantiteClasse2) {
        this.quantiteClasse2 = quantiteClasse2;
    }
    
    
}
