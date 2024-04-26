import java.util.*;
public class Main {
    public static void main(String[] args) {
        implementacionInterfaceInventario instImplementacion = new implementacionInterfaceInventario();    
        ArrayList<Producto>listaProductos = instImplementacion.obtenerProducto();    
        for (Producto producto : listaProductos) {
         System.out.println("[ Nombre del producto : "+producto.getNombre()+ " ]" + " [ Precio del producto :  "+ producto.getPrecio()+" ]"+ " [ Stock del producto :  "+ producto.getStock()+" ]");   
        }
    }
}