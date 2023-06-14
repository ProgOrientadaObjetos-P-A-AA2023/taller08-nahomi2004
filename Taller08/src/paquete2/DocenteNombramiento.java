/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente {
    private double valorSueldo;
    private double valorHorasEx;
    private int numHorasEx;
    private double sueldo;

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public void establecerValorSueldo(double a) {
        valorSueldo = a;
    }

    public double obtenerValorHorasEx() {
        return valorHorasEx;
    }

    public void establecerValorHorasEx(double a) {
        valorHorasEx = a;
    }

    public int obtenerNumHorasEx() {
        return numHorasEx;
    }

    public void establecerNumHorasEx(int a) {
        numHorasEx = a;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        sueldo = valorSueldo+(valorHorasEx*numHorasEx);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre Docente: %s\n"
                + "Cedula Docente: %s\n"
                + "Valor Sueldo: %.2f\n"
                + "Valor de horas extras: %.2f\n"
                + "Numero de horas extras: %d\n"
                + "Sueldo total: %.2f\n", 
                obtenerNombre(), 
                obtenerCedula(), 
                obtenerValorSueldo(), 
                obtenerValorHorasEx(), 
                obtenerNumHorasEx(), 
                obtenerSueldo());
        return cadena;
    }
}
