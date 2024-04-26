public class Producto {
    private String nombre="";
    private double precio =0; 
    private int stock =0;
    public Producto (String nombre, double precio , int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    
}
