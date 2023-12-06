public class Esfera extends Circulo{


    double volumenEsfera;
    double calcularVolumenEsfera(){
        System.out.println("ESFERA ");
        Punto p1 =this.listaPuntos.get(0);
        Punto p2 =this.listaPuntos.get(1);

        double r = p1.calcularDistancia(p2);

        this.volumenEsfera = ((double) 4 /3)*Math.PI*(Math.pow(r,3));
        System.out.println("Volumen Esfera:"+volumenEsfera);
        return  volumenEsfera;
    }
}
