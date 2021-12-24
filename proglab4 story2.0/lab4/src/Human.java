public class Human extends AHuman{

    Human (String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if (gender.equals(Gender.FEMALE)){
            ending = "ла";
        }
        else ending = "л";
        this.place = null;
    }

    public String nod() {
        if (feel == Feelings.PEACEFULLY) {
            return (name + " миролюбиво кивнул" + this.gender.getGenderCase() + ".");
        } else {
            return (name + " кивнул"  + this.gender.getGenderCase() + ".");
        }
    }

    public String look(Human human) {
        if (feel == Feelings.SCARED) {
            return (name + " посмотрел" + this.gender.getGenderCase() + " c испугом на " + human.getName() + ".");
        } if (feel == Feelings.REPROACH) {
            return (name + " укоризненно посмотрел" + this.gender.getGenderCase() + " на " + human.getName() + ".");
        } else {
            return (name + " посмотрел" + this.gender.getGenderCase() + " на " + human.getName() + ".");
        }
    }

    public class Mother {
        public String knockedOut(Objects objects, Place place){
            return "Мама частенько выбивала " + objects.getName() + " на " + place.getName() + ", потому что ей было нечего делать, точно так же как и автору лабы который 2 недели пытался разобраться как писать 4 лабу, а когда все понял оставалось меньше суток до защиты";
        }
    }

    public String notUnderstand() {
        return "К тому же " + name + " не понимал" + this.gender.getGenderCase() + ", как ";
    }

    public String getFeel(){
        if (feel == Feelings.NODESIRE) {
            return "У " + name + " не было никакой охоты" + " ";
        } else {
            return "У " + name;
        }
    }

    public String lookAgain(Human human) {
        return "снова увидеть " + human.getName() + "";
    }

    public String andBeatenBy() {
        return hit.get();
    }
    Hit hit = new Hit();
    class Hit{
        protected String name = "Пощёчина";
        public String get(){
            return " и получить от " + Human.this.getName()  + ", чего доброго, еще пощечину.";
        }
    }

    public String beAble(Human human) {
        return name + " и " + human.getName() + " смогут";
    }

    public String get(Objects objects) {
        return " раздобыть " + objects.getName() + ".";
    }

    public String give(Objects objects) {
        return  name + " дал" + gender.getGenderCase() + objects.getName();
    }

    public String noObjected() {
        return name + " не возвржал" + gender.getGenderCase() + ".";
    }

    public String disappear(Objects objects) {
        return "как " + name + " исчез в " + objects.getName();
    }

    public String shouted() {
        return  name + " крикнул" + gender.getGenderCase();
    }

    public String grab(Human human) {
        return name + " обхватил" + gender.getGenderCase() + " " + human.getName() + ".";
    }

    public String objected() {
        return getName() + " возразил" + gender.getGenderCase();
    }

    public String getIn(Place place) {
        class Stairs {
            private String name;
            Stairs(String name) {
                this.name = name;
            }
             public String getName() {
                return name;
             }
        }
        Stairs lol = new Stairs("лестницы черного хода");
        return "Попасть на " + place.getName() + " можно было только с " + lol.getName();
    }

    public String screech() {
        if (feel == Feelings.EXCITING) {
            return getName() + " завизжал" + gender.getGenderCase() + " от восторга";
        } if (feel == Feelings.SCARED) {
            return getName() + " завизжал" + gender.getGenderCase() + " от ужаса";
        } else {
            return getName() + " завизжал" + gender.getGenderCase();
        }
    }

    public String know() {
        return getName() + " это знал" + gender.getGenderCase() + ".";
    }

    public String stillDoNotUnderstand() {
        return getName() + " все ещё не понимал" + gender.getGenderCase() + ".";
    }

    public String sighed() {
        return getName() + " вздохнул" + gender.getGenderCase() + ".";
    }

}