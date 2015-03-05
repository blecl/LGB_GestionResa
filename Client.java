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
public class Client extends Personne{

    // Attributs
    private String numClient;
    private String login;
    private String motdepasse;
    
    // Constructeur
    public Client(String nomPers, String prenomPers, String addr, String tel, String noClient, String log, String mdp) {
        super(nomPers, prenomPers, addr, tel);
        numClient = noClient;
        login = log;
        motdepasse = mdp;
    }
    
    //GET
    public String getNumClient() {
        return numClient;
    }

    public String getLogin() {
        return login;
    }
    
    public String getMotdepasse() {
        return motdepasse;
    }
    
    // SET
    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }
    
    
}