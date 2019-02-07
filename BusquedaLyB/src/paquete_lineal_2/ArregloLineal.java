package paquete_lineal_2;

// Fig 16.2: ArregloLineal.java
// Clase que contiene un arreglo de enteros aleatorios y un m�todo 
// que busca en ese arreglo, en forma secuencial.
import java.util.Arrays;
import java.util.Random;

public class ArregloLineal {

    private int[] datos; // arreglo de valores

    // crea un arreglo de un tama�o dado, y lo rellena con enteros aleatorios
    public ArregloLineal(int[] valores) {
        datos = valores; // crea un espacio para el arreglo

        // para el caso de búsqueda binaría, usar
        // Arrays.sort(datos);
    } // fin del constructor de ArregloLineal

    // realiza una b�squeda lineal en los datos
    public int busquedaLineal(int claveBusqueda) {
        // itera a trav�s del arreglo en forma secuencial
        int indice=0;
        while (indice<datos.length) {
            if (datos[indice] == claveBusqueda) return indice; // devuelve el �ndice del entero
            else indice+=1;  
        }

    /*    for (int indice = 0; indice < datos.length; indice++) {
            if (datos[indice] == claveBusqueda) {
                return indice; // devuelve el �ndice del entero
            }
        */
        return -1; // no se encontr� el entero
    } // fin del m�todo busquedaLineal

    // m�todo para imprimir los valores del arreglo
    @Override
    public String toString() {
        String temporal = "";

        // itera a trav�s del arreglo
        for (int elemento : datos) {
            temporal = String.format("%s %s", temporal, elemento);
        }
        temporal = String.format("%s %s", temporal, "\n");

        return temporal;
    } // fin del m�todo toString
} // fin de la clase ArregloLineal


/**************************************************************************
 * Tomado de:
 * 
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *************************************************************************/
