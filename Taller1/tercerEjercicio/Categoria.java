public class Categoria {
    String nombreCategoria = "";
    String descripcionCategoria  = "";
   
    public Categoria(String nombreCategoria, String descripcionCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }
    public String getNombreCategoria() {
        return nombreCategoria;
    }
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
    @Override
    public String toString() {
        return "" + nombreCategoria + ", descripcionCategoria=" + descripcionCategoria + "";
    }
}
