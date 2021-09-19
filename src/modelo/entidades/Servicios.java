package modelo.entidades;

public class Servicios {

    private int consumo;
    private int estrato;
    private int valorUnidad;
    private int opcion;

    public Servicios() {
    }

    public Servicios(int valorUnidad, int consumo, int estrato, int opcion) {
        this.consumo = consumo;
        this.estrato = estrato;
        this.valorUnidad = valorUnidad;
        this.opcion = opcion;

    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Servicios{consumo=").append(consumo);
        sb.append(", estrato=").append(estrato);
        sb.append(", valorUnidad=").append(valorUnidad);
        sb.append(", opcion=").append(opcion);
        sb.append('}');
        return sb.toString();
    }

}
