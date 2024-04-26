import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

public class RegistroCitas {
    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Especialidad> especialidades = new ArrayList<>();
    static ArrayList<Cita> citas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        leer_lista_Pacientes();
        for (Paciente pacie : pacientes) {
            System.out.println(pacie);
        }
        leer_lista_Medicos();
        listarMedicos();
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("\nRegistro de citas");
            System.out.println("[1] Registrar paciente");
            System.out.println("[2] Registrar medico");
            System.out.println("[3] Registrar especialidad");
            System.out.println("[4] Registrar cita");
            System.out.println("[5] Buscar citas");
            System.out.println("[6] Salir\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //registrarPaciente(crearPaciente());
                    //listarPacientes();
                    break;
                case 2:
                    //registrarMedico(crearMedico());
                    //listarMedicos();
                    break;
                case 3:
                    //listarEspecialidades(especialidades);
                    //registrarEspecialidad(crearEspecialidad());
                    //listarEspecialidades(especialidades);
                    break;
                case 4:
                    listarCitas(citas);
                    registrarCita(crearCita());
                    listarCitas(citas);
                    break;
                case 5:
                    System.out.println("Seleccione una opción de busqueda");
                    System.out.println("[1] Busqueda por la cédula del paciente ");
                    System.out.println("[2] Busqueda por código del médico");
                    System.out.println("[3] Busqueda por especialidad");
                    System.out.println("[4] Busqueda por fecha de la cita");
                    System.out.println("[5] listar medico en específico por las tardes");
                    System.out.println("[6] Salir");
                    int resp = sc.nextInt();
                    sc.nextLine();
                    switch (resp) {
                        case 1:
                            //System.out.println("Cedula del paciente");
                            //String nombreFiltro = sc.nextLine();
                            //listarCitas(buscarCita(nombreFiltro));
                            //break;
                        case 2://

                            //System.out.println("Codigo del medico");
                            //String codigoFiltro = sc.nextLine();
                            //System.out.println(buscarCita(codigoFiltro));
                            break;
                        case 3:
                            //System.out.println("Especialidad");
                            //String especialidadFiltro = sc.nextLine();
                            //System.out.println(buscarCita(especialidadFiltro));
                        case 4:
                            System.out.println("Fecha de la cita");
                            String fechaFiltro = sc.nextLine();
                            System.out.println(buscarCita(fechaFiltro));
                            break;
                            case 5:
                            
                            System.out.println("Nombre del medico");
                            String nombreMedicoFiltro = sc.nextLine();
                            System.out.println(buscarCita(nombreMedicoFiltro));
                            listarMedicosTardes();
                                break;
                            case 6: 
                            break;
                        }
                    break;
            }
        } while (opcion != 6);

    }

    // SE CREA EL REGISTRO DEL PACIENTE
    public static void registrarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // SE CREA EL PACIENTE
    public static Paciente crearPaciente() {
        sc.nextLine();
        System.out.println("Ingrese el nombre del paciente");
        String nombrePaciente = sc.nextLine();
        System.out.println("Ingrese la cedula del paciente");
        String cedulaPaciente = sc.nextLine();
        System.out.println("Ingrese el teléfono del paciente");
        String telefonoPaciente = sc.nextLine();
        System.out.println("Ingrese la dirección del paciente");
        String direccionPaciente = sc.nextLine();
        return new Paciente(nombrePaciente, cedulaPaciente, telefonoPaciente, direccionPaciente);
    }

    // SE CREA EL REGISTRO DEL MEDICO
    public static void registrarMedico(Medico medico) {
        medicos.add(medico);
    }

    // SE CREA EL MÉDICO
    public static Medico crearMedico() {
        sc.nextLine();
        System.out.println("Ingrese el nombre del médico");
        String nombreMedico = sc.nextLine();
        System.out.println("Ingrese la especialidad");
        System.out.println("Ingrese el nombre de la especialidad");
        String nombreEspecialidad = sc.nextLine();
        System.out.println("Ingrese la descripción de la especialidad");
        String descripcionEspecialidad = sc.nextLine();
        Especialidad especialidad = new Especialidad(nombreEspecialidad, descripcionEspecialidad);
        System.out.println("Ingrese el codigo del medico");
        String codigoMedico = sc.nextLine();
        return new Medico(nombreMedico, especialidad, codigoMedico);
    }

    // SE CREA EL REGISTRO DE LA ESPECIALIDAD
    public static void registrarEspecialidad(Especialidad especialidad) {
        especialidades.add(especialidad);
    }

    // SE CREA LA ESPECIALIDAD

    public static Especialidad crearEspecialidad() {
        sc.nextLine();
        System.out.println("Ingrese el nombre de la especialidad");
        String nombreEspecialidad = sc.nextLine();
        System.out.println("Ingrese la descripición de la especialidad");
        String descripcionEspecialidad = sc.nextLine();
        return new Especialidad(nombreEspecialidad, descripcionEspecialidad);
    }

    // SE CREA EL REGISTRO DE LA CITA
    public static void registrarCita(Cita cita) {
        citas.add(cita);
    }

    public static Cita crearCita() {
        listarPacientes();
        Paciente paciente = new Paciente(null, null, null, null);
        String cedulaPaciente;
        boolean existePaciente = false;

        sc.nextLine();
        do {
            System.out.println("Ingrese la cédula del paciente ");
            cedulaPaciente = sc.nextLine();

            for (int i = 0; i < pacientes.size(); i++) {
                if (pacientes.get(i).cedulaPaciente.equals(cedulaPaciente)) {
                    System.out.println("Nombre = " + pacientes.get(i).nombrePaciente + " Cedula =  "
                            + pacientes.get(i).cedulaPaciente + "Dirección = " + pacientes.get(i).direccion
                            + " Telefono = " + pacientes.get(i).telefonoPaciente);
                    paciente = pacientes.get(i);
                    existePaciente = true;
                }
            }
            if (!existePaciente) {
                System.out.println("Esta cédula no existe. Ingresela de nuevo");
            }
        } while (!existePaciente);
        listarMedicos();
        Medico medico = new Medico();
        String codigoMedico;
        boolean existeMedico = false;
        do {
            System.out.println("Ingrese el código del médico");
            codigoMedico = sc.nextLine();
            for (int i = 0; i < medicos.size(); i++) {
                if (medicos.get(i).codigoMedico.equals(codigoMedico)) {
                    System.out.println("Nombre = " + medicos.get(i).nombreMedico + " Especialidad =  "
                            + medicos.get(i).especialidad + "Código = " + medicos.get(i).codigoMedico);
                    existeMedico = true;
                    medico = medicos.get(i);
                }
            }
        } while (!existeMedico);
        Date fechaCita;
        System.out.println("Ingrese el año");
        int año = sc.nextInt();
        System.out.println("Ingrese el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        fechaCita = new Date(año - 1900, mes - 1, dia);
        String horaCita;
        System.out.println("Ingrese la hora de la cita [Ej: 9:10]");
        horaCita = sc.next();
        String estado = "Pendiente";

        return new Cita(paciente, medico, fechaCita, horaCita, estado);
    }

    public static void listarMedicosTardes() {
        
        if (!citas.isEmpty()) {
            System.out.println("Lista de citas");
            System.out.println("Ingrese el nombre del medico");
                String medico = sc.nextLine();
            for (int i = 0; i < citas.size(); i++) {
                if(citas.get(i).getMedico().getNombreMedico().equals(medico)){
                medico=citas.get(i).getMedico().getNombreMedico();
                System.out.println(medico);
                }
            }
        } else {
            System.out.println("No existen medicos en la lista");
        }
    }

    public static void listarPacientes() {
        if (!pacientes.isEmpty()) {
            System.out.println("Lista de pacientes");
            for (Paciente pacie : pacientes) {
                System.out.println(pacie);
            }
        } else {
            System.out.println("No existen pacientes en la lista");
        }
    }

    public static void listarMedicos() {
        if (!medicos.isEmpty()) {
            System.out.println("Lista de medicos");
            for (Medico medi : medicos) {
                System.out.println(medi);
            }
        } else {
            System.out.println("No existen medicos en la lista");
        }
    }

    public static void listarEspecialidades(ArrayList<Especialidad> listaEspecialidades) {
        if (!listaEspecialidades.isEmpty()) {
            System.out.println("Lista de especialidades");
            for (Especialidad esp : listaEspecialidades) {
                System.out.println("Nombre de la especialidad: " + esp.getNombreEspecialidad()
                        + ", Descripción de la especialidad: " + esp.getDescripcionEspecialidad());
            }
        } else {
            System.out.println("No existen especialidades en la lista");
        }
    }

    public static void listarCitas(ArrayList<Cita> listaCitas) {
        if (!listaCitas.isEmpty()) {
            System.out.println("Lista de citas");
            for (Cita cit : listaCitas) {
                System.out.println(cit);
            }
        } else {
            System.out.println("No existen citas en la lista");
        }
    }

    public static ArrayList<Cita> buscarCita(String filtro) {
        ArrayList<Cita> filtrocita = new ArrayList<>();
        for (Cita cit : citas) {
            if (cit.getPaciente().getCedulaPaciente().equals(filtro)
                    || (cit.getMedico()).getCodigoMedico().equals(filtro)
                    || cit.medico.getEspecialidad().getNombreEspecialidad().equals(filtro)
                    || (String.valueOf(cit.getFechaCita().getDay()).equals(filtro)
                            && String.valueOf(cit.getFechaCita().getMonth()).equals(filtro)
                            && String.valueOf(cit.getFechaCita().getYear()).equals(filtro))) {
                filtrocita.add(cit);
            }
        }
        return filtrocita;
    }
    public static ArrayList<Medico> buscarMedico(String filtro) {
        ArrayList<Medico> medicosFiltro = new ArrayList<>();
        for (Medico med : medicos) {
            if ((med.getNombreMedico()).equals(filtro)) {
                medicosFiltro.add(med);
            }
        }
        return medicosFiltro;
    }

    private static void leer_lista_Pacientes() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(
                    "Lista_Pacientes.txt"));

            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {
                    String nombrePaciente = bloques[0];
                    String cedulaPaciente = bloques[1];
                    String telefonoPaciente = bloques[2];
                    String direccionPaciente = bloques[3];
                    Paciente paciente = new Paciente(nombrePaciente, cedulaPaciente, telefonoPaciente,
                            direccionPaciente);
                    pacientes.add(new Paciente(nombrePaciente, cedulaPaciente, telefonoPaciente, direccionPaciente));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

    private static void leer_lista_Medicos() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(
                    "Lista_Medicos.txt"));

            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {
                    String nombreMedico = bloques[0];
                    String nombreEspecialidad = bloques[1];
                    String descripcioneEspecialidad = bloques[2];
                    Especialidad especialidad = new Especialidad(nombreEspecialidad, descripcioneEspecialidad);
                    String codigoMedico = bloques[3];
                    medicos.add(new Medico(nombreMedico, especialidad, codigoMedico));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }

}
