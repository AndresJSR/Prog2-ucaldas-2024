import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

public class RegistroBiblioteca {
     static Scanner sc = new Scanner(System.in);
     static ArrayList<Usuario> usuarios = new ArrayList<>();
     static ArrayList<Libro> libros = new ArrayList<>();
     static ArrayList<Autor> autores = new ArrayList<>();
     static ArrayList<Prestamo> prestamos = new ArrayList<>();
     static ArrayList<Prestamo> devoluciones = new ArrayList<>();

     public static void main(String[] args) {
          leer_lista_Usuarios();
          for (Usuario usu : usuarios) {
               System.out.println(usu);
           }
          leer_lista_Libros();
          for (Libro lib : libros) {
               System.out.println(lib);
           }
          menu();
     }

     public static void menu() {
          int opcion;
          do {
               System.out.println("\nRegistro de la biblioteca");
               System.out.println("[1] Registrar Libro");
               System.out.println("[2] Registrar Autor");
               System.out.println("[3] Registrar Prestamo");
               System.out.println("[4] Registrar Devolución");
               System.out.println("[5] Buscar Libros");
               System.out.println("[6] Salir\n");
               opcion = sc.nextInt();
               switch (opcion) {
                    case 1:
                          registrarLibro(crearLibro());
                          listarLibros();
                         break;
                    case 2:
                          listarAutor();
                          registrarAutor(crearAutor());
                          listarAutor();
                         break;
                    case 3:
                    listarLibros();
                    registrarPrestamo(crearPrestamo());
                          listarPrestamos();
                         break;
                    case 4:
                          listarDevoluciones();
                          registrarDevolucion(crearDevolucion());
                          listarDevoluciones();
                         break;
                    case 5:
                         System.out.println("Seleccione una opción de busqueda");
                         System.out.println("[1] Busqueda por título del libro");
                         System.out.println("[2] Busqueda por nombre del autor");
                         System.out.println("[3] Busqueda por ISBN del libro");
                         System.out.println("[4] Busqueda por categoría del libro");
                         System.out.println("[5] Salir");
                         int resp = sc.nextInt();
                         sc.nextLine();
                         switch (resp) {
                              case 1:
                                    System.out.println("Título del libro");
                                    String tituloFiltro = sc.nextLine();
                                    System.out.println(buscarLibro(tituloFiltro));
                                   break;
                              case 2:

                                    System.out.println("Nombre del autor");
                                    String nombreAutorFiltro = sc.nextLine();
                                    System.out.println(buscarLibro(nombreAutorFiltro));
                                   break;
                              case 3:
                                    System.out.println("ISBN del libro");
                                    String isbnFiltro = sc.nextLine();
                                    System.out.println(buscarLibro(isbnFiltro));
                                    break;
                              case 4:
                                    System.out.println("Categoria del libro");
                                    String categoriaFiltro = sc.nextLine();
                                    System.out.println(buscarLibro(categoriaFiltro));
                                   break;
                              case 5:
                                   break;
                         }

                         break;
               }
          } while (opcion != 6);

     }

     // SE CREA EL REGISTRO DEL LIBRO
     public static void registrarLibro(Libro libro) {
          libros.add(libro);
     }

     // SE CREA EL LIBRO
     public static Libro crearLibro() {
          sc.nextLine();
          System.out.println("Ingrese el título del libro");
          String tituloLibro = sc.nextLine();
          System.out.println("Ingrese el nombre del autor ");
          String nombreAutor = sc.nextLine();
          System.out.println("Ingrese la nacionalidad del autor");
          String nacionalidadAutor = sc.nextLine();
          Autor autor = new Autor(nombreAutor, nacionalidadAutor);
          System.out.println("Ingrese el ISBN");
          String isbnLibro = sc.nextLine();
          System.out.println("Ingrese la categoría del libro");
          String categoriaLibro = sc.nextLine();
          System.out.println("Ingrese el número de ejemplares a registrar");
          int ejemplaresLibro = sc.nextInt();
          return new Libro(tituloLibro, autor, isbnLibro, categoriaLibro, ejemplaresLibro);
     }

     // SE CREA EL REGISTRO DEL AUTOR
     public static void registrarAutor(Autor autor) {
          autores.add(autor);
     }

     // SE CREA EL AUTOR
     public static Autor crearAutor() {
          sc.nextLine();
          System.out.println("Ingrese el nombre del autor");
          String nombreAutor = sc.nextLine();
          System.out.println("Ingrese la nacionalidad del autor");
          String nacionalidadAutor = sc.nextLine();
          return new Autor(nombreAutor, nacionalidadAutor);
     }

     // SE CREA EL REGISTRO DEL PRESTAMO
     public static void registrarPrestamo(Prestamo prestamo) {
          prestamos.add(prestamo);
     }

