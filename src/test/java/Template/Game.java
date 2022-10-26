package Template;

public abstract class Game {
    abstract void  collectResources();
    abstract void  buildStructures();
    abstract void buildUnits();
    abstract void attack();

    public final void play() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }
}
