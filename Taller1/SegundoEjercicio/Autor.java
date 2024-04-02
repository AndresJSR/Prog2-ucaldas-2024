public class Autor {
    String nombreAutor;
    String nacionalidadAutor;

    public Autor (String nombreAutor, String nacionalidadAutor){
        this.nombreAutor=nombreAutor;
        this.nacionalidadAutor=nacionalidadAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidadAutor() {
        return nacionalidadAutor;
    }

    public void setNacionalidadAutor(String nacionalidadAutor) {
        this.nacionalidadAutor = nacionalidadAutor;
    }

    @Override
    public String toString() {
        return "Autor [nombreAutor=" + nombreAutor + ", nacionalidadAutor=" + nacionalidadAutor + "]";
    }
    
}
