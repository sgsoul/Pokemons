import ru.ifmo.se.pokemon.*;

public class Battleground {
    public static void main(String[] args) {
        Battle field = new Battle();
        field.addAlly(new Illumise("Buda",1));
        field.addAlly(new Gulpin("Mayot",1));
        field.addAlly(new Swalot("Depo",1));
        field.addFoe(new Wurmple("BigBabyTape",1));
        field.addFoe(new Cascoon("Soda",1));
        field.addFoe(new Dustox("lov66",1));
        field.go();
    }
}
