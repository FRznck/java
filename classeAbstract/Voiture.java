//implementons l'interface Transport dans la classe Voiture
public class Voiture implements Transport {
    @Override
    public void deplacer() {
        System.out.println("La voiture se déplace sur la route.");
    }
}