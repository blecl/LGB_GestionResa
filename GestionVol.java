/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionreservation;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gwen0309
 */
public class GestionVol {
    public static void main(String[] args) {
        GestionVol gv;
        gv = new GestionVol();
        gv.menu();
    }
    
    // Déclaration des tableaux
    private ArrayList<Vol> listevol; // Déclaration d'un tableau de vol
    private ArrayList<Aeroport> listeaeroport;
    // Contructeur
    public GestionVol() { 
        listevol = new ArrayList(); // Initialitisation des tableaux   
        listeaeroport = new ArrayList();
    }

    public void saisirVol(){
        Vol v;
        String numv;
        Date ddepart, darrivee;
        int jourd, joura, moisd, moisa, anneed, anneea;
        double prixc1, prixc2;
        int qtec1, qtec2;
        Date hdepart = null, harrivee = null;
        String heured, heurea;
        Aeroport aorigine, adestination;
        DateFormat df;
        
        df = new SimpleDateFormat("h:mm a");
        
        System.out.println("Creation de vol");
       
        System.out.println("Saisir le numéro de vol");
        numv= Clavier.lireString();
        System.out.println("Saisir la date de départ");
        System.out.println("Saisir le jour");
        jourd = Clavier.lireInt();
        System.out.println("Saisir le mois");
        moisd = Clavier.lireInt();
        System.out.println("Saisir l'année");
        anneed = Clavier.lireInt();
        ddepart = new Date(anneed-1900,moisd-1,jourd);
        /*System.out.println("Saisir l'heure de départ"); interface graphique
        heured = Clavier.lireString(); // avec le format "h:mm am ou pm"*/
        
        int i = 1;
        do{
             
            try{ // do while en  test try catch pour l'interface grpahique
                System.out.println("Saisir l'heure de départ au format h:mm am ou pm");
                heured = Clavier.lireString(); 
                hdepart = df.parse(heured); // Transformation de la string heured en date hdepart selon le format
                i=1;
            } catch(ParseException e){
                System.out.println("L'heure n'est pas au bon format ! Recommencez!");
                i=0;
            }                        
        }while(i==0);
        
        /*Pour l'interface graphique
        df = new SimpleDateFormat("h:mm a");
        try{ // do while en  test try catch pour l'interface grpahique
            hdepart = df.parse(heured); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            System.out.println("L'heure n'est pas au bon format ! Recommencez!");
        }*/
        
        
        
        System.out.println("Saisir la date d'arrivee");
        joura = Clavier.lireInt();
        System.out.println("Saisir le mois");
        moisa = Clavier.lireInt();
        System.out.println("Saisir l'année");
        anneea = Clavier.lireInt();
        darrivee = new Date(anneea-1900,moisa-1,joura);

        System.out.println("Saisir l'heure d'arrivee");
        do{
            
            try{ // do while en  test try catch pour l'interface grpahique
                System.out.println("Saisir l'heure d'arrivee au format h:mm am ou pm");
                heurea = Clavier.lireString();  
                harrivee = df.parse(heurea); // Transformation de la string heured en date harrivee selon le format
                i = 1;
                
            } catch(ParseException e){
                System.out.println("L'heure n'est pas au bon format ! Recommencez!");
                i=0;
            }                        
        }while(i==0);
        
        /*Test sur la date et l'heure d'arrivée*/
        int j = 0;
        while (j == 0 || i==0){
            if (ddepart.compareTo(darrivee ) > 0) {   // traitement du cas ddepart > darrivee  // alert : erreur darrivee < ddepart resaisir la date arriver
                System.out.println("Erreur ! Votre date d'arrivée est antérieur à la date de départ");
                System.out.println("Saisir la date d'arrivee");
                joura = Clavier.lireInt();
                System.out.println("Saisir le mois");
                moisa = Clavier.lireInt();
                System.out.println("Saisir l'année");
                anneea = Clavier.lireInt();
                darrivee = new Date(anneea-1900,moisa-1,joura);
                j=0;
           
            }else if (ddepart.compareTo(darrivee ) == 0) { // Cas hdépart = harrivee // Resaisir l'heure arrivee
                if (hdepart.compareTo(harrivee) > 0){ // cas harriver antérieur a hdepart --> resaisir heure et re-test
                    System.out.println("Erreur de saisie dans l'heure d'arrivée.");
                    System.out.println("Heure arrivée est antérieur à l'heure départ");
                    try{ // do while en  test try catch pour l'interface grpahique
                        System.out.println("Saisir l'heure d'arrivee au format hh:mm am ou pm");
                        heurea = Clavier.lireString();  
                        harrivee = df.parse(heurea); // Transformation de la string heured en date harrivee selon le format
                        i = 0;
                    } catch(ParseException e){
                        System.out.println("L'heure n'est pas au bon format ! Recommencez!");
                        i=0;
                    }       
                    j=0;
                }else if(hdepart.compareTo(harrivee) == 0){ // cas de l'heure départ et heure arrivéé identique
                    System.out.println("Erreur de saisie dans l'heure d'arrivée.");
                    System.out.println("Heure arrivée est égale à l'heure départ");
                    try{ // do while en  test try catch pour l'interface grpahique
                        System.out.println("Saisir l'heure d'arrivee au format hh:mm am ou pm");
                        heurea = Clavier.lireString();  
                        harrivee = df.parse(heurea); // Transformation de la string heured en date harrivee selon le format
                        i = 0;
                    } catch(ParseException e){
                        System.out.println("L'heure n'est pas au bon format ! Recommencez!");
                        i=0;
                    }       
                    j=0;
                }else{ // cas harrivée OK
                    System.out.println("Harrivee OK!");
                    i=1;
                    j=1;
                }
            }else{
                System.out.println("Date et heure arrivée OK !");
                j = 1;
            }    
        }
        // Interface graphique 
        /* 
        System.out.println("Saisir l'heure d'arrivee"); interface graphique
        heurea = Clavier.lireString(); // avec le format "h:mm am ou pm"
        try{ // do while en  test try catch pour l'interface grpahique
            harrivee = df.parse(heurea); // Transformation de la string heured en date hdepart selon le format
        } catch(ParseException e){
            System.out.println("L'heure n'est pas au bon format ! Recommencez!");
        }
        */
        System.out.println("Saisir le prix de la place en 1ere classe");
        prixc1 = Clavier.lireDouble();
        System.out.println("Saisir le prix de la place en 2eme classe");
        prixc2 = Clavier.lireDouble();
        System.out.println("Saisir le nombre de place en 1ere classe");
        qtec1 = Clavier.lireInt();
        System.out.println("Saisir le nombre de place en 2eme classe");
        qtec2 = Clavier.lireInt();
       
        System.out.println("Saisir l'aeroport d'origine du vol");
        //aorigine = Clavier.lireString(); // appel de la fonction recherhce aeroport (Clavier.lireString())
        aorigine = rechercherAeroport();
        if(aorigine == null){
            System.out.println("Aeroport non trouver, merci de  saisir les données de l'aeroport");
            saisirAeroport();
        }else{
                System.out.println("Aeroport d'origine trouvé");       
        }
        System.out.println("Saisir l'aeroport de destination du vol");
        //adestination = Clavier.lireString(); // appel de la fonction rechercher aeroport et saisir aeroport    
        adestination = saisirAeroport();
        
        v = new Vol(numv,ddepart,hdepart,darrivee,harrivee, prixc1, qtec1, prixc2, qtec2, aorigine, adestination);
        listevol.add(v);
        
        System.out.println("Votre vol à bien été enregistré !");
    
    }
    
