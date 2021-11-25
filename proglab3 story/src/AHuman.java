import java.util.Objects;

abstract class AHuman implements IHuman {
    protected String name;
    protected Feelings Feel;
    protected Gender gender;
    protected Place place;
    protected String ending;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AHuman aHuman = (AHuman) o;
        return Objects.equals(name, aHuman.name);
    }

    @Override
    public String toString(){
        return "Human{" +
                "name = '" + name + '\'' +
                ", gender = " + gender +
                '}';
    }

    public String getName() {
        return this.name = name;
    }

    public Feelings setFeel(Feelings f) {
        return this.Feel = f;
    }

    public Gender getGender() {
        return gender;
    }

    public Place setPlace(Place place) {
        return this.place = place;
    }

    public  Place getPlace() {
        return place;
    }

    @Override
    public String walk(Place place) {
        return this.name + " идет в " + place.getName();
    }
}