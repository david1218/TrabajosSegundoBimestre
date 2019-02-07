package paquete_lineal_2;

// Ejemplo tomado del libro 
// D EITEL , P AUL J. Y H ARVEY M. D EITEL
// CÓMO PROGRAMAR EN J AVA . Séptima edición
// fines educativos
// Prueba de la clase ArchivoTexto.
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("datos.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public int[] leer_informacion() {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // System.out.println(linea);
                // ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                for (int i = 0; i < linea_partes.size(); i++) {
                    valores.add(Integer.parseInt(linea_partes.get(i)));
                }
                // System.out.println(linea_partes.get(0));

            } // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        
        return cambiar_ArrayList_to_Array(valores);
        

    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public int[] cambiar_ArrayList_to_Array(ArrayList<Integer> valores) {

        int[] arr = new int[valores.size()];

        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) != null) {
                arr[i] = valores.get(i);
            }
        }
        return arr;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto

