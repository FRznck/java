import java.util.Scanner;
public class ask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //création d'un objet scanner
        System.out.println("Quel est ton nom ?");
        String name = scanner.nextLine(); //lecture de la ligne de saisie

        
        System.out.println("Quel âge as-tu mon grand ?");
        int age = 0;
        if(scanner.hasNextInt()) {
            age = scanner.nextInt();
            
        }
        else {
            System.out.println("Age non correcte");
            System.exit(0);
        }
        
        scanner.close(); //fermeture du scanner
    
        System.out.println("Bonjour " + name + " tu as " + age + " ans");
        if (age < 18) {
            System.out.println("Tu es mineur");
        } else {
            System.out.println("Tu es majeur");
        }

        

        
    }
}
