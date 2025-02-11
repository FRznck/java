package POOvoitureExo;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        //demande des infos à l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la marque de la voiture : ");
        String marque = scanner.nextLine();
        System.out.println("Entrez le modèle de la voiture : ");
        String modele = scanner.nextLine();
        System.out.println("Entrez la couleur de la voiture : ");
        String couleur = scanner.nextLine();
        
        //tant que la couleur est différent de couleurAutorisé, on redemande à l'utilisateur
        boolean found = false;
        for(String color : voiture.couleurAutorisé) {
            if(color.equals(couleur)) {
                found = true;
                break;
            }
        }

        //condition si on trouve la couleur 
        if(found){
            voiture voiture = new voiture(marque,modele,couleur);

            System.out.println("Voiture : " + voiture.getMarque());
         
        //sinon on affiche un message d'erreur    
        }else{
            System.out.println("Couleur non autorisée");
            System.exit(1);
        }





        scanner.close();
        
        
    }
    
}
