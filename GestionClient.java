/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.util.ArrayList;

/**
 *
 * @author Bastien
 */
public class GestionClient {

    //-------- Attibuts -------------- 
    private ArrayList<Client> tabClient; 
    
    public GestionClient ()
    {
  
        tabClient = new ArrayList(); 
    }
    
    public void AjouterClient()
    {
        Client c;  
        String log_c, mdp_c, nom_c, prenom_c, add_c, tel_c; 
        int nb = 0; 
        
        System.out.println("Entrez un login: ");
        log_c = Clavier.lireString();
        
        c=RechercherClient(log_c); 
        
        System.out.println("Entrez un mot de passe: ");
        mdp_c = Clavier.lireString();
        System.out.println("Entrez votre nom: ");
        nom_c = Clavier.lireString();
        System.out.println("Entrez votre prénom: ");
        prenom_c = Clavier.lireString();
        System.out.println("Entrez votre adresse: ");
        add_c = Clavier.lireString();
        System.out.println("Entrez votre numéros de téléphone: ");
        tel_c = Clavier.lireString();
        c = new Client (nom_c, prenom_c, add_c, tel_c, log_c, mdp_c); 
        tabClient.add(c); 
        
        System.out.println("Le client a été créé !");
    }
    
    public Client RechercherClient(String log_c)
    {
        Client client, trouve = null; 
        
        int i=0; 
        
        if(!tabClient.isEmpty())
            
            while(i<tabClient.size()&& trouve==null)
            {
                client = tabClient.get(i); 
                if (client.getLogin().equalsIgnoreCase(log_c))
                {
                    trouve = client; 
                    System.out.println("Login déjà utilisé, veuillez choisir un autre login.");
                    AjouterClient(); 
                }
                i++; 
            }
        return trouve;
    }
    
        
    
     public void menu()
    {
        int r; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire ? ");
        System.out.println("1 Créer un compte client");
        System.out.println("Donner une valeur : ");
        
        r = Clavier.lireInt();
        
        switch (r)
        {
            case 1 : AjouterClient();
                    menu();
                break;
        }
    }
    
   
    public static void main(String[] args)
    {
        // TODO code application logic here
        GestionClient g;
        g = new GestionClient();
        g.menu();
          
    }
    
}
    
