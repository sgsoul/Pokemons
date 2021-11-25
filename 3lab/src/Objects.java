public class Objects extends AObjects{

    Objects(String name, Place place){
        this.name = name;
        this.place = place;
    }

    Objects(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

    public  Place getPlace(){
        return place;
    }

    @Override
    public  String toString(){
        Place  PN = getPlace();
        return "Object{" +
                "name = '" + name + "', " +
                "place = " + PN.getName() +
                "}";
    }

    public String stay(){
        return name + " стоит ";
    }

    public String putOn(Objects o){
        return "на " + o.getName() + ". ";
    }

    public String checkInSight(Human h){
        if (getPlace() == h.getPlace()){
            return name + " на виду у " + h.getName() + ". ";
        } else {
            return name + " не на виду у " + h.getName() + ". ";
        }
    }

    public String checkNear(Objects o){
        if (getPlace() == o.getPlace()) {
            return name + " находится возле " + o.getName() + ". ";
        } else {
            return  name + " не находится возле " + o.getName() + ". ";
        }
    }
}