package kingGambitExtended.implementations;

public abstract class BaseHero{
    private String name;

    protected BaseHero(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}
