public class Animal {
    private String nom;
    private String couleur;
    private float poids;

    public Animal(String nom, String couleur, float poids) {
      this.nom = nom;
      this.couleur = couleur;
      this.poids = poids;
    }

    public Animal() {
      this.nom = "Inconnu";
      this.couleur = "Inconnue";
      this.poids = 0;
    }

    public String getNom() {
      return nom;
    }


    public String getCouleur() {
      return couleur;
    }

    public float getPoids() {
      return poids;
    }

    public void faireDuBruit() {
      System.out.println("Je suis un animal méchant et je fais du bruit");
    }
    
    
}