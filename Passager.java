/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.util.Date;

/**
 *
 * @author gwen0309
 */
public class Passager extends Personne{

    // Attributs
    private String numeroPasseport;
    private Date dateValidite;
    private String sexe;
    
    public Passager(String nomPers, String prenomPers, String addr, String tel, String noPasseport, Date dval , String s) {
        super(nomPers, prenomPers, addr, tel);
        numeroPasseport = noPasseport;
        dateValidite = dval;
        sexe = s;
    }

    // GET
    public String getNumeroPasseport() {
        return numeroPasseport;
    }
    
    public Date getDateValidite() {
        return dateValidite;
    }

    public String getSexe() {
        return sexe;
    }
    
    //SET
    public void setNumeroPasseport(String numeroPasseport) {
        this.numeroPasseport = numeroPasseport;
    }

    public void setDateValidite(Date dateValidite) {
        this.dateValidite = dateValidite;
    }
    
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    
      
}
