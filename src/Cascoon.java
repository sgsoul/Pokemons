import ru.ifmo.se.pokemon.*;

public class Cascoon extends Pokemon {
    public Cascoon(String name, int level) {
        super(name, level);
        setStats(50, 35, 55, 25, 25, 15);
        setType(Type.BUG);
        setMove(new Confide(), new Rest(), new ScaryFace());
    }
}