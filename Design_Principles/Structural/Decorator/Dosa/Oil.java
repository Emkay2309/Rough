package Design_Principles.Structural.Decorator.Dosa;

public class Oil implements Dosa{
    public Dosa dosa;

    public Oil(Dosa dosa) {
        this.dosa = dosa;
    }
    @Override
    public int getCost() {
        if(dosa != null) {
            return dosa.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {
        if(dosa != null) {
            return dosa.getDescription() + " Oil ";
        }
        return "  Oil  ";
    }

}
