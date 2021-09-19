package modelo.entidades;

import modelo.procesos.Metodos;

public class Resultados {

    Metodos metodos = new Metodos();
    Servicios servicio = new Servicios();

    private double costo;
    private double impuesto;
    private double estratificado;
    private double totalPagar;

    public Resultados() {
    }

    public Resultados(double costo, double impuesto, double estratificado, double totalPagar) {
        this.costo = costo;
        this.impuesto = impuesto;
        this.estratificado = estratificado;
        this.totalPagar = totalPagar;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getEstratificado() {
        return estratificado;
    }

    public void setEstratificado(double estratificado) {
        this.estratificado = estratificado;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

}
