package com.duoc.semana6.ui;

import com.duoc.semana6.data.GestorServicios;
import com.duoc.semana6.model.ServicioTuristico;

import java.util.List;

/**
 * Clase principal del programa. Se encarga de ejecutar la
 * aplicacion y mostrar por consola los servicios turisticos
 * de prueba creados por GestorServicios.
 *
 * @author Satcha Quispe
 */
public class Main {

    public static void main(String[] args) {

        // Se crea el gestor de servicios y se obtienen las
        // instancias de prueba de cada tipo de servicio turistico
        GestorServicios gestorServicios = new GestorServicios();
        List<ServicioTuristico> servicios = gestorServicios.crearServiciosDePrueba();

        System.out.println("===== Servicios Turisticos - Llanquihue Tour =====");
        System.out.println();

        // Se recorre la lista y se muestra cada servicio usando
        // su propio metodo toString() (polimorfismo de sobreescritura)
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio.toString());
        }

        System.out.println();
        System.out.println("===== Fin del listado de servicios =====");
    }
}
