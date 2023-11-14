/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeantiguedades.ej2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author musimundo
 */
public class ListaDeAntiguedades {
    
    private Nodo inicio;
    private Nodo fin;

    public ListaDeAntiguedades(){
        inicio = null;
        fin = null;
    }

    public void insertarAlInicio(int antiguedad) {
        Nodo nuevoNodo = new Nodo(antiguedad);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio = nuevoNodo;
        }
    }

    public void insertarAlFinal(int antiguedad) {
        Nodo nuevoNodo = new Nodo(antiguedad);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public void eliminarNodoInicio() {
        if (inicio != null) {
            inicio = inicio.siguiente;
        }
    }

    public void eliminarNodoFinal() {
        if (inicio != null) {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                Nodo actual = inicio;
                while (actual.siguiente != fin) {
                    actual = actual.siguiente;
                }
                actual.siguiente = null;
                fin = actual;
            }
        }
    }

    public void mostrarContenido() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.print(actual.antiguedad + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
     public void mostrarOrdenado() {
        ArrayList<Integer> antiguedades = obtenerAntiguedades();
        Collections.sort(antiguedades); // Ordena la lista de antigüedades

        System.out.println("Lista ordenada de menor a mayor:");
        for (int antiguedad : antiguedades) {
            System.out.print(antiguedad + " -> ");
        }
        System.out.println("null");
    }
    
     public ArrayList<Integer> obtenerAntiguedades() {
        ArrayList<Integer> antiguedades = new ArrayList<>();
        Nodo actual = inicio;
        while (actual != null) {
            antiguedades.add(actual.antiguedad);
            actual = actual.siguiente;
        }
        return antiguedades;
    }
      public int calcularAntiguedadPromedio() {
        int totalAntiguedad = 0;
        Nodo actual = inicio;
        while (actual != null) {
            totalAntiguedad += actual.antiguedad;
            actual = actual.siguiente;
        }
        int cantidadEmpleados = contarNodos();
        if (cantidadEmpleados > 0) {
            return totalAntiguedad / cantidadEmpleados;
        } else {
            return 0;
        }
    }

    public int calcularSalarioEmpleadoMaxAntiguedad() {
        Nodo actual = inicio;
        int maxAntiguedad = 0;
        while (actual != null) {
            if (actual.antiguedad > maxAntiguedad) {
                maxAntiguedad = actual.antiguedad;
            }
            actual = actual.siguiente;
        }
        int salarioBase = 250000;
        int salarioAdicional = 0;
        if (maxAntiguedad > 10) {
            salarioAdicional = (maxAntiguedad - 10) * 5000;
        }
        if (maxAntiguedad > 20) {
            salarioAdicional += (maxAntiguedad - 20) * 10000;
        }
        return salarioBase + salarioAdicional;
    }
     public int contarNodos() {
        Nodo actual = inicio;
        int contador = 0;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
}

