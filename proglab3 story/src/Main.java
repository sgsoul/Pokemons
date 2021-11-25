public class Main {
    public static void main(String[] args) {
        //создаем места
        Place Kitchen = new Place("Кухня");
        //создаем персонажей
        Human Malish = new Human("Малыш", Gender.MALE);
        Human Babka = new Human("Фрекен Бок", Gender.FEMALE);
        Human Karlson = new Human("Карлсон", Gender.ATTACKHELICOPTER8AH64APACHE);
        //создаем объекты
        Objects Cocoa = new Objects ("Банка c какао", Kitchen);
        Objects Stove = new Objects("Плита", Kitchen);
        Objects Shelf = new Objects("Полка", Kitchen);
        Objects OpenWindow = new Objects("Открытое окно");


        Malish.setFeel(Feelings.PEACEFULLY);
        System.out.println(Malish.nod());
        Malish.setFeel(Feelings.SCARED);
        System.out.println(Malish.look(Karlson));
        Malish.setFeel(Feelings.NODESIRE);
        System.out.println(Malish.getFeel() + Malish.lookAgain(Babka) + Malish.andBeatenBy(Babka));
        System.out.println(Malish.notUnderstand() + Malish.beAble(Karlson) + Malish.get(Cocoa));
        Babka.setPlace(Kitchen);
        System.out.println(Cocoa.checkNear(OpenWindow));
        System.out.println(Cocoa.stay() + Cocoa.putOn(Shelf) + Shelf.checkNear(Stove) + Cocoa.checkInSight(Babka));
    }
}