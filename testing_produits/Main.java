import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Produits> Produit = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        while (choix != 3) {
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les produits");
            System.out.println("3. Quitter");
            System.out.println("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                AjouterProduit();
                    break;
                case 2:
                    AfficherProduit(Produit);
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
                    }
                }
                scanner.close();   
            }   
    public static void AjouterProduit() { ArrayList<Produits> Produits = new ArrayList<>();

            System.out.println("Entrez le nombre de produits à ajouter : ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
           

            for (int i = 0; i < n; i++) {
                System.out.println("Quel est la catégorie du produit ? : ");
                String categorie = scanner.nextLine();
                System.out.println("Entrez le nom du produit : ");
                String nom = scanner.nextLine();
                System.out.println("Entrez le prix du produit : ");
                double prix = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("décrivez le produit : ");
                String description = scanner.nextLine();
                Produits produit = new Produits(nom, prix, 0, categorie, description);
                Produits.add(produit);
                System.out.println("Produit ajouté avec succès !");
                scanner.close();
        
                }
            }
                

    

   
       
    

    public static void AfficherProduit(ArrayList<Produits> Produit) {
        for (Produits produit : Produit) {
            produit.AfficherProduit();
        }
    }
    
}

