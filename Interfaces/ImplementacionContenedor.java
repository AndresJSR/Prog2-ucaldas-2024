import java.util.ArrayList;

public class ImplementacionContenedor implements Contenedor {
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public ImplementacionContenedor() {
        this.listaEstudiantes.add(new Estudiante("Miguel", "0003"));
        this.listaEstudiantes.add(new Estudiante("Luisa", "0002"));
        this.listaEstudiantes.add(new Estudiante("Angelica", "0001"));
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        return this.listaEstudiantes;
    }
}
