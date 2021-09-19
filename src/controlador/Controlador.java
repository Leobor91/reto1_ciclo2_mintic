package controlador;

import modelo.entidades.Resultados;
import modelo.entidades.Servicios;
import modelo.procesos.Metodos;
import vista.Vista;

public class Controlador {

    Servicios servicio = new Servicios();
    Metodos metodos = new Metodos();
    Vista vista = new Vista();
    Resultados resultado = new Resultados();

    public Controlador() {
    }

    public void iniciar() {

        vista.menuPrincipal();
        servicio.setOpcion(vista.escogerOpcion());
        while (servicio.getOpcion() != 4) {
            vista.escogerServicio(servicio.getOpcion());
            servicio.setEstrato(vista.ingresarEstrato());
            servicio.setConsumo(vista.ingresarConsumo());
            servicio.setValorUnidad(vista.escogerValorUnidad(servicio.getOpcion()));
            vista.mostrarIniciales(servicio.getConsumo(), servicio.getValorUnidad(), servicio.getEstrato(), servicio.getOpcion());
            resultado = metodos.totalPagar(servicio.getConsumo(), servicio.getValorUnidad(), servicio.getEstrato());
            vista.mostrarResultados(resultado.getCosto(), resultado.getEstratificado(), resultado.getImpuesto(), resultado.getTotalPagar());
            vista.menuPrincipal();
            servicio.setOpcion(vista.escogerOpcion());
        }
        vista.despedida();
    }

}
