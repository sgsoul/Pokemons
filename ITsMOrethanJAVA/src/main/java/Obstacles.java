public class Obstacles {
    public double x;
    public double y;

    public Obstacles() {
        this.x = Math.random()*100;
        this.y = Math.random()*100;
    }

    public Obstacles(double x,double y) {
        this.x = x;
        this.y = x;
    }

//    public Obstacles generator(){
//        x = Math.random()*100;
//        y = Math.random()*100;
//        Obstacles obst = new Obstacles(x,y);
//        return obst;
//    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }
}
