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
public class GestionReservation {

    
//-------------- Attributs -------------------
    private ArrayList<Reservation> tabResa; 
    
    
    public GestionReservation()
    {
        tabResa = new ArrayList(); 
    }
    
    public void AjouterReservation()
    {
        Reservation r; 
        String c; 
        Date date_resa; 
        int nbPlace; 
        double a, p; 
        
        
    }
    
    
    
    
    
    
    public void menu()
    {
        int r; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire ? ");
        System.out.println("1 Créer une nouvelle réservation");
        System.out.println("Donner une valeur : ");
        
        r = Clavier.lireInt();
        
        switch (r)
        {
            case 1 : AjouterReservation();
                    menu();
                break;
        }
    }
    
   
    public static void main(String[] args)
    {
        // TODO code application logic here
        GestionReservation g;
        g = new GestionReservation();
        g.menu();
          
    }
    
}
