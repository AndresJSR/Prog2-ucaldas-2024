public class Estudiante {
    private String nombre = "";
    private String codigoEstudiante = "";

    public Estudiante(String nombre, String codigoEstudiante) {
        this.nombre = nombre;
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", codigoEstudiante=" + codigoEstudiante + "]";
    }

}
