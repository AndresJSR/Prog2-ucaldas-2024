public class Medico {
    String nombreMedico = "";
    Especialidad especialidad;
    String codigoMedico  ="";
    public Medico (String nombreMedico , Especialidad especialidad, String codigoMedico){
        this.nombreMedico=nombreMedico;
        this.especialidad=especialidad;
        this.codigoMedico=codigoMedico;
    }
    
    public Medico() {
    }

    public String getNombreMedico() {
        return nombreMedico;
    }
    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public String getCodigoMedico() {
        return codigoMedico;
    }
    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }
    @Override
    public String toString() {
        return "Medico [nombreMedico=" + nombreMedico + ", especialidad: nombre de la especialidad = " + especialidad.getNombreEspecialidad() + "descripción de la especialidad= " +especialidad.getDescripcionEspecialidad() + ", codigoMedico="
                + codigoMedico + "]";
    }
    
}
