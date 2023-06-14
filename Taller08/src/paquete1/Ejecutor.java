/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.Scanner;
import paquete2.*;
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        boolean bandera=true;
        
        do {
            System.out.println("\nIngrese [1] para crear un Docente Nombramiento");
            System.out.println("Ingrese [2] para crear un Docente Factura\n");
            op = entrada.nextInt();
            
            if (op==1) {
                DocenteNombramiento docente = new DocenteNombramiento();
                Docente aux = ingresarNombre();                
                docente.establecerNombre(aux.obtenerNombre());
                docente.establecerCedula(aux.obtenerCedula());
                
                System.out.println("Ingrese el valor del sueldo:");
                double valorSueldo = entrada.nextDouble();
                docente.establecerValorSueldo(valorSueldo);
                System.out.println("Ingrese el numero de horas extras:");
                int numHorasEx = entrada.nextInt();
                docente.establecerNumHorasEx(numHorasEx);
                System.out.println("Ingrese el valor de las horas extras:");
                double valorHorasEx = entrada.nextInt();
                docente.establecerValorHorasEx(valorHorasEx);
                
                docente.calcularSueldo();
                
                System.out.printf("%s\n",docente);
            } else {
                if (op==2) {
                    DocenteFactura docente = new DocenteFactura();
                    Docente aux = ingresarNombre();                
                    docente.establecerNombre(aux.obtenerNombre());
                    docente.establecerCedula(aux.obtenerCedula());
                    
                    System.out.println("Ingrese el valor de la factura: ");
                    double valorFactura = entrada.nextInt();
                    System.out.println("Ingrese el valor del iva a descontar:");
                    double valorIva = entrada.nextDouble();
                    
                    docente.establecerNombre(aux.obtenerNombre());
                    docente.establecerCedula(aux.obtenerCedula());
                    docente.establecerValorFactura(valorFactura);
                    docente.calcularValorIva(valorIva);
                    docente.calcularValorFinal();
                    
                    System.out.printf("%s\n",docente);
                } else {
                    System.err.print("Error, opción no válida.\n");
                }
            }
            
            entrada.nextLine();
            System.out.println("Desea salir del proceso? Ingrese:  si");
            String salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
            
        } while (bandera);
    }
    
    
    
    public static Docente ingresarNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la cedula:");
        String cd = entrada.nextLine();
        
        Docente docente = new Docente();
        docente.establecerNombre(nombre);
        docente.establecerCedula(cd);
        
        return docente;
    }
}
