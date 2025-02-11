public class Personne {
    String nom;
    String prenom;
    int age;
 
    //constructeur avec paramètres
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    //constructeur sans paramètres
    public Personne() {
        this.nom = null;
        this.prenom = null;
        this.age = 0;
    }
 

    void SePresenter(){
        System.out.println("Bonjour, je m'appelle " + this.prenom + " " + this.nom + " et j'ai " + this.age + " ans.");
    }

        

}
