/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeantiguedades.ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author musimundo
 */
public class GestionDeAntiguedadesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ListaDeAntiguedades lista = new ListaDeAntiguedades();

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("a. Insertar un nodo al inicio");
            System.out.println("b. Insertar un nodo al final");
            System.out.println("c. Mostrar el contenido de la lista");
            System.out.println("d. Eliminar un nodo del inicio");
            System.out.println("e. Eliminar un nodo del final");
            System.out.println("f. Mostrar la lista ordenada de menor a mayor");
            System.out.println("g. Mostrar la cantidad de empleados con antigüedad superior a 10 años");
            System.out.println("h. Calcular la antigüedad promedio de los empleados");
            System.out.println("i. Calcular el salario del empleado con más antiguedad");
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
            } else if (opcion.equals("f")) {
                lista.mostrarOrdenado();
            } else if (opcion.equals("g")) {
                int cantidadEmpleadosSuperiorA10Anios = contarAntiguedadesSuperioresA(lista, 10);
                System.out.println("Cantidad de empleados con antigüedad superior a 10 años: " + cantidadEmpleadosSuperiorA10Anios);
            } else if (opcion.equals("h")) {
                int antiguedadPromedio = lista.calcularAntiguedadPromedio();
                System.out.println("Antigüedad promedio de los empleados: " + antiguedadPromedio + " años");
            } else if (opcion.equals("i")) {
                int salarioEmpleadoMaxAntiguedad = lista.calcularSalarioEmpleadoMaxAntiguedad();
                System.out.println("Salario del empleado con más antigüedad: $" + salarioEmpleadoMaxAntiguedad);
            } else if (opcion.equals("x")) {
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static int contarAntiguedadesSuperioresA(ListaDeAntiguedades lista, int valor) {
        ArrayList<Integer> antiguedades = lista.obtenerAntiguedades();
        int contador = 0;
        for (int antiguedad : antiguedades) {
            if (antiguedad > valor) {
                contador++;
            }
        }
        return contador;
    }
}
