/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

/**
 *
 * @author gwen0309
 */
public class Aeroport {
    // Attributs
    private String numeroAeroport;
    private String nomAeroport;
    private String adresse;
    private String telephone;
    
    //Constructeur
    public Aeroport (String num, String nom, String addr, String tel){
        numeroAeroport = num;
        nomAeroport = nom;
        adresse = addr;
        telephone = tel;
    }

    //GET
    public String getAdresse() {
        return adresse;
    }
    
    public String getNumeroAeroport() {
        return numeroAeroport;
    }
    
    public String getNomAeroport() {
        return nomAeroport;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    //SET
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroAeroport(String numeroAeroport) {
        this.numeroAeroport = numeroAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    
}
