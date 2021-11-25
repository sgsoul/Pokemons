public class Human extends AHuman{

    Human (String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        if (gender.equals(Gender.FEMALE)){
            ending = "ла";
        }
        else ending = "л";
        //return ("Создан персонаж " + this.name + ".");
        this.place = null;
    }

    public String nod() {
        if (Feel == Feelings.PEACEFULLY) {
            return ('\n' + name + " миролюбиво кивнул" + this.gender.getGenderCase() + ".");
        } else {
            return ('\n' + name + " кивнул"  + this.gender.getGenderCase() + ".");
        }
    }

    public String look(Human h) {
        if (Feel == Feelings.SCARED) {
            return (name + " посмотрел" + this.gender.getGenderCase() + " c испугом на " + h.getName() + ".");
        } else {
            return (name + " посмотрел" + this.gender.getGenderCase() + " на " + h.getName() + ".");
        }
    }

    public String notUnderstand() {
        return "К тому же " + name + " не понимал" + this.gender.getGenderCase() + ", как ";
    }

    public String getFeel(){
        if (Feel == Feelings.NODESIRE) {
            return "У " + name + " не было никакой охоты" + " ";
        } else {
            return "У " + name;
        }
    }

    public String lookAgain(Human h) {
        return "снова увидеть " + h.getName() + "";
    }

    public String andBeatenBy(Human h) {
        return " и получить от " + h.getName() + ", чего доброго, еще пощечину.";
    }

    public String beAble(Human h) {
        return name + " и " + h.getName() + " смогут";
    }

    public String get(Objects o) {
        return " раздобыть " + o.getName() + ".";
    }

}