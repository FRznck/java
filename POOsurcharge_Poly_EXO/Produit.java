public abstract class Produit {

    protected String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    abstract void CalculerPrix();

}

