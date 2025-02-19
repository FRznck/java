import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   
    private static ArrayList<Etudiant> Etudiants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Saisir d'étudiants dans la liste
        System.out.println("Bienvenue dans le programme de gestion des étudiants");
        System.out.println(" \n");
        // ajout d'un lapse de temps pour que l'utilisateur puisse lire le message
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Entrez sur une touche pour continuer");
       
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        // Menu principal
        int choix = 0; // Déclaration de la variable choix
        
        do {
            System.out.println("1. Ajouter un etudiant");
            System.out.println("2. Supprimer un etudiant");
            System.out.println("3. Afficher la liste des etudiants");
            System.out.println("4. Rechercher un etudiant");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
    
            // Lire l'entrée de l'utilisateur
            choix = scanner.nextInt();
    
            // Traitement du choix
            switch (choix) {
                case 1:
                    ajouterEtudiant();
                    break;
                case 2:
                    supprimerEtudiant();
                    break;
                case 3:
                    afficherEtudiants();
                    break;
                case 4:
                   rechercherEtudiant();
                    break;
                    
                case 5:
                    System.out.println("Merci d'avoir utilisé notre programme !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        } while (choix != 4); 
    
        scanner.close(); 
    }

     //fonction pour ajouter un etudiant
     public static void ajouterEtudiant() {
        System.out.println("Vous êtes sur le point d'ajouter un etudiant");
        System.out.println("Entrez le nom de l'Etudiant: ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Entrez le prenom de l'Etudiant:: ");
        String prenom = scanner.nextLine();
        System.out.println("Classe de l'Etudiant: ");
        String classe = scanner.nextLine();
        Etudiant etudiant = new Etudiant(nom, prenom, classe);
        Etudiants.add(etudiant); 
        System.out.println("Etudiant ajoute avec succes");
    }

    //fonction pour supprimer un etudiant
    public static void supprimerEtudiant() {
        System.out.println("Vous êtes sur le point de supprimer un etudiant");
        System.out.println(" ");
        System.out.println("Entrez le nom de l'Etudiant: ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Entrez le prenom de l'Etudiant:: ");
        String prenom = scanner.nextLine();
        
        scanner.close();
        //on compare les noms et prenoms pour supprimer l'etudiant
        for (int i = 0; i < Etudiants.size(); i++) {
            if (Etudiants.get(i).getNom().equals(nom) && Etudiants.get(i).getPrenom().equals(prenom)) {
                Etudiants.remove(i);
                System.out.println("Etudiant supprime avec succes");
                return;
            }
        }
        System.out.println("Etudiant non trouve");
  
}
//fonction pour afficher la liste des etudiants et dans le cas ou il n'y a pas d'etudiant, on affiche aucun etudiant trouvé
public static void afficherEtudiants() {
    if (Etudiants.isEmpty()) {
        System.out.println(" \n");
        System.out.println("Aucun etudiant trouve");
        
    } else {
        System.out.println(" \n");
        System.out.println("Liste des etudiants: ");
        for (int i = 0; i < Etudiants.size(); i++) {
            System.out.println("Nom: " + Etudiants.get(i).getNom());
            System.out.println("Prenom: " + Etudiants.get(i).getPrenom());
            System.out.println("Classe: " + Etudiants.get(i).getClasse());
            System.out.println(" ");
        }
        }
    }


    //fonction qui permet de rechercher un etudiant
    public static void rechercherEtudiant() {
        System.out.println("Vous êtes sur le point de rechercher un etudiant");
        System.out.println(" ");
        System.out.println("Entrez le nom de l'Etudiant: ");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Entrez le prenom de l'Etudiant:: ");
        String prenom = scanner.nextLine();
        scanner.close();
        //on compare les noms et prenoms pour rechercher l'etudiant
        for (int i = 0; i < Etudiants.size(); i++) {
            if (Etudiants.get(i).getNom().equals(nom) && Etudiants.get(i).getPrenom().equals(prenom)) {
                System.out.println("Etudiant trouve");
                System.out.println("Nom: " + Etudiants.get(i).getNom());
                System.out.println("Prenom: " + Etudiants.get(i).getPrenom());
                System.out.println("Classe: " + Etudiants.get(i).getClasse());
                return;
           
            }else{
                System.out.println("Etudiant non trouvé(e)");
            }
        }
        
                

    }
}









