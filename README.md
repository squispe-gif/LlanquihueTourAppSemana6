# LlanquihueTourApp – Semana 6

## Objetivo de esta semana

En esta sexta semana se implementa una **jerarquía de clases con herencia simple** para representar los distintos tipos de servicios turísticos que ofrece la agencia **Llanquihue Tour**: rutas gastronómicas, paseos lacustres y excursiones culturales.

Se aplican los siguientes conceptos de Programación Orientada a Objetos:

- **Herencia**: las subclases extienden una superclase común.
- **Uso de `super(...)`**: cada subclase inicializa los atributos heredados a través del constructor de la superclase.
- **Sobreescritura de métodos (`@Override`)**: cada subclase sobrescribe `toString()` para mostrar su información específica.
- **Organización modular del proyecto** en paquetes según su responsabilidad (`model`, `data`, `ui`).

## Clases creadas

### Paquete `com.duoc.semana6.model`

| Clase | Tipo | Atributos propios | Atributos heredados |
|---|---|---|---|
| `ServicioTuristico` | Superclase | — | `nombre`, `duracionHoras` |
| `RutaGastronomica` | Subclase | `numeroDeParadas` | `nombre`, `duracionHoras` |
| `PaseoLacustre` | Subclase | `tipoEmbarcacion` | `nombre`, `duracionHoras` |
| `ExcursionCultural` | Subclase | `lugarHistorico` | `nombre`, `duracionHoras` |

### Paquete `com.duoc.semana6.data`

- **`GestorServicios`**: crea al menos dos instancias de prueba de cada subclase (`RutaGastronomica`, `PaseoLacustre`, `ExcursionCultural`) y las retorna en una lista de tipo `ServicioTuristico`.

### Paquete `com.duoc.semana6.ui`

- **`Main`**: clase principal que invoca a `GestorServicios`, recorre la lista de servicios y muestra por consola el resultado de `toString()` de cada uno.

## Estructura del proyecto

```
LlanquihueTourApp/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── duoc/
                    └── semana6/
                        ├── model/
                        │   ├── ServicioTuristico.java
                        │   ├── RutaGastronomica.java
                        │   ├── PaseoLacustre.java
                        │   └── ExcursionCultural.java
                        ├── data/
                        │   └── GestorServicios.java
                        └── ui/
                            └── Main.java
```

## Instrucciones para ejecutar Main

1. Abrir IntelliJ IDEA y seleccionar la carpeta del proyecto `LlanquihueTourApp` (la misma que se descargó/clonó desde el repositorio de GitHub).
2. Esperar a que Maven sincronice las dependencias (ícono de Maven en la esquina superior derecha, o `File > Reload Maven Project` si es necesario).
3. Navegar hasta `src/main/java/com/duoc/semana6/ui/Main.java`.
4. Hacer clic derecho sobre el archivo y seleccionar **Run 'Main.main()'**, o usar el botón ▶ verde junto al método `main`.
```

## Salida esperada por consola

```
===== Servicios Turisticos - Llanquihue Tour =====

Ruta Gastronomica -> Nombre: Ruta del Vino Frutillar | Duracion: 4.5 horas | Numero de paradas: 3
Ruta Gastronomica -> Nombre: Sabores de Puerto Varas | Duracion: 3.0 horas | Numero de paradas: 4
Paseo Lacustre -> Nombre: Travesia Lago Llanquihue | Duracion: 2.5 horas | Tipo de embarcacion: Catamaran
Paseo Lacustre -> Nombre: Atardecer en el Lago | Duracion: 1.5 horas | Tipo de embarcacion: Lancha
Excursion Cultural -> Nombre: Historia de los Colonos Alemanes | Duracion: 3.5 horas | Lugar historico: Museo Colonial Aleman Frutillar
Excursion Cultural -> Nombre: Patrimonio de Puerto Octay | Duracion: 2.0 horas | Lugar historico: Casco Historico Puerto Octay

===== Fin del listado de servicios =====
```

## Autor

Satcha Belén Quispe Parada – DUOC UC 
