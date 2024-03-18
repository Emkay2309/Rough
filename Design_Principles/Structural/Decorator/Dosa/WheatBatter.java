package Design_Principles.Structural.Decorator.Dosa;

public class WheatBatter implements  Dosa {
    private Dosa dosa ;
    public WheatBatter(Dosa dosa) {
        this.dosa = dosa;
    }
    @Override
    public int getCost() {
        if(dosa != null) {
            return dosa.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if(dosa != null) {
            return dosa.getDescription() + " Wheat Batter ";
        }
        return " Wheat Batter ";
    }
}
