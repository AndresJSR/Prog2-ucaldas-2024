import java.sql.Date;

public class Cita {
Paciente paciente;
Medico medico;
Date fechaCita;
String horaCita="";
String estado="";
    public Cita (Paciente paciente , Medico medico , Date fechaCita , String horaCita , String estado){
    this.paciente=paciente;
    this.medico=medico;
    this.fechaCita=fechaCita;
    this.horaCita=horaCita;
    this.estado=estado;
    }
    
    public Cita() {
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
    public String getHoraCita() {
        return horaCita;
    }
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cita [paciente=" + paciente + ", medico=" + medico + ", fechaCita=" + fechaCita + ", horaCita="
                + horaCita + ", estado=" + estado + "]";
    }
    
}
