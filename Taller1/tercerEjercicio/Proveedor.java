public class Proveedor {
    String nombreProv = "";
    String telefonoProv = "";
    String direccionProv = "";

    public Proveedor (String nombreProv , String telefonoProv , String direccionProv){
        this.nombreProv = nombreProv;
        this.telefonoProv = telefonoProv;
        this.direccionProv = direccionProv;

    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

}
