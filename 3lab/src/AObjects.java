public abstract class AObjects implements IObjects {
    protected String name;
    protected Place place;


    public String getName() {
        return this.name = name;
    }

    public Place setPlace(Place p) {
        this.place = p;
        return this.place;
    }

    @Override
    public String setNear(Objects o){
        return this.name + " находится возле " + o.getName();
    }
}