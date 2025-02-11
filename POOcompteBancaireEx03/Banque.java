public class Banque {
    private String titulaire;
    private double solde;


    public Banque(String titulaire, double montant) {
        this.titulaire = titulaire;
        this.solde = montant;
    }

    public void deposer(double montant) {
        if(montant > 0) {
            this.solde += montant;
            System.out.println(this.titulaire + ":"+ montant + " a été déposé avec succès");
        }
    }

    public void retirer(double montant) {
        if((this.solde -montant) > 0){
            this.solde -=montant;
            System.out.println(this.titulaire + ":" + montant + " a été retiré avec succès");
        }else{
            System.out.println("Solde insuffisant");
        }
    }

}