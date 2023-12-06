import java.util.Scanner;

public class Paralelepipedo extends Rectangulo{

    double calcularVolumen(){

        Scanner sc = new Scanner(System.in);
        System.out.println("PARALELEPIPEDO ");
        System.out.println("INGRESE LA ALTURA DE LA FIGURA:");
        double altura = sc.nextDouble();
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);
        Punto p3 =this.listaPuntos.get(2);

        double l1= p1.calcularDistancia(p2);
        double l2 = this.calcularDistacia(p1,p3);

        this.area = l1*l2;

        double volumen = area*altura;
        System.out.println("Volumen:"+volumen);

        return  volumen;
    }
}