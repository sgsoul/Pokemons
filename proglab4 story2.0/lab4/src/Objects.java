import java.io.IOException;
import java.util.Scanner;

public class Objects extends AObjects {

    Objects(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    Objects(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        Place PN = getPlace();
        return "Object{" +
                "name = '" + name + "', " +
                "place = " + PN.getName() +
                "}";
    }

    public String stay() {
        return name + " стоит ";
    }

    public String putOn(Objects objects) {
        return "на " + objects.getName() + ". ";
    }

    public String checkInSight(Human human) {
        if (getPlace() == human.getPlace()) {
            return name + " на виду у " + human.getName() + ". ";
        } else {
            return name + " не на виду у " + human.getName() + ". ";
        }
    }

    public String checkNear(Objects objects) {
        if (getPlace() == objects.getPlace()) {
            return name + " находится возле " + objects.getName() + ". ";
        } else {
            return name + " не находится возле " + objects.getName() + ". ";
        }
    }

}