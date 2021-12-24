//главный класс, в котором выполняется лаба
public class Main {
    public static void main(String[] args) {
        //создаем автора
        Author Author = new Author("Астрид Линдгрен", Gender.FEMALE);
        //создаем места
        Place Kitchen = new Place("Кухня");
        Place KHome = new Place("Крыльцо Карлсона");
        Place Balcony = new Place("Балкон");
        //создаем персонажей
        Human Malish = new Human("Малыш", Gender.MALE);
        Human Babka = new Human("Фрекен Бок", Gender.FEMALE);
        PropellerMan Karlson = new PropellerMan("Карлсон", Gender.ATTACKHELICOPTER8AH64APACHE);
        Human Parent = new Human("Родитель", Gender.UNKNOWN);
        Human.Mother Mom = Parent.new Mother();
        //создаем объекты
        Objects Cocoa = new Objects("Банка c какао", Kitchen);
        Objects Stove = new Objects("Плита", Kitchen);
        Objects Shelf = new Objects("Полка", Kitchen);
        Objects OpenWindow = new Objects("Открытое окно");
        Objects Rugs = new Objects("Половики");
        Buns Nyam = new Buns("Румяные плюшки");

        //лямбда-выражение, которое возвращает "Против этого "
        Text textAgainstThis;
        textAgainstThis = () -> "Против этого ";

        //лямбда-выражение, которое возвращает ", когда увидел "
        Text textWhenSaw;
        textWhenSaw = () -> ", когда увидел ";

        //лямбда-выражение, которое возвращает "но "
        Text textBut;
        textBut = () -> "но ";

        //лямбда-выражение, которое возвращает " и "
        Text textAnd;
        textAnd = () -> " и ";

        //лямбда-выражение, которое возвращает " а "
        Text textA;
        textA = () -> " а ";

        //лямбда-выражение, которое возвращает "Конечно, "
        Text textOfCourse;
        textOfCourse = () -> "Конечно, ";


        //анонимный класс, в котором создаем объект собаку..
        IAnimal dog = new IAnimal() {
            //метод возвращающий лай собакена
            public String bark() {
                return "Бимбо залаял";
            }
        };


        //печатаем нашу историю
        Karlson.setFeel(Feelings.REPROACH);
        System.out.println(Karlson.look(Malish));
        System.out.println(textAgainstThis.addText() + Karlson.noObjected());
        System.out.println(Karlson.grab(Malish));
        Karlson.pushButton();
        System.out.println(Karlson.fly(Malish));
        System.out.println(Author.speak("Что и говорить, бесстрашный герой!"));
        System.out.println(dog.bark() + textWhenSaw.addText() + Malish.disappear(OpenWindow));
        System.out.println(textBut.addText() + Malish.shouted() + Malish.speak(" Спокойствие, только спокойствие! Я скоро вернусь."));
        Nyam.lie(KHome);
        System.out.println(Nyam.looks());
        System.out.println(Karlson.boast() + Karlson.speak(" И к тому же я за них честно заплатил. Поделим их поровну: ") + Nyam.number() + " тебе" + textAnd.addText() + Nyam.number() + " мне ");
        System.out.println(Nyam.put(Karlson));
        System.out.println(Malish.objected() + Malish.speak(" Так не получится. ") + Nyam.number() + textAnd.addText() + Nyam.number() + " будет " + Nyam.numberAll() + textA.addText() + "у нас всего " + Nyam.getCount() + " " + Nyam.getName());
        System.out.println(Nyam.foldedUp(Karlson));
        Malish.setFeel(Feelings.PEACEFULLY);
        System.out.println(Malish.nod());
        Malish.setFeel(Feelings.SCARED);
        System.out.println(Malish.look(Karlson));
        Malish.setFeel(Feelings.NODESIRE);
        System.out.println(Malish.getFeel() + Malish.lookAgain(Babka) + Babka.andBeatenBy());
        System.out.println(Malish.notUnderstand() + Malish.beAble(Karlson) + Malish.get(Cocoa));
        Babka.setPlace(Kitchen);
        System.out.println(Cocoa.checkNear(OpenWindow));
        System.out.println(Cocoa.stay() + Cocoa.putOn(Shelf) + Shelf.checkNear(Stove) + Cocoa.checkInSight(Babka));
        Karlson.setFeel(Feelings.EXCITING);
        System.out.println(Karlson.screech());
        System.out.println(textOfCourse.addText() + Malish.know());
        System.out.println(Mom.knockedOut(Rugs, Balcony));
        System.out.println(Karlson.getIn(Balcony));
        System.out.println(Malish.stillDoNotUnderstand() + " " + Karlson.sighed());

        // ах, как же похорошела прога в 4 утра...
        try {
            Author pervash = new Author(args[0], Gender.UNKNOWN);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.exit(420);
        }
    }
}


