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
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    // POS SI QUE VOY A LA EXTRAORDINARIA ACHO
    /*
    
        ..8888888..     ..8888888..
      .8:::::::::::8. .8:::::::::::8.
    .8:::::::::::::::8:::::::::::::::8.
   .8:::::::::::::::::::::::::::::::::8.
   8::::::  ::::' ':::' '::::  :  :::::8
   8::::::  :::     '     :::  :  :::::8
   8::::::  :::           :::  :  :::::8
   '8:::::  ::::.       .::::  :  ::::8'
    '8::::  ::::::.   .::::::  :  :::8'
     '8:::  ::::::::.::::::::.   .::8'
       '8:::::::::::::::::::::::::8'
         '8:::::::::::::::::::::8'
           '8:::::::::::::::::8'
              '8:::::::::::8'
                 '8:::::8'
                    '8'
     */
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION FUEGOS /////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_fuegos(ArrayList<String[]> listaSalidas) {
        double salidasFuegos[] = {0, 0, 0};
        listaSalidas.get(3);
        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;
        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasFuegos[0]) {
                salidasFuegos[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasFuegos[1]) {
                salidasFuegos[1] = leido;
            }

            salidasFuegos[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasFuegos[2] = salidasFuegos[2] / contador;
        return salidasFuegos;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION DANIOS EN CONSTRUCCION /////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_daniosEnConstruccion(ArrayList<String[]> listaSalidas) {
        double daniosEnConstruccion[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > daniosEnConstruccion[0]) {
                daniosEnConstruccion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < daniosEnConstruccion[1]) {
                daniosEnConstruccion[1] = leido;
            }

            daniosEnConstruccion[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        daniosEnConstruccion[2] = daniosEnConstruccion[2] / contador;

        return daniosEnConstruccion;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SALVEMOS Y RESCATES /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_salvemosYrescates(ArrayList<String[]> listaSalidas) {
        double salvemosYrescates[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salvemosYrescates[0]) {
                salvemosYrescates[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salvemosYrescates[1]) {
                salvemosYrescates[1] = leido;
            }

            salvemosYrescates[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salvemosYrescates[2] = salvemosYrescates[2] / contador;

        return salvemosYrescates;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION DANIOS POR AGUA /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_daniosPorAgua(ArrayList<String[]> listaSalidas) {
        double daniosPorAgua[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > daniosPorAgua[0]) {
                daniosPorAgua[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < daniosPorAgua[1]) {
                daniosPorAgua[1] = leido;
            }

            daniosPorAgua[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        daniosPorAgua[2] = daniosPorAgua[2] / contador;

        return daniosPorAgua;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION INCIDENTES DIVERSOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_incidentesDiversos(ArrayList<String[]> listaSalidas) {
        double incidentesDiversos[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > incidentesDiversos[0]) {
                incidentesDiversos[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < incidentesDiversos[1]) {
                incidentesDiversos[1] = leido;
            }

            incidentesDiversos[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        incidentesDiversos[2] = incidentesDiversos[2] / contador;

        return incidentesDiversos;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SALIDAS SIN INTERVENCION /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_salidasSinIntervencion(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[2] = salidasSinIntervencion[2] / contador;

        return salidasSinIntervencion;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SERVICIOS VARIOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] masSalidas_y_numSalidas_serviciosVarios(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[2] = salidasSinIntervencion[2] / contador;

        return salidasSinIntervencion;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// FUNCION SERVICIOS VARIOS /////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static double[] menosSalidas_y_numSalidas_serviciosVarios(ArrayList<String[]> listaSalidas) {
        double salidasSinIntervencion[] = {0, 0, 0};

        //Guardo los valores en un array para tener que recorrer la lista 1 vez
        int contador = 0;

        for (String[] entrada : listaSalidas) {
            //Paso la posición del total de salidas a double para poder compararla
            double leido = Double.parseDouble(entrada[2]);

            //  si es mayor que la que tengo guardada sobreescribo
            if (leido > salidasSinIntervencion[0]) {
                salidasSinIntervencion[0] = leido;
            }

            // si es menor que la que tengo guardada sobreescribo
            if (leido < salidasSinIntervencion[1]) {
                salidasSinIntervencion[1] = leido;
            }

            salidasSinIntervencion[2] += leido;
            contador++;
        }
        //Una vez acabado el bucle hago la media
        salidasSinIntervencion[2] = salidasSinIntervencion[2] / contador;

        return salidasSinIntervencion;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////// M A I N /////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        // documento File con el que voy a trabajar en este ejercicio.
        File carpetaBomberos = new File("C:\\Users\\DAW\\Desktop\\recuProgramacion3erTrimestre\\noQuieroExtraordinaria\\src\\noquieroextraordinaria\\Bomberos");

        File prueba = new File("C:\\Users\\DAW\\Desktop\\recuProgramacion3erTrimestre\\noQuieroExtraordinaria\\src\\noquieroextraordinaria\\Bomberos\\2021.csv");
        try {

            // hago array de tipo file para que me liste los documentos de la carpeta bomberos
            File[] nuevo = carpetaBomberos.listFiles();
//            Scanner leer = new Scanner(prueba);
//            leer.useDelimiter(";");
//
            ArrayList<String[]> listaDatos2 = new ArrayList<>();
//
//            while (leer.hasNext()) {
//                String[] entrada2 = leer.nextLine().split(";");
//                // [0] = año, [1] = mes, [2] = distrito, [3] = fuegos, [4] = daños en construccion, [5] = salvemos y rescates
//                // [6] = daños por agua, [7] = incidentes diversos, [8] = salidas sin intervencion, [9] = servicios varios, [10] = total
//
//                listaDatos2.add(entrada2);
//            }
            try ( BufferedReader br = new BufferedReader(new FileReader(prueba.getAbsolutePath()))) {
                String line;
                List<String> list = new LinkedList<>();
                while ((line = br.readLine()) != null) {
                    listaDatos2.add(line.split(";"));
                }
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            //for (int i = 0; i < nuevo.length; i++) { // inicio for 1
            for (File fichero : nuevo) { // inicio for 1

                Scanner lectorArchivo = new Scanner(fichero);
                lectorArchivo.useDelimiter(";");
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

                // los fuegos están en la posicion 3 del array:
                listaDatos.get(3);

                maximaFuegos = masSalidas_y_numSalidas_fuegos(listaDatos);

                // los danios en construccion están en la posicion 4 del array:
                listaDatos.get(4);
                maximaDaniosEnConstruccion = masSalidas_y_numSalidas_daniosEnConstruccion(listaDatos);

                // salvemos y rescates están en la posicion 5 del array:
                maximaSalvemos_y_Rescates = masSalidas_y_numSalidas_salvemosYrescates(listaDatos);
                listaDatos.get(5);

                // los danios por agua están en la posicion 6 del array:
                maximaDaniosPorAgua = masSalidas_y_numSalidas_daniosPorAgua(listaDatos);
                listaDatos.get(6);

                maximaIncidentesDiversos = masSalidas_y_numSalidas_incidentesDiversos(listaDatos);
                maximaSalidasSinIntervencion = masSalidas_y_numSalidas_salidasSinIntervencion(listaDatos);
                maximaServiciosVarios = masSalidas_y_numSalidas_serviciosVarios(listaDatos);

                // cuando runeo el programa me muestra 3 veces lo mismo, porque tengo puesto 3 sout y en realiadad en las funciones no determino la posición
                // pero es que llevo un buen rato y nada 
                //Muestro todos los datos con formato de dos decimales
                System.out.println("mas salidas y numero de salidas de fuegos:    " + (maximaFuegos[0]) + "     " + (maximaFuegos[1]));
                System.out.println("mas salidas y numero de danios en construccion:    " + (maximaDaniosEnConstruccion[0]) + "     " + (maximaDaniosEnConstruccion[1]));
                System.out.println("mas salidas y numero de salvemos y rescates:    " + (maximaSalvemos_y_Rescates[0]) + "     " + (maximaSalvemos_y_Rescates[1]));

                HashMap<String, Integer> hashMapDistrito_Intervenciones = new HashMap<String, Integer>();

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
