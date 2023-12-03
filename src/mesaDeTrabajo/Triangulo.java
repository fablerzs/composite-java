package mesaDeTrabajo;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(String forma, double base, double altura) {
        super(forma);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
}
