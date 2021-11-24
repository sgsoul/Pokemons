import ru.ifmo.se.pokemon.*;

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