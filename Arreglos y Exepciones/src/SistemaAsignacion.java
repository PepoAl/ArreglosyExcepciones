import java.io.*;
import java.util.List;

public class SistemaAsignacion {
    private List<Pais> paises;
    private List<Recinto> recintos;
    private List<Evento> eventos;

    public void cargarRecintos(File file) {
        // Lógica para cargar los recintos desde un archivo CSV
    }

    public void cargarEventos(File file) {
        // Lógica para cargar los eventos desde un archivo CSV
    }

    public void consultarRecinto(int idPais, int idRecinto, int fecha, String ubicacion) {
        // Lógica para consultar un recinto específico
    }

    public void consultarEvento(int idEvento) {
        // Lógica para consultar un evento específico
    }

    public void asignarRecintos() {
        // Lógica para asignar recintos a eventos según las reglas
    }

    public void generarInforme() {
        // Lógica para generar un informe con eventos asignados y no asignados
    }

    public static void main(String[] args) {
        SistemaAsignacion sistema = new SistemaAsignacion();

        // Lógica para interactuar con el usuario y llamar a los métodos necesarios
    }
}
