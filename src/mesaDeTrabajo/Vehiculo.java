package mesaDeTrabajo;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {

    private List<Figura> eslabonTren = new ArrayList<>();
    private String tipoDeVehiculo;

    private double superficieTotal;

    public Vehiculo(String tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

    public  void  agregarFigura (Figura figura) {
        eslabonTren.add(figura);
    }

    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public double calcularSuperficie() {
        for (Figura figura : eslabonTren) superficieTotal += figura.calcularArea();
        return superficieTotal;
    }


}
