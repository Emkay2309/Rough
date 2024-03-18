package Design_Principles.Structural.Decorator.Dosa;

public class OnionMasala implements Dosa{
    public Dosa dosa;

    public OnionMasala(Dosa dosa) {
        this.dosa = dosa;
    }
    @Override
    public int getCost() {
        if(dosa != null) {
            return dosa.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(dosa != null) {
            return dosa.getDescription() + " Onion Masala ";
        }
        return "  Onion Masala  ";
    }
}
