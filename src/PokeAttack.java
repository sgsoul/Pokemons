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

class Confide extends StatusMove {
    protected Confide(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe(){
        return "снижает специальную атаку противника на один пункт";
    }
}

class RockSlide extends PhysicalMove {
    protected RockSlide(){
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
    }
    @Override
    protected String describe(){
        return "имеет 30% шанс заставить противника дрогнуть";
    }
}

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

class FocusEnergy extends StatusMove {
    protected FocusEnergy(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
    }
    @Override
    protected String describe(){
        return "увеличивает шанс нанести критический удар";
    }
}

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

class ViceGrip extends PhysicalMove {
    protected ViceGrip(){
        super(Type.NORMAL, 55, 100);
    }
    @Override
    protected String describe(){
        return "наносит урон без дополнительных эффектов";
    }
}

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

class ClearSmog extends SpecialMove {
    protected ClearSmog(){
        super(Type.POISON, 50, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.restore();
    }
    @Override
    protected String describe(){
       return "удаляет все изменения характеристик противника" ;
    }
}