public class Punto {
    private double x,y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double calcularDistancia(Punto punto2){
        double dist;
        dist = Math.sqrt(Math.pow(this.x-punto2.getX(),2)+Math.pow(this.y-punto2.getY(),2));
        return dist;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
