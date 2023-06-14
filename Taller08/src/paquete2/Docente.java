/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Docente {
    protected String nombre;
    protected String cedula;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String a) {
        cedula = a;
    }
}
