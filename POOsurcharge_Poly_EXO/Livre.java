public class Livre extends Produit {
    private String auteur;
    private String titre;
    private int nbPages;
    
    public Livre(String nom, String auteur, String titre, int nbPages) {
        super(nom);
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = nbPages;
    }
    @Override
    void CalculerPrix() {
        System.out.println("Calcule de Livre");
        
    }
    
    public String getAuteur() {
        return auteur;
    }
    
    public String getTitre() {
        return titre;
    }
    
    public int getNbPages() {
        return nbPages;
    }
    
   
    
}
