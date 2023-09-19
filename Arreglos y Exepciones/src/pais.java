import java.util.*;

class Pais {
    private int id;
    private String nombre;
    private String ubicacion;

    // Constructor y métodos getters y setters
}

class Recinto {
    private int id;
    private int capacidad;
    private Pais pais;
    private Set<Integer> horarioDisponible;

    // Constructor y métodos getters y setters
    public void consultarDisponibilidad() {
        // Lógica para consultar la disponibilidad del recinto
    }
}

class Evento {
    private int id;
    private String artista;
    private int horario;
    private int fecha;
    private int duracion;
    private int asistentes;
    private Pais pais;
    private Recinto recintoAsignado;

    // Constructor y métodos getters y setters
}
