import java.util.Scanner;

public class GestionDesExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = {1, 2, 3, 4, 5};

        System.out.print("Entre un index: ");
        int index = scanner.nextInt();

        try {
            System.out.println("La valeur à l'index " + index + " est: " + tableau[index]);
        } catch (Exception e) {
            System.out.println("Erreur: L'index demandé dépasse la taille du tableau.");
        }

        scanner.close();
    }
}