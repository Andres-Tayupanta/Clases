import java.util.ArrayList;
import java.util.List;

    public abstract class Figura {

        double area, perimetro;

        public List<Punto> listaPuntos = new ArrayList<>();

        public Figura() {

        }

        public Figura(double area, double perimetro, List<Punto> listaPuntos) {
            this.area = area;
            this.perimetro = perimetro;
            this.listaPuntos = listaPuntos;
        }



        double calcularDistacia(Punto punto1, Punto punto2){
            double dist;
            dist = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2)+Math.pow(punto1.getX()- punto2.getY(),2));
            return dist;
        }

        public abstract void  imprimirPerimetro(String Figura);
        //System.out.println("El perimetro del " +Figura+ " es:"+ perimetro);

        public abstract void  imprimirArea(String Figura);
        //System.out.println("El area del " +Figura+ " es:"+area);



        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }

        public double getPerimetro() {
            return perimetro;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }

        public List<Punto> getListaPuntos() {
            return listaPuntos;
        }

        public void setListaPuntos(List<Punto> listaPuntos) {
            this.listaPuntos = listaPuntos;
        }


    }


