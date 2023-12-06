public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.ingresarPuntos();
        double areaC1 = c1.calcularArea();
        double perimetroC1 = c1.calcularPerimetro();
        c1.imprimirArea("Cirdulo:");
        c1.imprimirPerimetro("Circulo:");

        Rectangulo rec1 = new Rectangulo();
        rec1.ingresarPuntos();
        double areaRec = rec1.calcularArea();
        double perimetroRec = rec1.calcularPerimetro();
        rec1.imprimirArea("Rectangulo:");
        rec1.imprimirPerimetro("Rectangulo:");

        Triangulo T1 = new Triangulo();
        T1.ingresarPuntos();
        double areaT1 = T1.calcularArea();
        double perimetroT1 = T1.calcularPerimetro();
        T1.imprimirArea("Triangulo:");
        T1.imprimirPerimetro("Triangulo:");

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.ingresarPuntos();
        double areaCuadrado = cuadrado.calcularArea();
        double perimetroCuadrado = cuadrado.calcularPerimetro();
        cuadrado.imprimirArea("Cuadrado");
        cuadrado.imprimirPerimetro("Cuadrado");

        Cubo cubo = new Cubo();
        cubo.ingresarPuntos();
        double volumenCubo = cubo.calcularVolumenCubo();


        Esfera esfera1 = new Esfera();
        esfera1.ingresarPuntos();
        double volumenEsfera =esfera1.calcularVolumenEsfera();


        Paralelepipedo P1 =new Paralelepipedo();
        P1.ingresarPuntos();
        double volumenP1 = P1.calcularVolumen();


        Piramide piramide1 = new Piramide();
        piramide1.ingresarPuntos();
        double volumenPiramide = piramide1.calcularVolumenPi();

    }
}