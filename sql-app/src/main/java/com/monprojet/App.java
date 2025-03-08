package com.monprojet;



import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        /* On clear la console */
        System.out.print("\033[H\033[2J");   
        System.out.flush();

        System.out.println( "Bonjour et bienvenue dans ce GESTIONNAIRE" );
        Connexion link = new Connexion();
        GestionUtilisateur gu = new GestionUtilisateur(link);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //entrer sur la touche entrée pour continuer
        
        System.out.println("Appuyer sur la touche entrée pour continuer");
        Scanner sc1 = new Scanner(System.in);
        sc1.nextLine();
        

        /* On demande à l'utilisateur ce qu'il veut faire */
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do { 
            System.out.println("Que voulez vous faire ?");
            System.out.println("1 - Lister les utilisateurs");
            System.out.println("2 - Ajouter un utilisateur");
            System.out.println("3 - Supprimer un utilisateur");
            System.out.println("4 - Modifier un utilisateur");
            System.out.println("5 - Rechercher un utilisateur");
            System.out.println("0 - Quitter");
            choice = sc.nextInt();
            
            System.out.print("\033[H\033[2J");   
            System.out.flush(); 
            
            switch (choice) {
                case 1:
                    gu.listUtilisateurs();
                    System.out.println("---------------------");
                    break;

                case 2:
                    System.out.print("Nom de l'utilisateur: ");
                    sc.nextLine();
                    String nom = sc.nextLine();

                    System.out.print("Email de l'utilisateur: ");
                    String email = sc.nextLine();

                    Utilisateur utilisateur = new Utilisateur(nom, email);

                    gu.addUtilisateurs(utilisateur);
                    System.out.println("---------------------");
                    break;

                case 3 :
                    System.out.print("ID de l'utilisateur à supprimer : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gu.deleteUtilisateurs(id);
                    System.out.println("---------------------");
                    break;    
                
                    case 4 :
                    System.out.print("ID de l'utilisateur à modifier : ");
                    int idModif = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Nouveau nom de l'utilisateur : ");
                    String newNom = sc.nextLine();
                    
                    System.out.print("Nouvel email de l'utilisateur : ");
                    String newEmail = sc.nextLine();
                    
                    gu.ModifUtilisateurs(idModif, newNom, newEmail);
                    System.out.println("---------------------");
                    break;  
                case 5:
                    System.out.println("ID de l'utilisateur à rechercher : ");
                    int idRecherche = sc.nextInt();
                    sc.nextLine();
                    break;     
                default:
                    System.out.println("Choix incorrect !");
                    break;
            }
        } while(choice != 0);

        link.close();
        sc.close();
    }
}