package javaapplication104;

import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * 
 */
public class ArregloBinario {

    private int[] datos;

    // crea un arreglo de un tama�o dado y lo llena con enteros aleatorios
    public ArregloBinario(int[] losdatos) {
        agregarDatos(losdatos);
    } // fin del constructor de ArregloBinario

    public void agregarDatos(int[] losdatos) {
        datos = losdatos;
        Arrays.sort(datos);
    }

    // realiza una b�squeda binaria en los datos
    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0; // extremo inferior del �rea de b�squeda
        int superior = datos.length - 1; // extremo superior del �rea de b�squeda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontr�

        do // ciclo para buscar un elemento
        {
            // si el elemento se encuentra en medio
            if (elementoBusqueda == datos[medio]) {
                ubicacion = medio; // la ubicaci�n es el elemento medio actual
            } // el elemento medio es demasiado alto
            else if (elementoBusqueda < datos[medio]) {
                superior = medio - 1; // elimina la mitad superior
            } else // el elemento medio es demasiado bajo
            {
                inferior = medio + 1; // elimina la mitad inferior
            }
            medio = (inferior + superior + 1) / 2; // recalcula el elemento medio
            // System.out.println("medio ..." + medio);
        } while ((inferior <= superior) && (ubicacion == -1));

        return ubicacion; // devuelve la ubicaci�n de la clave de b�squeda
    } // fin del m�todo busquedaBinaria

    // m�todo para imprimir los valores en el arreglo
    public String toString() {
        String temporal = "";

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal = String.format("%s %s", temporal, elemento);
        }
        temporal = String.format("%s %s", temporal, "\n");

        return temporal;
    } // fin del m�todo toString   
} // fin de la clase ArregloBinario

