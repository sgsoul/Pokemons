public class Robot {
    public String name;
    public double x;
    public double y;
    public int speed;

    public Robot(String name, double x, double y, int speed) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public Robot(String name) {
        this.name = name;
        x = 0;
        y = 0;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
