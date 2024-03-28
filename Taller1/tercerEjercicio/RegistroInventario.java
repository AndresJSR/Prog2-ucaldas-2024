import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class RegistroInventario {
    static ArrayList<Producto> productos  = new ArrayList<>();
    static ArrayList<Categoria> categorias = new ArrayList<>();
    static ArrayList<Proveedor> proveedores = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();
    public static void main(String[] args) {
        
        leer_archivo(productos);
        for (Producto prod : productos) {
            System.out.println(" ( Nombre del Producto : " + prod.getNombreProducto() + " )" + " ( Categoria : " + prod.getCategoria() + " )"
                    + " ( Precio : " + prod.getPrecio() + " )" + " ( Promedio : " + prod.getStock() + " )");   
        }
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nRegistro del inventario");
            System.out.println("[1] Listar productos");
            System.out.println("[2] Listar categorias");
            System.out.println("[3] Listar proveedores");
            System.out.println("[4] listar ventas");
            System.out.println("[5] Buscar Productos");
            System.out.println("[6] Salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //metodo listarProductos;
                    //metodo registrarProducto;
                    break;
                case 2:
                    //metodo listarCategorias;
                    //metodo registrarCategoria;
                    break;
                case 3:
                    //metodo listarProveedores;
                    //metodo registrarProveedor;
                    break;
                case 4:
                    //metodo listarVentas;
                    //metodo registrarVenta;
                    break;
                case 5:
                    //metodo buscarProducto;
                    break;
            }
        } while (opcion != 6);
    }
    private static void leer_archivo(ArrayList<Producto> lista) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(
                    "Lista_Productos.txt"));

            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 5) {
                    String nombreCategoria = bloques[0];
                    String descripcionCategoria = bloques[1];
                    Categoria categoria = new Categoria(nombreCategoria, descripcionCategoria); 
                    String nombreProducto = bloques[2];
                    double precio = Double.parseDouble(bloques[3]);
                    int stock = Integer.parseInt(bloques[4]);
                    categorias.add(new Categoria(nombreCategoria, descripcionCategoria));
                    lista.add(new Producto(nombreProducto,categoria, precio, stock));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }  
}