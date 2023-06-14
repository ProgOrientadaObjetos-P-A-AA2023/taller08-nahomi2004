/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente {
    private double valorFactura;
    private double valorIva;
    private double valorFinal;

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public void establecerValorFactura(double a) {
        valorFactura = a;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public void calcularValorIva(double a) {
        valorIva=a/100;
    }

    public double obtenerValorFinal() {
        return valorFinal;
    }

    public void calcularValorFinal() {
        valorFinal = valorFactura-(valorFactura*valorIva);
    }    
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre Docente: %s\n"
                + "Cedula Docente: %s\n"
                + "Valor Factura: %.2f\n"
                + "Valor iva: %.2f\n"
                + "Valor final: %.2f\n", 
                obtenerNombre(), 
                obtenerCedula(), 
                obtenerValorFactura(), 
                obtenerValorIva(), 
                obtenerValorFinal());
        return cadena;
    }
}
