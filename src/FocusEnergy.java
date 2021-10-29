import ru.ifmo.se.pokemon.*;

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