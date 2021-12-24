public class Place {
    protected String name;

    public Place(String name){
        this.name = name;
        //return ("Место - " + name);
    }

    public String getName(){
        return name;
    }
    public static class Balcony {
        public String balcony() {
            return " я не бесполезный я правда нужен в этой лабе";
        }
    }


}