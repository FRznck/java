package POOvoitureExo;

public class Main {
    public static void main (String[] args) {
        voiture v1 = new voiture();
        v1.marque = "Peugeot";
        v1.modele = "208";
        v1.couleur = "rouge";
        v1.demarrer();
        v1.freiner();
    }
    
}
