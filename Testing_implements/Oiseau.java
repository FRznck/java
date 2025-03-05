

interface Volant {

    void voler();
}

public class Oiseau implements Volant {
    @Override
    public void voler() {
        System.out.println("Je vole");
    }
}
