import java.util.Scanner;

public class Circulo extends Figura{
    public Circulo() {
    }
    void ingresarPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("CIRCULO ");
        for(int i=0;i<2;i++){
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

        double r = p1.calcularDistancia(p2);
        this.perimetro =2*r*Math.PI;
        return r ;

    }

    double calcularArea(){
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);

        double r = p1.calcularDistancia(p2);

        this.area = Math.PI*(Math.pow(r,2));
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
