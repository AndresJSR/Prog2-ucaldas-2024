import java.sql.Date;

public class Prestamo {
    Libro libro;
    Usuario usuario;
    Date fechaPrestamo;
    Date fechaDevolucion;
    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    public boolean isEmpty(){
        return libro.getTitulo().isEmpty();
    }




    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    @Override
    public String toString() {
        return "Prestamo [libro=" + libro + ", usuario=" + usuario + ", fechaPrestamo=" + fechaPrestamo
                + ", fechaDevolucion=" + fechaDevolucion + "]";
    }
    
}
