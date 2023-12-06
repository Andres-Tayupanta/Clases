import java.util.Scanner;

public class Piramide extends Triangulo {


    double calcularVolumenPi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LA ALTURA DE LA PIRAMIDE:");
        double altura = sc.nextDouble();
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        double l1= p1.calcularDistancia(p2);
        double areaBase = Math.pow(l1,2);

        double volumen = (areaBase*altura)/3;
        System.out.println("Volumen Piramide:"+volumen);
        return  volumen;
    }

}