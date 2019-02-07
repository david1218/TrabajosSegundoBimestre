package paquete_lineal_2;

// Fig 16.3.: PruebaBusquedaLineal.java
// Busca un elemento en el arreglo, en forma secuencial.
import java.util.Scanner;

public class PruebaBusquedaLineal {

    public static void main(String args[]) {
        // crea objeto Scanner para los datos de entrada
        Scanner entrada = new Scanner(System.in);

        int enteroBusqueda = 10; // clave de b�squeda
        int posicion; // ubicaci�n de la clave de b�squeda en el arreglo
        
        LeerArchivoTexto l = new LeerArchivoTexto();
        l.abrirArchivo();
        int[] valores = l.leer_informacion();
        // crea el arreglo y lo muestra en pantalla
        ArregloLineal arregloBusqueda = new ArregloLineal(valores);
        System.out.println(arregloBusqueda); // imprime el arreglo

        posicion = arregloBusqueda.busquedaLineal(enteroBusqueda);

        if (posicion == -1) // no se encontr� el entero
        {
            System.out.println("El entero " + enteroBusqueda
                    + " no se encontro.\n");
        } else // se encontr� el entero
        {
            System.out.println("El entero " + enteroBusqueda
                    + " se encontro en la posicion " + posicion + ".\n");
        }

    } // fin de main
} // fin de la clase PruebaBusquedaLineal

/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 ************************************************************************
 */
