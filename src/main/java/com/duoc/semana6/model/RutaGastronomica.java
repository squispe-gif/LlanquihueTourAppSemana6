package com.duoc.semana6.model;

/**
 * Subclase que representa una ruta gastronomica ofrecida
 * por la agencia Llanquihue Tour.
 *
 * Hereda los atributos comunes de ServicioTuristico (nombre y
 * duracionHoras) y agrega el atributo especifico numeroDeParadas.
 *
 * @author Satcha Quispe
 */
public class RutaGastronomica extends ServicioTuristico {

    // Numero de paradas o degustaciones que incluye la ruta
    private int numeroDeParadas;

    /**
     * Constructor de la clase RutaGastronomica.
     *
     * @param nombre          nombre de la ruta gastronomica
     * @param duracionHoras   duracion del servicio en horas
     * @param numeroDeParadas cantidad de paradas que incluye la ruta
     */
    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        // Se invoca el constructor de la superclase para inicializar
        // los atributos comunes nombre y duracionHoras
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y setter del atributo propio

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    /**
     * Representacion en texto de la ruta gastronomica, incluyendo
     * la informacion heredada de ServicioTuristico y el numero de
     * paradas propio de esta subclase.
     *
     * @return cadena con los datos completos de la ruta gastronomica
     */
    @Override
    public String toString() {
        return "Ruta Gastronomica -> Nombre: " + nombre
                + " | Duracion: " + duracionHoras + " horas"
                + " | Numero de paradas: " + numeroDeParadas;
    }
}
