/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeantiguedades.ej1;

/**
 *
 * @author musimundo
 */
public class ListaAntiguedades {
       private Nodo inicio;
    private Nodo fin;

    public ListaAntiguedades() {
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
}
