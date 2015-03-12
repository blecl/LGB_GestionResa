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
public class GestionVol {
    public static void main(String[] args) {
        GestionVol gv;
        gv = new GestionVol();
        gv.menu();
    }
    
    // Déclaration des tableaux
    private ArrayList<Vol> listevol; // Déclaration d'un tableau de vol
    
    // Contructeur
    public GestionVol() { 
        listevol = new ArrayList(); // Initialitisation des tableaux   
    }
}
     public void saisirVol(){

        Article a;
        String r, d, choix, c , taille, provenance;
        double p, t, poids, fdp;
        int q;
        Fournisseur f;
        int jour, mois, annee;
        Date datedujour, datelimite;
        Vetement v;
        ProduitFrais pf;


            // demander les infos à l'user, et utiliser le cons de article, passer a a listearticle
        System.out.println("Saisir la référence de l'article");
        r= Clavier.lireString();
        System.out.println("Saisir la désignation de l'article");
        d = Clavier.lireString();

        System.out.println("Saisir le prix de l'article");
        p = Clavier.lireDouble();

        System.out.println("Saisir la quantité de l'article");
        q = Clavier.lireInt();
        System.out.println("Saisir la TVA de l'article");
        t = Clavier.lireDouble();

        System.out.println("Saisir le fournisseur de l'article");
        f = saisirFournisseur();      
        do{
            System.out.println("Saisir une date de livraison"); // un if pour compararer la date saisie soit pas plus petit que aujour'dhui
            System.out.println("Saisir le jour : ");
            jour = Clavier.lireInt();
            System.out.println("Saisir le mois : ");
            mois = Clavier.lireInt();
            System.out.println("Saisir le l'année : ");
            annee = Clavier.lireInt();
            datedujour = new Date(annee-1900,mois-1,jour);
        }while(datedujour.compareTo(new Date())<0);

        System.out.println("Voulez vous créer un article, un vetement, ou produit frais");
        choix = Clavier.lireString();
        if(choix.equalsIgnoreCase("article")){
            a = new Article(r,d,p,q,t,f,datedujour);
            listearticles.add(a);
                System.out.println("Article ajouté");
        }else if(choix.equalsIgnoreCase("vetement")){
            System.out.println("Saisir la taille:");
            taille = Clavier.lireString();
            System.out.println("Saisir le colori:");
            c = Clavier.lireString();
            v = new Vetement(r,d,p,q,t,f,datedujour, c, taille);
            listearticles.add(v);
            System.out.println("Article ajouté");

        }else if(choix.equalsIgnoreCase("produit frais")){
            try{
                System.out.println("Saisir une date de limite de vente"); // un if pour compararer la date saisie soit pas plus petit que aujour'dhui
                System.out.println("Saisir le jour : ");
                jour = Clavier.lireInt();
                System.out.println("Saisir le mois : ");
                mois = Clavier.lireInt();
                System.out.println("Saisir le l'année : ");
                annee = Clavier.lireInt();
                datelimite = new Date(annee-1900,mois-1,jour);
                System.out.println("Saisir la provenance : ");
                provenance = Clavier.lireString();
                System.out.println("Saisir le poids en kilo: ");
                poids = Clavier.lireDouble();
                System.out.println("Saisir le montant des frais de port: ");
                fdp = Clavier.lireDouble();
                pf = new ProduitFrais(r,d,p,q,t,f,datedujour, datelimite, provenance, poids, fdp);
                listearticles.add(pf);
            }
            catch (Erreur e){
                System.out.println("Erreur dans la date limite de vente");
                System.exit(-1);
            }
        }

       /* System.out.println("Voici l'article saisi");
        System.out.print(listearticles.get(listearticles.size()-1).getReference()); // get pour recupérer, listearticles.size()-1 = récup de la dernière du tableau , getReference pour récupérer la référence
        System.out.print(listearticles.get(listearticles.size()-1).getDesignation());
        System.out.print(listearticles.get(listearticles.size()-1).getPrixHT());
        System.out.print(listearticles.get(listearticles.size()-1).getQuantite());*/
    }
    
    public void afficherArticle(){
        int i;
        Fournisseur f;
        Vetement v;
        ProduitFrais pf;
        
        if(!listearticles.isEmpty()){
            for(i=0; i<listearticles.size(); i++){
                System.out.println("-------");
                System.out.println(listearticles.get(i).getReference());
                System.out.println(listearticles.get(i).getDesignation());
                System.out.println(listearticles.get(i).getPrixHT());
                System.out.println(listearticles.get(i).getQuantite());
                System.out.println(listearticles.get(i).getFournisseur().getNomFour());
                System.out.println(listearticles.get(i).getDateLiv());
                if(listearticles.get(i) instanceof Vetement){
                   v = (Vetement)listearticles.get(i);
                   System.out.println(v.getColori());
                   System.out.println(v.getTaille());

                }else if(listearticles.get(i) instanceof ProduitFrais){
                   pf = (ProduitFrais)listearticles.get(i);
                   System.out.println(pf.getProvenance());
                   System.out.println(pf.getPoids());
                   System.out.println(pf.getDateLim());
                   System.out.println(pf.getFraisTransp());
                }

            }
        }
    }
    public void menu (){
        int i; // pour recupérer le numéro du menu
        System.out.println("Que voulez-vous faire?");
        System.out.println("1 Saisir Article");
        i = Clavier.lireInt();
        
        switch (i){
            case 1 : saisirVol();
                     menu();
                break;
            default: System.out.println("Fin de l'éxécution");
        }
}
