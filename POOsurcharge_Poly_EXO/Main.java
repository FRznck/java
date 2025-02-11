public class Main {
    public static void main(String[] args) {
        Produit livre = new Livre("Livre1", "Auteur1", "Titre1", 100);
        Produit dvd = new DVD("DVD1", "TitreDVD1");

        livre.CalculerPrix();
        dvd.CalculerPrix();
    }
}
