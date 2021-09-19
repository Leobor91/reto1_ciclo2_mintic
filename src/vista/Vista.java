package vista;

import java.util.Scanner;

public class Vista {

    Scanner leer = new Scanner(System.in);
    int opcion, consumo, estrato, valorUnidad;

    public void menuPrincipal() {
        System.out.println("PAGO DE SERVICIOS PUBLICOS");
        System.out.println("Seleccione el servicio publico:");
        System.out.println("1. Energia");
        System.out.println("2. Acueducto");
        System.out.println("3. Gas Natural");
        System.out.println("4. Salir");

    }

    public int escogerOpcion() {
        System.out.println("Opcion:");
        int opcion = leer.nextInt();
        return opcion;
    }

    public int ingresarConsumo() {
        System.out.println("Consumo del inmueble:");
        int consumo = leer.nextInt();
        return consumo;
    }

    public int ingresarEstrato() {
        System.out.println("Estrato del inmueble:");
        int estrato = leer.nextInt();
        return estrato;
    }

    public void escogerServicio(int opcion) {

        switch (opcion) {
            case 1:
                System.out.println("Pago de servicio de energía");
                break;
            case 2:
                System.out.println("Pago de servicio de acueducto");
                break;
            case 3:
                System.out.println("Pago de servicio de gas natural");
                break;
        }

    }

    public int escogerValorUnidad(int opcion) {
        int valorUnidad = 0;

        switch (opcion) {
            case 1:
                valorUnidad = 6200;
                break;
            case 2:
                valorUnidad = 9256;
                break;
            case 3:
                valorUnidad = 5234;
                break;
        }
        return valorUnidad;
    }

    public void mostrarIniciales(int consumo, int valorUnidad, int estrato, int opcion) {
        switch (opcion) {
            case 1:
            case 2:
                System.out.println("El consumo fue: " + consumo);
                System.out.println("Valor unidad: " + valorUnidad);
                System.out.println("Estrato del inmueble: " + estrato);
            case 3:
                System.out.println("El consumo fue: " + consumo);
                System.out.println("Valor unidad: " + (double) (valorUnidad));
                System.out.println("Estrato del inmueble: " + estrato);
        }
    }

    public void mostrarResultados(double costo, double estratificado, double impuesto, double totalPagar) {
        System.out.println("Costo total: " + costo);
        System.out.println("Descuento o sobrecosto: " + estratificado);
        System.out.println("Impuesto por infraestructura: " + impuesto);
        System.out.println("TOTAL A PAGAR: " + totalPagar);
        System.out.println("");
    }

    public void despedida() {
        System.out.println("Hasta pronto");
    }
}
