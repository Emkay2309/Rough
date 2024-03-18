package Design_Principles.Structural.Decorator.Dosa;

public class Ghee implements Dosa {
    public Dosa dosa;
    public Ghee(){

    }
    public Ghee(Dosa dosa) {
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
            return dosa.getDescription() + " Ghee ";
        }
        return "  Ghee  ";
    }

}
