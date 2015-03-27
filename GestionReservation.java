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
    private ArrayList<Vol> tabVol; 
    
    public GestionReservation()
    {
        tabResa = new ArrayList(); 
    }
    
    public void AjouterReservation()
    {
        Vol v; 
        Reservation r; 
        String c, num_v; 
        Date date_resa; 
        int nb, a, j, m; 
        double ac, p; 
        
        System.out.println("Saisir date de réservation: ");
        System.out.println("Saisir l'année: ");
        a = Clavier.lireInt();
        System.out.println("Saisir le mois: ");
        m = Clavier.lireInt();
        System.out.println("Saisir le jour: ");
        j = Clavier.lireInt(); 
        date_resa = new Date(a-1900,m-1,j);
        
        System.out.println("Saisir une classe (économique, affaire ou première): ");
        c = Clavier.lireString(); 
        System.out.println("Saisir le nombre de passager: ");
        nb = Clavier.lireInt(); 
        System.out.println("Saisir l'acccompte versé: ");
        ac = Clavier.lireDouble(); 
        System.out.println("Saisir le paiement (insérer 0): ");
        p = Clavier.lireDouble(); 
       
        System.out.println("Saisir un numéro de vol: ");
        num_v = Clavier.lireString();
        v= rechercherVol(num_v); 
        
        r = new Reservation(date_resa, c, nb, p, p, v); 
        tabResa.add(r); 
        
    }
    
    
    public Vol rechercherVol(String num_v)
    {
        Vol v, trouve = null; 
        int i=0; 

        if(!tabVol.isEmpty())
        {
            while(i<tabVol.size()&& trouve==null)
            {
                v = tabVol.get(i); 
                
                if(v.getNumeroVol().equalsIgnoreCase(num_v))
                {
                    trouve = v; 
                }
                i++;
            } 
        }
         return trouve;
    }
    
    public void supprimerReservation()
    {
        Reservation resa; 
        
        System.out.println("Rechercher la réservation à supprimer: ");
        resa = rechercherReservation(); 
        if (resa!=null) // && si il y a une contrainte 
        {
          tabResa.remove(resa); 
        }
        
    }
    
    public Reservation rechercherReservation()
    {
        Reservation resa, trouve = null; 
        int i=0; 
        int num_r; 

        System.out.println("Entrer le numéro de la reservation à rechercher: ");
        num_r = Clavier.lireInt(); 
        
        if(!tabResa.isEmpty())
        {
            while(i<tabResa.size()&& trouve==null)
            {
                resa = tabResa.get(i); 
                
                if(resa.getNumReservation() ==  num_r)
                {
                    trouve = resa; 
                }
                i++;
            } 
        }
         return trouve;
    }
    
   
    public void modifierReservation()
    {
        Reservation resa;
        Vol v; 
        int r, num_p; 
        String choix, choix2,choix3; 
        
        resa = rechercherReservation();
        if (resa==null)
        {
            System.out.println("Réservation innexistante");
        }
        else 
        {
            System.out.println("Voulez-vous modifier le nombre de place ? (y/n)");
            choix = Clavier.lireString(); 
            if (choix=="y")
            {
                System.out.println("Entrez le nombre de place: ");
                num_p = Clavier.lireInt(); 
                resa.setNombrePlace(num_p);
            }
            
            System.out.println("Voulez vous supprimer un vol ?(y/n)");
            choix2 = Clavier.lireString(); 
            if (choix2=="y")
            {
                tabVol.remove(resa);
                System.out.println("Vol supprimer.");
            }
            System.out.println("Voulez vous ajouter un nouveau vol ?(y/n)");    
            choix3 = Clavier.lireString();
            if (choix3=="y")
            {
                
               /* v = saisirVol(); 
                resa.getListevol().add(v);*/
            }
        }
    }
        
        public void ajoutMontant()
        {
            Reservation resa; 
            double mont; 
            
            System.out.println("Reservation pour laquelle vous voulez ajouter un montant: ");
            resa = rechercherReservation(); 
            if (resa==null)
            {
                System.out.println("Reservation inexistante");
            }
            else
            {
                System.out.println("Saisir montant payé");
                mont = Clavier.lireDouble(); 
                resa.setPaiement(mont); 
            }
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
