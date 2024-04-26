import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ImplementacionContenedor instContenedor = new ImplementacionContenedor();
        ArrayList<Estudiante> listaEstudiantes = instContenedor.obtenerEstudiantes();
    for (Estudiante estudiante : listaEstudiantes) {
        System.out.println("[ Nombre del estudiante : "+estudiante.getNombre()+ " ]" + " [ Código del estudiante :  "+ estudiante.getCodigoEstudiante()+" ]");   
    }
    }

}