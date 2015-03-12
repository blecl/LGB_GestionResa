/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.util.ArrayList;

/**
 *
 * @author gwen0309
 */

// pour l'interface graphique : attribut et get set et le constructeur
public class gestionApplication {
    
    // a virer avec le lien de l'interface graphique
    public static void main(String[] args)
    {
        gestionApplication gapp;
        gapp = new gestionApplication();
        gapp.menu();   
    }
    
    //--------------//
    // Attributs    //
    //--------------//        // déclaration que les gestion utilisé
     private gestionClients gc;
     private gestionAgent ga;
     
     private GestionClient gcli;
     private GestionReservation gresa;
     private GestionVol gvol;
     
    //--------------//
    // Constructeur //
    //--------------//      
    public gestionApplication (){
        gcli = new GestionClient();
        gvol= new GestionVol();
        gresa = new GestionReservation();
        
        
        ga = new gestionAgent(gvol, gresa);
        gc = new gestionClients(gcli, gvol, gresa);
    }
    
    //--------------//
    // GET & SET    //
    //--------------//

    public gestionClients getGc() {
        return gc;
    }

    public void setGc(gestionClients gc) {
        this.gc = gc;
    }

    public gestionAgent getGa() {
        return ga;
    }

    public void setGa(gestionAgent ga) {
        this.ga = ga;
    }

    public GestionClient getGcli() {
        return gcli;
    }

    public void setGcli(GestionClient gcli) {
        this.gcli = gcli;
    }

    public GestionReservation getGresa() {
        return gresa;
    }

    public void setGresa(GestionReservation gresa) {
        this.gresa = gresa;
    }

    public GestionVol getGvol() {
        return gvol;
    }

    public void setGvol(GestionVol gvol) {
        this.gvol = gvol;
    }
    
    
    
    // a virer avec l'interface
     
   // pour le test mais a virer avec l'interface graphique car plus de sens 
    public void accesintClient(){
        gc.menu();
    }
    
    public void accesintAgent(){//appel recherche agent sur loing et mdp si ok on lance)
        ga.menu();
    }


    public void menu()
    {
        int i; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire ? ");
        System.out.println("1 Accès à l'interface client");
        System.out.println("1 Accès à l'interface agent");
        
        System.out.println("Donner une valeur : ");
        
        i = Clavier.lireInt();
        
        switch (i)
        {
            case 1 : accesintClient();
                    menu();
                break;
            case 2 : accesintAgent();
                    menu();
                break;
        }
    }
}