     // SE CREA EL PRESTAMO
     public static Prestamo crearPrestamo() {
          sc.nextLine();
          System.out.println("Para ingresar el libro");
          boolean existeLibro = false;
          Libro libro = new Libro(null, null, null, null, 0);
          
          do {
               System.out.println("Ingrese el titulo del libro ");
               String tituloLibro = sc.nextLine();
               for (int i = 0; i < libros.size(); i++) {
                   if (libros.get(i).titulo.equals(tituloLibro) && libros.get(i).ejemplares>0) {
                       System.out.println("Nombre = " + libros.get(i).titulo + " Cedula =  "
                               + libros.get(i).autor + "Dirección = " + libros.get(i).isbn
                               + " Telefono = " + libros.get(i).categoria + "Ejemplares = "+libros.get(i).ejemplares);
                       libro = libros.get(i);
                       existeLibro = true;
                   }
               }
               if (!existeLibro) {
                   System.out.println("Esta cédula no existe. Ingresela de nuevo");
               }
           } while (!existeLibro);
          System.out.println("Para ingresar el usuario ");
          System.out.println("Ingrese el nombre del usuario");
          String nombreUsuario = sc.nextLine();
          System.out.println("Ingrese la cedula del usuario");
          String cedulaUsuario = sc.nextLine();
          Usuario usuario = new Usuario(nombreUsuario, cedulaUsuario);
          System.out.println("Para ingresar la fecha de prestamo");
          Date fechaPrestamo;
          System.out.println("Ingrese el año");
          int añoPrestamo = sc.nextInt();
          System.out.println("Ingrese el mes");
          int mesPrestamo = sc.nextInt();
          System.out.println("Ingrese el dia");
          int diaPrestamo = sc.nextInt();
          fechaPrestamo = new Date(añoPrestamo - 1900, mesPrestamo - 1, diaPrestamo);
          System.out.println("Para ingresar la fecha de devolución");
          Date fechaDevolucion;
          System.out.println("Ingrese el año");
          int añoDevolucion = sc.nextInt();
          System.out.println("Ingrese el mes");
          int mesDevolucion = sc.nextInt();
          System.out.println("Ingrese el dia");
          int diaDevolucion = sc.nextInt();
          fechaDevolucion = new Date(añoDevolucion - 1900, mesDevolucion - 1, diaDevolucion);
          return new Prestamo(libro, usuario, fechaPrestamo, fechaDevolucion);
     }
     
     public static void registrarDevolucion(Prestamo prestamo){
          if (!prestamo.isEmpty()) {
               devoluciones.add(prestamo);
               prestamos.remove(prestamo);
          }
     }

     public static Prestamo crearDevolucion(){
          Prestamo devolucion = new Prestamo(null, null, null, null);
          sc.nextLine();
          System.out.println("Para registrar la devolución");
          boolean existeUsuario = false;
     
          do {
               System.out.println("Ingrese el número de cedula del usuario ");
               String cedulaUsuario = sc.nextLine();
               for (Prestamo prestamoUsuario : prestamos) {
                    if (prestamoUsuario.usuario.getCedulaUsuario().equals(cedulaUsuario)) {
                         System.out.println(prestamoUsuario);
                    }
               }
               System.out.println("Ingrese el ISBN para la devolución del libro");
               String isbnDevolucion = sc.nextLine();
               for (int i = 0; i < prestamos.size(); i++) {
                   if (prestamos.get(i).getLibro().getIsbn().equals(isbnDevolucion)) {
                    devolucion = prestamos.get(i); 
                    existeUsuario = true;                   
                    }
               }
           } while (!existeUsuario);
          return devolucion;
     }




     //MÉTODOS "LISTAR"
     public static void listarLibros(){
          if (!libros.isEmpty()) {
               System.out.println("Lista de libros");
               for (Libro Lib : libros) {
                   System.out.println(Lib);
               }
           } else {
               System.out.println("No existen libros en la lista");
           }    
     }
 
     public static void listarAutor(){
          if (!autores.isEmpty()) {
               System.out.println("Lista de autores");
               for (Autor Aut : autores) {
                   System.out.println(Aut);
               }
           } else {
               System.out.println("No existen autores en la lista");
           }    
     }

     public static void listarPrestamos(){
          if (!prestamos.isEmpty()) {
               System.out.println("Lista de prestamos");
               for (Prestamo pres : prestamos) {
                   System.out.println(pres);
               }
           } else {
               System.out.println("No existen prestamos en la lista");
           }    
     }

     public static void listarDevoluciones(){
          if (!devoluciones.isEmpty()) {
               System.out.println("Lista de prestamos");
               for (Prestamo dev : devoluciones) {
                   System.out.println(dev);
               }
           } else {
               System.out.println("No existen prestamos en la lista");
           }    
     }

     public static ArrayList<Libro> buscarLibro(String filtro) {
          ArrayList<Libro> filtroLibros = new ArrayList<>();
          for (Libro lib : libros) {
              if (lib.getTitulo().equals(filtro)
                      || (lib.getAutor().nombreAutor).equals(filtro)
                      || lib.getIsbn().equals(filtro)
                      || lib.getCategoria().equals(filtro)) {
                  filtroLibros.add(lib);
              }
          }
          return filtroLibros;
      }


     private static void leer_lista_Usuarios() {
          try {
               BufferedReader lector = new BufferedReader(new FileReader(
                         "Lista_Usuarios.txt"));

               String linea = "";
               while ((linea = lector.readLine()) != null) {
                    String[] bloques = linea.split(",");
                    if (bloques.length == 2) {
                         String nombreUsuario = bloques[0];
                         String cedulaUsuario = bloques[1];
                         usuarios.add(new Usuario(nombreUsuario, cedulaUsuario));
                    }
               }
               lector.close();
          } catch (IOException e) {
               System.out.println("Error al leer el archivo " + e.getMessage());
          }
     }

     private static void leer_lista_Libros() {
          try {
               BufferedReader lector = new BufferedReader(new FileReader(
                         "Lista_Libros.txt"));

               String linea = "";
               while ((linea = lector.readLine()) != null) {
                    String[] bloques = linea.split(",");
                    if (bloques.length == 6) {
                         String titulo = bloques[0];
                         String nombreAutor = bloques[1];
                         String nacionalidadAutor = bloques[2];
                         Autor autor = new Autor(nombreAutor, nacionalidadAutor);
                         String isbn = bloques[3];
                         String categoria = bloques[4];
                         int ejemplares = Integer.parseInt(bloques[5]);
                         libros.add(new Libro(titulo, autor, isbn, categoria, ejemplares));
                    }
               }
               lector.close();
          } catch (IOException e) {
               System.out.println("Error al leer el archivo " + e.getMessage());
          }
     }

}