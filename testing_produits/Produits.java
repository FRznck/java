public class Produits {

    private String Nom;
    private double Prix;
    private int Quantites;
    private String Categories;
    private String Description;
  
    public Produits(String Nom, double Prix, int Quantites, String Categories, String Description) {
      this.Nom = Nom;
      this.Prix = Prix;
      this.Quantites = Quantites;
      this.Categories = Categories;
      this.Description = Description;
    }

    public Produits() {
        this.Nom = "";
        this.Prix = 0;
        this.Quantites = 0;
        this.Categories = "";
        this.Description = "";
    }


    public String getNom() {
      return Nom;
    }
    public double getPrix() {
      return Prix;
    }
    public int getQuantites() {
      return Quantites;
    }
    public String getCategories() {
      return Categories;
    }
    public String getDescription() {
        return Description;
        }

   
  public void AfficherProduit() {
    System.out.println("Nom: " + Nom);
    System.out.println("Prix: " + Prix);
    System.out.println("Quantités: " + Quantites);
    System.out.println("Catégories: " + Categories);
    System.out.println("Description: " + Description);
  }      
}