import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

public class RegistroInventario {
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Categoria> categorias = new ArrayList<>();
    static ArrayList<Proveedor> proveedores = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        leer_archivo();
        for (Producto prod : productos) {
            System.out.println(prod);
        }
        menu();
    }

    public static void menu() {

        int opcion;
        do {
            System.out.println("\nRegistro del inventario");
            System.out.println("[1] Registrar producto");
            System.out.println("[2] Registrar categoría");
            System.out.println("[3] Registrar proveedor");
            System.out.println("[4] Registrar venta");
            System.out.println("[5] Buscar Productos");
            System.out.println("[6] Salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //registrarProducto(crearProducto());
                    //listarProductos();
                    break;
                case 2:
                    //listarCategorias();
                    //registrarCategoria(crearCategoria());

                    break;
                case 3:
                    //listarProveedores();
                    //registrarProveedores(crearProveedor());
                    //listarProveedores();
                    break;
                case 4:
                    //registrarVenta(crearVenta());
                    //listarVentas();
                    break;
                case 5:
                    System.out.println("Seleccione una opción de busqueda");
                    System.out.println("[1] Busqueda por nombre del producto");
                    System.out.println("[2] Busqueda por categoría del producto");
                    System.out.println("[3] Busqueda por precio del producto");
                    System.out.println("[4] listar producto de menor stock");
                    System.out.println("[5] Salir");

                    int resp = sc.nextInt();
                    switch (resp) {
                        case 1:
                            System.out.println("Nombre del producto");
                            String nombreFiltro = sc.next();
                            System.out.println(buscarProductos(nombreFiltro));
                            break;
                        case 2:
                            System.out.println("Categoría del producto");
                            String categoriaFiltro = sc.next();
                            System.out.println(buscarProductos(categoriaFiltro));
                            break;
                        case 3:
                            System.out.println("Precio del producto");
                            String precioFiltro = sc.next();
                            System.out.println(buscarProductos(precioFiltro));
                            break;
                        case 4:
                            listarProductosMenorStock();

                            break;

                            case 5:

                            break;

                    }

                    break;
            }
        } while (opcion != 6);

    }

    /*
     * CREACION DE OBJETOS (PRODUCTO - CATEGORIA - PROVEEDOR - VENTA) CON SUS
     * RESPECTIVOS REGISTROS.
     */

    // SE CREA REGISTRO DEL PRODUCTO
    public static void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    // SE CREA EL PRODUCTO
    public static Producto crearProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = sc.next();
        Categoria categoria = crearCategoria();
        System.out.println("Ingrese el precio ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese cuantas unidades va a registrar");
        int stock = sc.nextInt();
        return new Producto(nombre, categoria, precio, stock);
    }

    //
    // SE CREA REGISTRO DE CATEGORIA
    public static void registrarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    // SE CREA LA CATEGORIA
    public static Categoria crearCategoria() {
        System.out.println("Para la categoría del producto");
        System.out.println("Ingrese el nombre de la categoría");
        String nombreCategoria = sc.next();
        System.out.println("Ingrese la descripción de la categoría");
        String descripcionCategoria = sc.next();
        return new Categoria(nombreCategoria, descripcionCategoria);
    }

    //
    // SE CREA EL REGISTRO DE LOS PROVEEDORES
    public static void registrarProveedores(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    //
    // SE CREA LA CATEGORIA
    public static Proveedor crearProveedor() {
        System.out.println("Ingrese el nombre del proveedor");
        String nombreProveedor = sc.next();
        System.out.println("Ingrese el teléfono del proveedor");
        String telefonoProveedor = sc.next();
        System.out.println("Ingrese la dirección del proveedor");
        String direccionProveedor = sc.next();
        return new Proveedor(nombreProveedor, telefonoProveedor, direccionProveedor);
    }

    //
    // SE CREA EL REGISTRO DE VENTAS
    public static void registrarVenta(Venta venta) {
        ventas.add(venta);

        venta.producto.setStock(venta.producto.getStock() - venta.getCantidad());
    }

    //
    // SE CREA LA CATEGORIA
    public static Venta crearVenta() {
        System.out.println("Qué producto desea comprar");
        listarProductos();
        String nombreProducto;
        Producto producto = new Producto();
        do {
            System.out.println("Ingrese el nombre del producto");
            nombreProducto = sc.next();
            if (buscarProductos(nombreProducto).size() > 0) {
                producto = buscarProductos(nombreProducto).get(0);

            } else {
                System.out.println("Se está refiriendo a un producto inexistente, Por favor revise la lista");
                listarProductos();
            }
        } while (buscarProductos(nombreProducto).size() == 0);

        System.out.println(
                "Considere el stock : " + producto.getStock() + " del producto a comprar, para realizar la compra ");
        int unidades;
        do {
            System.out.println("Ingrese la cantidad de unidades del producto vendidas");
            unidades = sc.nextInt();
            if (unidades > producto.getStock()) {
                System.out.println("No existe la cantidad de productos que desea comprar");
            }
        } while (producto.getStock() < unidades);
        System.out.println("Ingrese la fecha en la que se realizó la venta");
        System.out.println("Ingrese el año");
        int año = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el día");
        int dia = sc.nextInt();
        return new Venta(producto, unidades, new Date(año - 1900, mes - 1, dia));
    }

    public static void listarProductos() {
        if (!productos.isEmpty()) {
            System.out.println("Productos de la lista");
            for (Producto prod : productos) {
                System.out.println(prod);
            }
        } else {
            System.out.println("No existen productos en la lista");
        }
    }

    public static void listarCategorias() {
        if (!categorias.isEmpty()) {
            System.out.println("Productos de la lista");
            for (Categoria cat : categorias) {
                System.out.println(cat);
            }
        } else {
            System.out.println("No existen categorías en la lista");
        }
    }

    public static void listarProveedores() {
        if (!proveedores.isEmpty()) {
            System.out.println("Productos de la lista");
            for (Proveedor prov : proveedores) {
                System.out.println(prov.getNombreProv() + prov.getTelefonoProv() + prov.getDireccionProv());
            }
        } else {
            System.out.println("No existen productos en la lista");
        }
    }

    public static void listarVentas() {
        if (!ventas.isEmpty()) {
            System.out.println("Productos de la lista");
            for (Venta vent : ventas) {
                System.out.println(vent.getProducto());
                System.out.println(vent.getFechaVenta());
                System.out.println(vent.getCantidad());
            }
        } else {
            System.out.println("No existen productos en la lista");
        }
    }
    
    public static ArrayList<Producto> buscarProductos (String filtro) {
        ArrayList<Producto> filtroProducto = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.getNombreProducto().equals(filtro) || String.valueOf(prod.getPrecio()).equals(filtro)
                    || prod.getCategoria().getNombreCategoria().equals(filtro)) {
                filtroProducto.add(prod);
            }
        }
        return filtroProducto;
    }
    public static ArrayList<Producto> buscarstock (int filtroStock) {
        ArrayList<Producto> filtroProducto = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.getStock()==filtroStock) {
                filtroProducto.add(prod);
            }
        }
        return filtroProducto;
    }
    public static void listarProductosMenorStock() {
        if (!productos.isEmpty()) {
            System.out.println("Productos de la lista");
            int menor = productos.get(0).getStock();
            for (int i =0 ; i<productos.size(); i++) {
                if (menor <productos.get(i).getStock()) {
                } else {
                    menor = productos.get(i).getStock();
                }
                System.out.println("El producto de menor stock es ");
                System.out.println(buscarstock(menor));
             }
        } else {
            System.out.println("No existen productos en la lista");
        }
    }

    private static void leer_archivo() {
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
                    productos.add(new Producto(nombreProducto, categoria, precio, stock));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

}