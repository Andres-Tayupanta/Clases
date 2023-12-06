import java.util.Scanner;

public class Triangulo extends Figura{

    public Triangulo() {
    }

    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("TRIANGULO ");
        for(int i=0;i<3;i++){
            System.out.println("INGRESE EL COMPONENTE DE X DEL PUNTO:"+i);
            double x = sc.nextDouble();
            System.out.println("INGRESE EL COMPONENTE DE Y DEL PUNTO:"+i);
            double y = sc.nextDouble();
            Punto punto =new Punto(x,y);
            this.listaPuntos.add(punto);
        }
    }

    double calcularPerimetro(){
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);
        Punto p3 =this.listaPuntos.get(2);


        double l1 = p1.calcularDistancia(p2);
        double l2 = this.calcularDistacia(p1,p3);
        double l3 = p2.calcularDistancia(p3);
        this.perimetro = l1+l2+l3;
        return  perimetro;

    }

    double calcularArea(){
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);
        Punto p3 =this.listaPuntos.get(2);

        double l1 = p1.calcularDistancia(p2);
        double l2 = this.calcularDistacia(p1,p3);
        double l3 = p2.calcularDistancia(p3);
        double s= (l1+l2+l3)/2;
        this.area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        return  area;
    }
    @Override
    public  void  imprimirPerimetro(String Figura) {
        System.out.println("El perimetro del " +Figura+ " es:"+ perimetro);
    }
    @Override

    public void  imprimirArea(String Figura) {
        System.out.println("El area del " +Figura+ " es:"+area);
    }
}
