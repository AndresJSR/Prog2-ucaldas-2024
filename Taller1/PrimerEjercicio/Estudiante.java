public class Estudiante {

    String nombre = "";
    String codigo = "";
    String carrera  ="";
    double promedio = 0f;
    public Estudiante(String nombre, String codigo, String carrera,  double promedio ){
        this.nombre=nombre;
        this.codigo=codigo;
        this.carrera=carrera;
        this.promedio=promedio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}