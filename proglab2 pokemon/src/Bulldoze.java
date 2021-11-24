import ru.ifmo.se.pokemon.*;

class Bulldoze extends PhysicalMove {
    protected Bulldoze(){
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe(){
        return "имеет 100% шанс понизить скорость цели на один пункт";
    }
}