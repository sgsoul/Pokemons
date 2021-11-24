import ru.ifmo.se.pokemon.*;

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