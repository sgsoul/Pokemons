import java.util.Scanner;

public class Buns extends Objects{
    protected float count;

    Buns(String name) {
        super(name);
    }

    public class NumException extends Exception {
    }
    public void lie(Place place) {
        System.out.println('\n' + "Введите количество плюшек на крыльце у Карлсона:");
        Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(sc.next());
            if (x == 0 || x < 0) {
                try {
                    throw new NumException();
                } catch (NumException e) {
                    System.out.println("Пожалуйста, введите положительное число плюшек.");
                    this.lie(place);
                }
            } else {
                count = x;
                System.out.println("Наверху на " + place.getName() + " рядком лежали " + x + " " + getName());
            }
        } catch (NumberFormatException e) {
            System.out.println("число блять введи");
            this.lie(place);
        }
    }

    public String looks() {
        return getName() + " выглядели очень аппетитно";
    }

    public float number() {
        return (count + 4)/2;
    }

    public float number2() {
        return count/2;
    }

    public float getCount() {
        return count;
    }

    public float numberAll() {
        return (count + 4);
    }

    public String put(Human human) {
        return human.getName() + " положил к себе в горку " + (count + 4)/2 + " " + getName();
    }

    public String foldedUp(Human human) {
        return "В ответ " + human.getName() + " поспешно сложил к себе в горку " + (count + 4)/2 + " " + getName();
    }
}
