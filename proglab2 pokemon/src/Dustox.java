import ru.ifmo.se.pokemon.*;

public class Dustox extends Pokemon {
    public Dustox(String name, int level) {
        super(name, level);
        setStats(60, 50, 70, 50, 90, 65);
        setType(Type.BUG, Type.POISON);
        setMove(new Confide(), new Rest(), new ScaryFace(), new ClearSmog());
    }
}