package com.duoc.semana6.model;

/**
 * Subclase que representa una excursion cultural ofrecida
 * por la agencia Llanquihue Tour.
 *
 * Hereda los atributos comunes de ServicioTuristico (nombre y
 * duracionHoras) y agrega el atributo especifico lugarHistorico.
 *
 * @author Satcha Quispe
 */
public class ExcursionCultural extends ServicioTuristico {

    // Lugar historico que se visita durante la excursion
    private String lugarHistorico;

    /**
     * Constructor de la clase ExcursionCultural.
     *
     * @param nombre         nombre de la excursion cultural
     * @param duracionHoras  duracion del servicio en horas
     * @param lugarHistorico lugar historico que se visita en la excursion
     */
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        // Se invoca el constructor de la superclase para inicializar
        // los atributos comunes nombre y duracionHoras
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter y setter del atributo propio

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    /**
     * Representacion en texto de la excursion cultural, incluyendo
     * la informacion heredada de ServicioTuristico y el lugar
     * historico propio de esta subclase.
     *
     * @return cadena con los datos completos de la excursion cultural
     */
    @Override
    public String toString() {
        return "Excursion Cultural -> Nombre: " + nombre
                + " | Duracion: " + duracionHoras + " horas"
                + " | Lugar historico: " + lugarHistorico;
    }
}

