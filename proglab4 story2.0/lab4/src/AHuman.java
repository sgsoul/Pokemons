import java.util.Objects;

abstract class AHuman implements IHuman {
    protected String name;
    protected Feelings feel;
    protected Gender gender;
    protected Place place;
    protected String ending;
    protected Objects objects;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AHuman aHuman = (AHuman) object;
        return Objects.equals(name, aHuman.name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                '}';
    }

    public String getName() {
        return this.name = name;
    }

    public Feelings setFeel(Feelings feel) {
        return this.feel = feel;
    }

    public Gender getGender() {
        return gender;
    }

    public Place setPlace(Place place) {
        return this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String walk(Place place) {
        return this.name + " идет в " + place.getName();
    }

    public String speak(String text) {
        return (":" + text);
    }
}