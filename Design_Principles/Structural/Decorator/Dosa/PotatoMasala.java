package Design_Principles.Structural.Decorator.Dosa;

public class PotatoMasala implements  Dosa {
    public Dosa dosa;
    public PotatoMasala(){

    }

    public PotatoMasala(Dosa dosa) {
        this.dosa = dosa;
    }
    @Override
    public int getCost() {
        if(dosa != null) {
            return dosa.getCost() + 50;
        }
        return 50;
    }

    @Override
    public String getDescription() {
        if(dosa != null) {
            return dosa.getDescription() + " Potato Masala ";
        }
        return "  Potato Masala  ";
    }
}
