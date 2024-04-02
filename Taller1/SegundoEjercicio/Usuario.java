public class Usuario {
    String nombreUsuario;
    String cedulaUsuario;
    public Usuario(String nombreUsuario, String cedulaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getCedulaUsuario() {
        return cedulaUsuario;
    }
    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    @Override
    public String toString() {
        return "Usuario [nombreUsuario=" + nombreUsuario + ", cedulaUsuario=" + cedulaUsuario + "]";
    }
    
}
