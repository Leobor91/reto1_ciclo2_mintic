package modelo.procesos;

import modelo.entidades.Resultados;
import util.Utilitario;

public class Metodos {

    public Resultados totalPagar(int consumo, int valorUnidad, int estrato) {

        double costo = 0, impuesto = 0, estratificado = 0, totalPagar = 0;
        if (estrato == 1 || estrato == 2) {
            costo = consumo * valorUnidad;
            impuesto = costo * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_IMPUESTO"));
            estratificado = costo  * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_DESCUENTO_ESTRATO_UNO_DOS"));
            totalPagar = costo + impuesto + estratificado;
        } else if (estrato == 3 || estrato == 4) {
            costo = consumo * valorUnidad;
            impuesto = costo * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_IMPUESTO"));
            estratificado = (costo * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_DESCUENTO_ESTRATO_TRES_CUATRO")));
            totalPagar = costo + impuesto + estratificado;
        } else if (estrato == 5 || estrato == 6) {
            costo = consumo * valorUnidad;
            impuesto = costo * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_IMPUESTO"));
            estratificado = costo * Double.valueOf(Utilitario.obtenerPropiedades("PORCENTAJE_SOBRE_COSTO"));
            totalPagar = costo + impuesto + estratificado;
        }

        return new Resultados(costo, impuesto, estratificado, totalPagar);
    }
}
