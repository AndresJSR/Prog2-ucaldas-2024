public class Categoria {
    String nombreCategoria = "";
    String descripcionCategoria  = "";
    public Categoria (String nombreCategoria , String descripcionCategoria ){
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
    public String toString(){
        return "Categoria [nombreCategoria= + " + nombreCategoria + ", descripcionCategoria " + descripcionCategoria +"]";
    }
    public String geString(){
        return toString();
    }
}
