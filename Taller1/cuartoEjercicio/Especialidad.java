public class Especialidad {
    String nombreEspecialidad ="";
    String descripcionEspecialidad="";
    public Especialidad(String nombreEspecialidad, String descripcionEspecialidad){
        this.nombreEspecialidad=nombreEspecialidad;
        this.descripcionEspecialidad=descripcionEspecialidad;
    }
    
    public Especialidad() {
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }
    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }
    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }
    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }
    @Override
    public String toString() {
        return "Especialidad [nombreEspecialidad=" + nombreEspecialidad + ", descripcionEspecialidad="
                + descripcionEspecialidad + "]";
    }

}
