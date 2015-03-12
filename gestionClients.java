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
public class gestionClients {
   
    //--------------//
    // Attributs    //
    //--------------//
   
     private GestionClient gclient;
     private GestionVol gesvol;
     private GestionReservation greservation;
     
    //--------------//
    // Constructeur //
    //--------------// 
    public gestionClients (GestionClient gcli, GestionVol gvol, GestionReservation gresa)
    {
        gclient = gcli;
        gesvol = gvol;
        greservation = gresa;
    }
      
    //--------------//
    //   Methodes   //
    //--------------//
    
    // Elle est dans l'interface graphique
    //public void creerCompte(){
    //    gclient.AjouterClient(); //--> Si appel d'un autre classe
    //}
    
    public void creerReservation(){
        greservation.AjouterReservation(); //--> Si appel d'un autre classe
    }
    

    // Menu
    public void menu()
    {
        int i; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire ? ");
        System.out.println("1 Créer une réservation");
        System.out.println("2 Rechercher un vol");
        System.out.println("4 ");
        System.out.println("5 ");
        System.out.println("6 ");
        System.out.println("7 ");

        System.out.println("Donner une valeur : ");
        
        i = Clavier.lireInt();
        
        switch (i)
        {
           
            case 1 : creerReservation();
                    menu();
                break;
        }
    }
}



