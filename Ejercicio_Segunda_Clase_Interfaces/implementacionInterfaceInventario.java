import java.util.ArrayList;

public class implementacionInterfaceInventario implements InterfaceInventario {
    public ArrayList<Producto> listaProductos = new ArrayList<>();

    public implementacionInterfaceInventario() {
        this.listaProductos.add(new Producto("Harina", 3.000, 1));
        this.listaProductos.add(new Producto("Cereal", 10.900, 2));
        this.listaProductos.add(new Producto("Leche", 4.700, 3));
    }

    public ArrayList<Producto> obtenerProducto() {
        return this.listaProductos;
    }
}