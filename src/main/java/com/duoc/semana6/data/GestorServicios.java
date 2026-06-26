package com.duoc.semana6.data;

import com.duoc.semana6.model.ExcursionCultural;
import com.duoc.semana6.model.PaseoLacustre;
import com.duoc.semana6.model.RutaGastronomica;
import com.duoc.semana6.model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar la creacion de instancias de
 * prueba para los distintos servicios turisticos de la agencia
 * Llanquihue Tour.
 *
 * Crea al menos dos objetos de cada subclase (RutaGastronomica,
 * PaseoLacustre y ExcursionCultural) y los entrega listos para
 * ser mostrados desde la capa de interfaz (ui).
 *
 * @author Satcha Quispe
 */
public class GestorServicios {

    /**
     * Crea y retorna una lista con instancias de prueba de los
     * distintos tipos de servicios turisticos ofrecidos por la
     * agencia (al menos dos objetos de cada subclase).
     *
     * @return lista de ServicioTuristico con las instancias creadas
     */
    public List<ServicioTuristico> crearServiciosDePrueba() {
        List<ServicioTuristico> servicios = new ArrayList<>();

        // Se crean dos instancias de RutaGastronomica
        servicios.add(new RutaGastronomica("Ruta del Vino Frutillar", 4.5, 3));
        servicios.add(new RutaGastronomica("Sabores de Puerto Varas", 3.0, 4));

        // Se crean dos instancias de PaseoLacustre
        servicios.add(new PaseoLacustre("Travesia Lago Llanquihue", 2.5, "Catamaran"));
        servicios.add(new PaseoLacustre("Atardecer en el Lago", 1.5, "Lancha"));

        // Se crean dos instancias de ExcursionCultural
        servicios.add(new ExcursionCultural("Historia de los Colonos Alemanes", 3.5, "Museo Colonial Aleman Frutillar"));
        servicios.add(new ExcursionCultural("Patrimonio de Puerto Octay", 2.0, "Casco Historico Puerto Octay"));

        return servicios;
    }
}
