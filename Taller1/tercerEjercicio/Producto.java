public class Producto {
    String nombreProducto = "";
    Categoria categoria;
    double precio = 0f;
    int stock;

    public Producto(String nombreProducto, Categoria categoria, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        String caracteristicasProducto = "Producto [nombreProducto=" + nombreProducto+ "]";
        return caracteristicasProducto;
    }

}