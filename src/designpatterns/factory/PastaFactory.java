package designpatterns.factory;

public class PastaFactory {
    public Pasta getPasta(String pastaType) {
        if("Carbonara".equals(pastaType)) {
            return new Carbonara();
        } else if ("Bolognese".equals(pastaType)) {
            return new Bolognese();
        } else {
            return null;
        }
    }
}
