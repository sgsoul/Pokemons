public abstract class AObjects implements IObjects {
    protected String name;
    protected Place place;


    @Override
    public String getName() {
        return this.name = name;
    }

    public Place setPlace(Place place) {
        this.place = place;
        return this.place;
    }

    @Override
    public String setNear(Objects objects){
        return this.name + " находится возле " + objects.getName();
    }


}