    public Aeroport rechercherAeroport(){ // Article car renvoi un objet de type article
        Aeroport a, trouve = null; // ou Article trouve = null;
        String num;
        int i = 0;
        
        System.out.println("Numéro de l'aeroport à rechercher: ");
        num = Clavier.lireString();
        
        if(!listeaeroport.isEmpty()){
            while(i<listeaeroport.size() && trouve == null){
                a=listeaeroport.get(i); // recupère le contenu du constructeur du ième élement
                if(a.getNumeroAeroport().equalsIgnoreCase(num)){
                    trouve = a;
                }
                i++;
            }
        }
        return trouve;
    }
    
    public Aeroport saisirAeroport(){
        Aeroport a;
        String num;
        String nom;       
        String addr;
        String tel;
        
        a=rechercherAeroport();
        if(a == null){
            System.out.println("Aeroport non trouver ! ");
            System.out.println("Saisir le numéro de l'aeroport");
            num= Clavier.lireString();

            System.out.println("Saisir le nom de l'aeroport");
            nom = Clavier.lireString();

            System.out.println("Saisir le telephone de l'aeroport");
            tel = Clavier.lireString();

            System.out.println("Saisir l'adresse de l'aeroport");
            addr = Clavier.lireString();

            a = new Aeroport(num,nom,addr, tel);
            listeaeroport.add(a);
            System.out.println("Aeroport créer ! ");
        }else{
                System.out.println("Aeroport existant !");        
        }
        return a;
    }
    public void afficherVols(){
        int i;
        
        if(!listevol.isEmpty()){
            for(i=0; i<listevol.size(); i++){
                System.out.println("-------");
                System.out.println(listevol.get(i).getNumeroVol());
                System.out.println(listevol.get(i).getAeroportOrigine().getNomAeroport());
                System.out.println(listevol.get(i).getAeroportDestination().getNomAeroport());
                System.out.println(listevol.get(i).getDateDepart());
                System.out.println(listevol.get(i).getHeureDepart());
                System.out.println(listevol.get(i).getDateArrivee());
                System.out.println(listevol.get(i).getHeureArrivee());
            }
        }
    }
    
    public void listerAeroports(){
        int i;
        
        if(!listeaeroport.isEmpty()){
            for(i=0; i<listeaeroport.size(); i++){
                System.out.println("-------");
                System.out.println(listeaeroport.get(i).getNumeroAeroport());
                System.out.println(listeaeroport.get(i).getNomAeroport());
                System.out.println(listeaeroport.get(i).getAdresse());
                System.out.println(listeaeroport.get(i).getTelephone());
                
            }
        }
    }
    
    public void menu(){
        int i; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire?");
        System.out.println("1 Saisir un vol");
        System.out.println("2 Saisir un aeroport");
        System.out.println("3 Afficher les vols");
        System.out.println("4 Afficher les aeroports");

        i = Clavier.lireInt();
        
        switch (i){
            case 1 : saisirVol();
                    menu();
                break;
            case 2 : saisirAeroport();
                    menu();
                break;
            case 3 : afficherVols();
                    menu();
            case 4 : listerAeroports();
                    menu();
            default: System.out.println("Fin de l'éxécution");
        }
    }
}
