package mesaDeTrabajo;

public class Circulo extends Figura {

    private double radio;
    private double pi;

    public Circulo(String forma, double radio) {
        super(forma);
        this.radio = radio;
        this.pi = 3.1416;
    }

    @Override
    public double calcularArea() {
        double area = radio*radio*pi;
        return area;
    }
}
