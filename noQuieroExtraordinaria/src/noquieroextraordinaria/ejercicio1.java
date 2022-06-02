/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package noquieroextraordinaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    // HOLA CRIS QUE TAL YO MAL. PUES MIRA, NO SE SI ME ESTOY ENTERANDO BIEN, SE QUE NO TE MOLA QUE REPITAMOS CODIGO
    // Y BASICAMENTE ESTOY HACIENDO LA MISMA FUNCION VARIAS VECES CON LAS DIFERENTES COLUMNAS DE COSAS QUE HACEN LOS
    // BOMBEROS. ESTOY NERVIOSA A MANTA, NO ME DA EL BODY PA MAS, SORRY TT_______TT
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION FUEGOS /////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_fuegos(ArrayList<String[]> listaSalidas) {
        double salidasFuegos[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;
        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[3]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasFuegos[0]) {
                salidasFuegos[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasFuegos[1]) {
                salidasFuegos[1] = leido;
            }

            salidasFuegos[3] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasFuegos[3] = salidasFuegos[3] / contador;

        return salidasFuegos;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION DANIOS EN CONSTRUCCION /////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_daniosEnConstruccion(ArrayList<String[]> listaSalidas) {
        double daniosEnConstruccion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[4]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > daniosEnConstruccion[0]) {
                daniosEnConstruccion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < daniosEnConstruccion[1]) {
                daniosEnConstruccion[1] = leido;
            }

            daniosEnConstruccion[4] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        daniosEnConstruccion[4] = daniosEnConstruccion[4] / contador;

        return daniosEnConstruccion;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SALVEMOS Y RESCATES /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_salvemosYrescates(ArrayList<String[]> listaSalidas) {
        double salvemosYrescates[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[5]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salvemosYrescates[0]) {
                salvemosYrescates[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salvemosYrescates[1]) {
                salvemosYrescates[1] = leido;
            }

            salvemosYrescates[5] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salvemosYrescates[5] = salvemosYrescates[5] / contador;

        return salvemosYrescates;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION DANIOS POR AGUA /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_daniosPorAgua(ArrayList<String[]> listaSalidas) {
        double daniosPorAgua[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[6]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > daniosPorAgua[0]) {
                daniosPorAgua[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < daniosPorAgua[1]) {
                daniosPorAgua[1] = leido;
            }

            daniosPorAgua[6] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        daniosPorAgua[6] = daniosPorAgua[6] / contador;

        return daniosPorAgua;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION INCIDENTES DIVERSOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_incidentesDiversos(ArrayList<String[]> listaSalidas) {
        double incidentesDiversos[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[7]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > incidentesDiversos[0]) {
                incidentesDiversos[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < incidentesDiversos[1]) {
                incidentesDiversos[1] = leido;
            }

            incidentesDiversos[7] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        incidentesDiversos[7] = incidentesDiversos[7] / contador;

        return incidentesDiversos;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SALIDAS SIN INTERVENCION /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_salidasSinIntervencion(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[8]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[8] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[8] = salidasSinIntervencion[8] / contador;

        return salidasSinIntervencion;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SERVICIOS VARIOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_serviciosVarios(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[9]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[9] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[9] = salidasSinIntervencion[9] / contador;

        return salidasSinIntervencion;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SERVICIOS VARIOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] menosSalidas_y_numSalidas_serviciosVarios(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        //Posiciones:  [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
        // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[9]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[9] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[9] = salidasSinIntervencion[9] / contador;

        return salidasSinIntervencion;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// M A I N /////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        // documento File con el que voy a trabajar en este ejercicio.
        File carpetaBomberos = new File("C:\\Users\\DAW\\Desktop\\recuProgramacion3erTrimestre\\noQuieroExtraordinaria\\src\\noquieroextraordinaria\\Bomberos");
        
        try {

            // hago array de tipo file para que me liste los documentos de la carpeta bomberos
            File[] nuevo = carpetaBomberos.listFiles();

            //for (int i = 0; i < nuevo.length; i++) { // inicio for 1
            for (File fichero : nuevo) { // inicio for 1

                Scanner lectorArchivo = new Scanner(fichero);

                ArrayList<String[]> listaDatos = new ArrayList<>();

                while (lectorArchivo.hasNext()) {
                    String[] entrada = lectorArchivo.nextLine().split(";");
                    // [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
                    // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total

                    listaDatos.add(entrada);
                }
                //Cierro el lector.
                lectorArchivo.close();

                double[] maximaFuegos, maximaDaniosEnConstruccion, maximaSalvemos_y_Rescates, maximaDaniosPorAgua, maximaIncidentesDiversos, maximaSalidasSinIntervencion, maximaServiciosVarios;

                maximaFuegos = masSalidas_y_numSalidas_daniosEnConstruccion(listaDatos);
                maximaDaniosEnConstruccion = masSalidas_y_numSalidas_daniosEnConstruccion(listaDatos);
                maximaSalvemos_y_Rescates = masSalidas_y_numSalidas_salvemosYrescates(listaDatos);
                maximaDaniosPorAgua = masSalidas_y_numSalidas_daniosPorAgua(listaDatos);
                maximaIncidentesDiversos = masSalidas_y_numSalidas_incidentesDiversos(listaDatos);
                maximaSalidasSinIntervencion = masSalidas_y_numSalidas_salidasSinIntervencion(listaDatos);
                maximaServiciosVarios = masSalidas_y_numSalidas_serviciosVarios(listaDatos);

                //Muestro todos los datos con formato de dos decimales
                System.out.println("mas salidas y numero de salidas:    " + ( maximaFuegos[0]) + "     " + (maximaFuegos[1]));

            } // fin for 1

        } catch (FileNotFoundException e) {

            //e.printStackTrace();
            System.err.println("No se ha encontrado el fichero");

        } catch (IOException e) {

            e.printStackTrace();

        } catch (Exception b) {
            System.out.println("Ha ocurrido un error");
        }

    } // fin main

} // fin class
