package Design_Principles.Structural.Decorator.Dosa;

public class DosaMain {
    public static void main(String[] args) {
        Dosa Mohsin = new RiceBatter(new PotatoMasala(new Ghee()));
        System.out.println(Mohsin.getCost());
        System.out.println(Mohsin.getDescription());

        Dosa emkay = new Oil(Mohsin);
        System.out.println(emkay.getDescription());
        System.out.println(emkay.getCost());

        Dosa Yooo = new WheatBatter(new OnionMasala(new PotatoMasala(new Ghee())));
        System.out.println(Yooo.getCost());
        System.out.println(Yooo.getDescription());

    }
}
