import ru.ifmo.se.pokemon.*;

class ViceGrip extends PhysicalMove {
    protected ViceGrip(){
        super(Type.NORMAL, 55, 100);
    }
    @Override
    protected String describe(){
        return "наносит урон без дополнительных эффектов";
    }
}