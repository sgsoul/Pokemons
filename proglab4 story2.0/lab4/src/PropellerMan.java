import java.util.Scanner;

public class PropellerMan extends Human {
    PropellerMan(String name, Gender gender) {
        super(name, gender);
    }

    private enum Button {
        OFF,
        ON;
    }

    protected Button typeButton = Button.OFF;

    public void pushButton() {
        System.out.println("Карслон хочет нажать кнопку чтобы взлететь. Поможем ему? да или нет?");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        try {
            if (a.equals("да") || a.equals("Да") || a.equals("yes") || a.equals("Yes") || a.equals("ага") || a.equals("конечно") || a.equals("пизда")) {
                typeButton = Button.ON;
                System.out.println(name + " нажал" + gender.getGenderCase() + " кнопkу! успех!");
            } else {
                for (int i = 0; i < a.length(); i++) {
                    if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'а' && a.charAt(i) <= 'я') || (a.charAt(i) >= 'А' && a.charAt(i) <= 'Я')) {

                    } else {
                        throw new ArgException("Ваш ответ не должен содержать цифры и иные посторонние символы, только буквы.");
                    }
                }
                typeButton = Button.ON;
                System.out.println(name + " нажал" + gender.getGenderCase() + " кнoпky cам" + gender.getGenderCase() + ", ты не смог помочь Карлсону! >:(");
            }
        } catch (ArgException e) {
            System.out.println(e.getMessage());
            this.pushButton();
        }
    }

    public String fly(Human human) {
        if (typeButton == Button.ON) {
            return (getName() + " стрелой взыл с " + human.getName() + " ввысь");
        } else {
            return getName() + " не может взлететь, так как кнопка не нажата!";
        }
    }

    public String boast() {
        return getName() + " похвастался";
    }


}

