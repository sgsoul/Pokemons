import java.util.EventObject;

public class MyEvent extends EventObject {
    public enum Type {
        BUMP, RIDE, STOP, STAY
    }

    private Type type =  Type.STAY;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public MyEvent(Object obj, Type type) {
        super(obj);
        this.type = type;
    }
}
