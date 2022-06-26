import java.awt.*;

public class Stepan {
    Robot robot = new Robot("Стёпа");
    Obstacles obst;

    public String moveTo(float x, float y){
        robot.setX(x);
        robot.setY(y);
        return "current x:" + x + " , current y:" + y + ".";
    }

    public String moveOn(float x, float y){
        double prevX = robot.getX();
        double prevY = robot.getY();
        double curX = x + prevX;
        double curY = y + prevY;
        robot.setX(curX);
        robot.setY(curY);
        return "current x:" + curX + " , current y:" + curY + ".";
    }

    public String speedUp(int s){
        int prevS = robot.getSpeed();
        int curS = s + prevS;
        robot.setSpeed(curS);
        return "current speed:" + curS;
    }

    public String speedDown(int s){
        int prevS = robot.getSpeed();
        int curS = s - prevS;
        robot.setSpeed(curS);
        return "current speed:" + curS;
    }

    public String  stop(){
        robot.setSpeed(0);
        return "stepa stopped";
    }

    public boolean checkObstByX(Obstacles obst){
        double x = obst.getX();
        double curX = robot.getX();
        return !(x - curX == 1);
    }

    public boolean checkObstByY(Obstacles obst){
        double y = obst.getY();
        double curY = robot.getY();
        return !(y - curY == 1);
    }

    public void run(Obstacles obst) {
        double x = obst.getX();
        double curX = robot.getX();
        double y = obst.getY();
        double curY = robot.getY();
        double dist = Math.sqrt(Math.pow((x - curX), 2) + Math.pow((y - curY), 2));
        if (dist > 1.1) {
            robot.setX(curX + 1);
            robot.setY(curY + 1);
        } else {
            robot.setX(curX - 2);
            robot.setY(curY - 1);
        }
    };

}

