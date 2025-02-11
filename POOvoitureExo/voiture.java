package POOvoitureExo;


public class voiture {

     
    private String marque; 
    private String modele;   
    private String couleur; 

    //création d'un tableau pour stocker les couleurs
    public static String[] couleurAutorisé = {"rouge", "bleu", "vert", "jaune", "noir", "blanc"};


     public voiture(String marque, String modele, String couleur) {
         this.marque = marque;
         this.modele = modele;
         this.couleur = couleur;
     }

    //methodes
     void demarrer() {
        System.out.println("La voiture démarre");
    }
    void freiner() {
        System.out.println("La voiture s'arrête");}
    
   public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public String getCouleur() {
        return this.couleur;     
    
    }

}
