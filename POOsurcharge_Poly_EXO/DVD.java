public class DVD extends Produit {

    private String title;

    public DVD(String nom, String title) {
        super(nom);
        this.title = title;
    }
    @Override
    void CalculerPrix() {
        System.out.println("Calcul du prix du DVD: " + title);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

}