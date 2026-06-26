package com.duoc.semana6.model;

/**
 * Clase base que representa un servicio turistico generico
 * ofrecido por la agencia Llanquihue Tour.
 *
 * Contiene los atributos comunes que comparten todos los
 * servicios turisticos, sin importar su categoria especifica.
 *
 * Las subclases (RutaGastronomica, PaseoLacustre, ExcursionCultural)
 * heredan estos atributos y agregan caracteristicas propias.
 *
 * @author Satcha Quispe
 */
public class ServicioTuristico {

    // Nombre del servicio turistico (ej: "Ruta del Vino Frutillar")
    protected String nombre;

    // Duracion del servicio expresada en horas
    protected double duracionHoras;

    /**
     * Constructor de la clase ServicioTuristico.
     *
     * @param nombre        nombre del servicio turistico
     * @param duracionHoras duracion del servicio en horas
     */
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    /**
     * Representacion en texto del servicio turistico con
     * su informacion basica (nombre y duracion).
     *
     * Las subclases sobrescriben este metodo para agregar
     * su informacion especifica.
     *
     * @return cadena con los datos del servicio turistico
     */
    @Override
    public String toString() {
        return "Servicio Turistico: " + nombre + " | Duracion: " + duracionHoras + " horas";
    }
}
