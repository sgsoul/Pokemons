import ru.ifmo.se.pokemon.*;

class Rest extends StatusMove {
    protected Rest(){
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect.sleep(p);
        p.setMod(Stat.HP,+1000);
    }
    @Override
    protected String describe(){
        return "пропускает 2 хода, но полностью восстанавливает здороьве";
    }
}