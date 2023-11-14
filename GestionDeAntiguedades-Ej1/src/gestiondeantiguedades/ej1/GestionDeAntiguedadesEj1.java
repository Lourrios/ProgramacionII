/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeantiguedades.ej1;

import java.util.Scanner;

/**
 *
 * @author musimundo
 */
public class GestionDeAntiguedadesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        ListaAntiguedades lista = new ListaAntiguedades();

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("a. Insertar un nodo al inicio");
            System.out.println("b. Insertar un nodo al final");
            System.out.println("c. Mostrar el contenido de la lista");
            System.out.println("d. Eliminar un nodo del inicio");
            System.out.println("e. Eliminar un nodo del final");
            System.out.println("x. Salir");
            System.out.print("Elija una opción: ");

            String opcion = scanner.next();

            if (opcion.equals("a")) {
                System.out.print("Ingrese la antiguedad del empleado: ");
                int antiguedad = scanner.nextInt();
                lista.insertarAlInicio(antiguedad);
            } else if (opcion.equals("b")) {
                System.out.print("Ingrese la antiguedad del empleado: ");
                int antiguedad = scanner.nextInt();
                lista.insertarAlFinal(antiguedad);
            } else if (opcion.equals("c")) {
                System.out.println("Contenido de la lista:");
                lista.mostrarContenido();
            } else if (opcion.equals("d")) {
                lista.eliminarNodoInicio();
                System.out.println("Nodo del inicio eliminado.");
            } else if (opcion.equals("e")) {
                lista.eliminarNodoFinal();
                System.out.println("Nodo del final eliminado.");
            } else if (opcion.equals("x")) {
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
        
        
    }
    
    
