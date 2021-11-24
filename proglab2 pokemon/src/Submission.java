import ru.ifmo.se.pokemon.*;

class Submission extends  PhysicalMove {
    protected Submission(){
        super(Type.FIGHTING, 80, 80);
    }
    @Override
    protected void applySelfDamage(Pokemon pokemon, double v) {
        double hp = pokemon.getHP() - 0.25 * pokemon.getHP();
        pokemon.setMod(Stat.HP, (int)hp);
    }
    @Override
    protected String describe(){
        return "наносится 1/4 урона от отдачи";
    }
}