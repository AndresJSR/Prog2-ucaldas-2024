/*Crear un programa para gestionar la lista de tareas del día a día.
Una tarea tiene la siguiente información:
Nombre de la tarea
Duración
Persona encargada
Estado ["Activa", "En desarrollo", "Realizada"]

La lista debe contener al menos 5 tareas.
*/
public class Exercise5 {
    public String nombre_tarea;
    public Integer duracionHoras;
    public Integer duracionMin;
    public String persona_encargada;
    public String estado;

    public Exercise5(String nombre_tarea_param, Integer duracionHoras_param, Integer duracionMin_param, String persona_encargada_param, String estado_param) {
        this.nombre_tarea = nombre_tarea_param;
        this.duracionHoras = duracionHoras_param;
        this.duracionMin = duracionMin_param;
        this.persona_encargada = persona_encargada_param;
        this.estado = estado_param;
    }

    public Exercise5(String nombre_tarea_param) {
        this.nombre_tarea = nombre_tarea_param;
    }

    public Exercise5() {
    }

    public String getnombre_tarea() {
        return nombre_tarea;
    }

    public void setnombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public Integer getduracionHoras() {
        return duracionHoras;
    }

    public void setduracionHoras(Integer duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
    public Integer getduracion() {
        return duracionMin;
    }

    public void setduracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }
    public String getpersona_encargada() {
        return persona_encargada;
    }

    public void setpersona_encargada(String persona_encargada) {
        this.persona_encargada = persona_encargada;
    }
    public String getestado (){
        return estado;
    }
    public void setestado(String estado){
        this.estado = estado;
    }
}