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
public class gestionAgent {
    
    //--------------//
    // Attributs    //
    //--------------//
     
     private GestionVol gv;
     private GestionReservation gr;

    //--------------//
    // Constructeur //
    //--------------//
     
    public gestionAgent (GestionVol gvol , GestionReservation gresa)
    {
        gv = gvol;
        gr = gresa;
    }
      
    //--------------//
    //   Methodes   //
    //--------------//      
    public void creerVols(){
        gv.saisirVol(); //--> Si appel d'un autre classe
    }
    
    public void creerDestinations(){
        gv.saisirAeroport();
    }
    
    //--------------//
    //   Menu       //
    //--------------//    
    public void menu()
    {
        int i; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire ? ");
        System.out.println("1 Créer des vols");
        System.out.println("2 Créer des destinations");
        System.out.println("3 Associer des passagers à une réservation (vérification de la validité du passeport)");
        System.out.println("4 ");
        System.out.println("5 ");
        System.out.println("6 ");
        System.out.println("7 ");

        System.out.println("Donner une valeur : ");
        
        i = Clavier.lireInt();
        
        switch (i)
        {
            case 1 : creerVols();
                    menu();
                break;
            case 2 : creerDestinations();
                    menu();
                break;
        }
    }
}
