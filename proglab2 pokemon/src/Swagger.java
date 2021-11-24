import ru.ifmo.se.pokemon.*;

class Swagger extends StatusMove {
    protected Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
    p.setMod(Stat.ATTACK, 2);
    Effect.confuse(p);
    }
    @Override
    protected String describe(){
        return "повышает атаку противника на два пункта и сбивает его с толку";
    }
}
