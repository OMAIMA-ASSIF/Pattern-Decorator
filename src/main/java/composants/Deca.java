package composants;

public class Deca extends Boisson{

    protected String description;
    public Deca(){
        description= "Deca";
    }

    @Override
    public double cout() {
        return 8;
    }
}
