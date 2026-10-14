package composants;

public class Espresso extends Boisson{

    protected String description;
    public Espresso(){
        description= "Espresso";
    }

    @Override
    public double cout() {
        return 9;
    }
}
