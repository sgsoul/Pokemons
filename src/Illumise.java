import ru.ifmo.se.pokemon.*;

public class Illumise extends Pokemon {
    public Illumise(String name, int level) {
        super(name,level);
        setStats(65, 47, 75, 73, 85, 85);
        setType(Type.BUG);
        setMove(new Bulldoze(), new FocusEnergy(), new Submission(), new ViceGrip());
    }
}
