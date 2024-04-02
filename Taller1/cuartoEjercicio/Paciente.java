public class Paciente {
    String nombrePaciente = "";
    String cedulaPaciente = "";
    String telefonoPaciente  ="";
    String direccion = "";
    public Paciente (String nombrePaciente , String cedulaPaciente,String telefonoPaciente ,String direccion ) {
        this.nombrePaciente=nombrePaciente;
        this.cedulaPaciente=cedulaPaciente;
        this.telefonoPaciente=telefonoPaciente;
        this.direccion=direccion;
    }
    
    public Paciente() {
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
    public String getCedulaPaciente() {
        return cedulaPaciente;
    }
    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }
    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }
    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Paciente [nombrePaciente=" + nombrePaciente + ", cedulaPaciente=" + cedulaPaciente
                + ", telefonoPaciente=" + telefonoPaciente + ", direccion=" + direccion + "]";
    }

    
}
