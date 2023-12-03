package mesaDeTrabajo;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo("circulo pequeño", 3.2);
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo pequeño",2.2,5.2);
        Rectangulo rectangulo2 = new Rectangulo("Rectangulo mediano",7.5,10.2);
        Rectangulo rectangulo3 = new Rectangulo("Rectangulo grande",12.2,20.2);
        Triangulo triangulo1 = new Triangulo("Triangulo pequeño", 3,6);

        Locomotora locomotora = new Locomotora("Locomotora principal");
        Vagon vagon1 = new Vagon("vagon 1");
        Vagon vagon2 = new Vagon("vagon 2");

        circulo1.calcularArea();

        rectangulo1.calcularArea();
        rectangulo2.calcularArea();
        rectangulo3.calcularArea();

        triangulo1.calcularArea();

        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(rectangulo3);

        System.out.println("La superficie total del "+ vagon1.getTipoDeVehiculo() + " es : " + vagon1.calcularSuperficie());

        vagon2.agregarFigura(circulo1);
        vagon2.agregarFigura(circulo1);
        vagon2.agregarFigura(circulo1);
        vagon2.agregarFigura(rectangulo1);

        System.out.println("La superficie total del "+ vagon2.getTipoDeVehiculo() + " es : " + vagon2.calcularSuperficie());

        locomotora.agregarFigura(circulo1);
        locomotora.agregarFigura(circulo1);
        locomotora.agregarFigura(rectangulo3);
        locomotora.agregarFigura(triangulo1);

        System.out.println("La superficie total del "+ locomotora.getTipoDeVehiculo() + " es : " + locomotora.calcularSuperficie());













    }
}
