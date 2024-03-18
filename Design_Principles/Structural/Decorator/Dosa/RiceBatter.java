package Design_Principles.Structural.Decorator.Dosa;

public class RiceBatter implements  Dosa{

    private Dosa dosa ;

    public RiceBatter(){
    }
    public RiceBatter (Dosa dosa) {
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
            return dosa.getDescription() + " Rice Batter ";
        }
        return " Rice Batter ";
    }
}
