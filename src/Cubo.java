public class Cubo extends Cuadrado{
    double volumenCubo;



    double calcularVolumenCubo(){
        System.out.println("CUBO ");

        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);

        double l1= p1.calcularDistancia(p2);

        this.volumenCubo = Math.pow(l1,3);
        System.out.println("Volumen del cubo es:"+volumenCubo);
        return  volumenCubo;
    }
}
