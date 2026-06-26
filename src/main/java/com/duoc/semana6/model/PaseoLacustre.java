package com.duoc.semana6.model;

/**
 * Subclase que representa un paseo lacustre ofrecido
 * por la agencia Llanquihue Tour.
 *
 * Hereda los atributos comunes de ServicioTuristico (nombre y
 * duracionHoras) y agrega el atributo especifico tipoEmbarcacion.
 *
 * @author Satcha Quispe
 */
public class PaseoLacustre extends ServicioTuristico {

    // Tipo de embarcacion utilizada en el paseo (ej: "Catamaran", "Lancha")
    private String tipoEmbarcacion;

    /**
     * Constructor de la clase PaseoLacustre.
     *
     * @param nombre          nombre del paseo lacustre
     * @param duracionHoras   duracion del servicio en horas
     * @param tipoEmbarcacion tipo de embarcacion utilizada en el paseo
     */
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        // Se invoca el constructor de la superclase para inicializar
        // los atributos comunes nombre y duracionHoras
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter y setter del atributo propio

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    /**
     * Representacion en texto del paseo lacustre, incluyendo
     * la informacion heredada de ServicioTuristico y el tipo de
     * embarcacion propio de esta subclase.
     *
     * @return cadena con los datos completos del paseo lacustre
     */
    @Override
    public String toString() {
        return "Paseo Lacustre -> Nombre: " + nombre
                + " | Duracion: " + duracionHoras + " horas"
                + " | Tipo de embarcacion: " + tipoEmbarcacion;
    }
}

