import java.text.DateFormat;
public class Vuelo {
    private String numVuelo = "";
    private String origenVuelo="";
    private String destinouelo="";
    private DateFormat fecha;
    private String capacidad="";
    private String numAsientos="";
    public Vuelo(String numVuelo, String origenVuelo, String destinouelo, DateFormat fecha,
            String capacidad, String numAsientos) {
        this.numVuelo = numVuelo;
        this.origenVuelo = origenVuelo;
        this.destinouelo = destinouelo;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.numAsientos = numAsientos;
    }
    public String getNumVuelo() {
        return numVuelo;
    }
    public void setNumVuelo(String numVuelo) {
        this.numVuelo = numVuelo;
    }
    public String getOrigenVuelo() {
        return origenVuelo;
    }
    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }
    public String getDestinouelo() {
        return destinouelo;
    }
    public void setDestinouelo(String destinouelo) {
        this.destinouelo = destinouelo;
    }
    public DateFormat getFecha() {
        return fecha;
    }
    public void setFecha(DateFormat fecha) {
        this.fecha = fecha;
    }
    public String getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public String getNumAsientos() {
        return numAsientos;
    }
    public void setNumAsientos(String numAsientos) {
        this.numAsientos = numAsientos;
    }
    @Override
    public String toString() {
        return "Vuelo [numVuelo=" + numVuelo + ", origenVuelo=" + origenVuelo + ", destinouelo=" + destinouelo
                + ", fecha=" + fecha + ", capacidad=" + capacidad + ", numAsientos=" + numAsientos + "]";
    }
    
}
