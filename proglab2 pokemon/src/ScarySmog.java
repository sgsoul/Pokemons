import ru.ifmo.se.pokemon.*;

class ScaryFace extends StatusMove {
    protected ScaryFace(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.9) p.setMod(Stat.SPEED , -2);
    }
    @Override
    protected String describe(){
        return "снижает скорость противнка на 2 пункта";
    }
}