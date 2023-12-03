package mesaDeTrabajo;

public class Rectangulo extends Figura {

    private double altura;
    private double largo;

    public Rectangulo(String forma, double altura, double largo) {
        super(forma);
        this.altura = altura;
        this.largo = largo;
    }
    @Override
    public double calcularArea(){
        return altura * largo;
    }
}
