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
public class Personne {
    
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    
    //Constructeur
    public Personne(String nomPers, String prenomPers, String addr, String tel){
        nom = nomPers;
        prenom = prenomPers;
        adresse = addr;
        telephone = tel;
    }

    // GET
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }
    
    // SET
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void setPrenom(String p){
        this.prenom = p;
    }
    
     public void setAdresse(String a) {
        this.adresse = a;
    }
     
    public void setTelephone(String tel) {
        this.telephone = tel;
    }
     
     
}
