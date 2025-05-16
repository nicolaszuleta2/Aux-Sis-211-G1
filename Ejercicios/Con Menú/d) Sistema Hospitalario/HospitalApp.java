import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Medico> medicos = new ArrayList<>();
        List<Paciente> pacientes = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Menú Médico");
            System.out.println("2. Menú Paciente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    menuMedico(sc, medicos);
                    break;
                case 2:
                    menuPaciente(sc, medicos, pacientes);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }

    static void menuMedico(Scanner sc, List<Medico> medicos) {
        boolean volver = false;

        while (!volver) {
            System.out.println("\n--- MENÚ MÉDICO ---");
            System.out.println("1. Registrar médico");
            System.out.println("2. Ver lista de médicos");
            System.out.println("3. Ver pacientes de un médico");
            System.out.println("4. Eliminar médico");
            System.out.println("5. Actualizar datos del médico");
            System.out.println("6. Volver");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del médico: ");
                    String nombre = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();
                    medicos.add(new Medico(nombre, especialidad));
                    System.out.println("Médico registrado.");
                    break;
                case 2:
                    if (medicos.isEmpty()) {
                        System.out.println("No hay médicos registrados.");
                    } else {
                        System.out.println("--- Lista de Médicos ---");
                        for (Medico m : medicos) {
                            System.out.println(m);
                        }
                    }
                    break;
                case 3:
                    if (medicos.isEmpty()) {
                        System.out.println("No hay médicos registrados.");
                    } else {
                        for (int i = 0; i < medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i).getNombre());
                        }
                        System.out.print("Seleccione el médico: ");
                        int idx = sc.nextInt() - 1;
                        sc.nextLine();
                        if (idx >= 0 && idx < medicos.size()) {
                            medicos.get(idx).mostrarPacientes();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 4:
                    if (medicos.isEmpty()) {
                        System.out.println("No hay médicos registrados.");
                    } else {
                        for (int i = 0; i < medicos.size(); i++) {
                            System.out.println((i + 1) + ". " + medicos.get(i).getNombre());
                        }
                        System.out.print("Seleccione el médico a eliminar: ");
                        int idx = sc.nextInt() - 1;
                        sc.nextLine();
                        if (idx >= 0 && idx < medicos.size()) {
                            medicos.remove(idx);
                            System.out.println("Médico eliminado.");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;
                case 5:
                    if (medicos.isEmpty()) {
                        System.out.println("No hay médicos.");
                        break;
                    }
                    for (int i = 0; i < medicos.size(); i++) {
                        System.out.println((i + 1) + ". " + medicos.get(i).getNombre());
                    }
                    System.out.print("Seleccione el médico a actualizar: ");
                    int idxEdit = sc.nextInt() - 1;
                    sc.nextLine();
                    if (idxEdit >= 0 && idxEdit < medicos.size()) {
                        Medico m = medicos.get(idxEdit);
                        System.out.print("Nuevo nombre (" + m.getNombre() + "): ");
                        String nuevoNombre = sc.nextLine();
                        System.out.print("Nueva especialidad (" + m.getEspecialidad() + "): ");
                        String nuevaEsp = sc.nextLine();
                        m.setNombre(nuevoNombre);
                        m.setEspecialidad(nuevaEsp);
                        System.out.println("Datos actualizados.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 6:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    static void menuPaciente(Scanner sc, List<Medico> medicos, List<Paciente> pacientes) {
    boolean volver = false;

    while (!volver) {
        System.out.println("\n--- MENÚ PACIENTE ---");
        System.out.println("1. Registrar paciente");
        System.out.println("2. Ver lista de pacientes");
        System.out.println("3. Asignar médico a paciente");
        System.out.println("4. Actualizar datos de paciente");
        System.out.println("5. Eliminar paciente");
        System.out.println("6. Volver");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Nombre del paciente: ");
                String nombre = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();
                pacientes.add(new Paciente(nombre, edad));
                System.out.println("Paciente registrado.");
                break;

            case 2:
                if (pacientes.isEmpty()) {
                    System.out.println("No hay pacientes registrados.");
                } else {
                    System.out.println("--- Lista de Pacientes ---");
                    for (int i = 0; i < pacientes.size(); i++) {
                        System.out.println((i + 1) + ". " + pacientes.get(i));
                    }
                }
                break;

            case 3:
                if (pacientes.isEmpty() || medicos.isEmpty()) {
                    System.out.println("Debe haber pacientes y médicos registrados.");
                    break;
                }
                for (int i = 0; i < pacientes.size(); i++) {
                    System.out.println((i + 1) + ". " + pacientes.get(i).getNombre());
                }
                System.out.print("Seleccione paciente: ");
                int idxPaciente = sc.nextInt() - 1;
                sc.nextLine();

                if (idxPaciente < 0 || idxPaciente >= pacientes.size()) {
                    System.out.println("Índice inválido.");
                    break;
                }

                for (int i = 0; i < medicos.size(); i++) {
                    System.out.println((i + 1) + ". " + medicos.get(i).getNombre());
                }
                System.out.print("Seleccione médico: ");
                int idxMedico = sc.nextInt() - 1;
                sc.nextLine();

                if (idxMedico < 0 || idxMedico >= medicos.size()) {
                    System.out.println("Índice inválido.");
                    break;
                }

                Paciente pacienteSeleccionado = pacientes.get(idxPaciente);
                Medico medicoSeleccionado = medicos.get(idxMedico);
                pacienteSeleccionado.asignarMedico(medicoSeleccionado);
                medicoSeleccionado.asignarPaciente(pacienteSeleccionado);
                System.out.println("Médico asignado.");
                break;

            case 4:
                if (pacientes.isEmpty()) {
                    System.out.println("No hay pacientes.");
                    break;
                }
                for (int i = 0; i < pacientes.size(); i++) {
                    System.out.println((i + 1) + ". " + pacientes.get(i).getNombre());
                }
                System.out.print("Seleccione paciente a actualizar: ");
                int idxEdit = sc.nextInt() - 1;
                sc.nextLine();

                if (idxEdit < 0 || idxEdit >= pacientes.size()) {
                    System.out.println("Índice inválido.");
                    break;
                }

                Paciente p = pacientes.get(idxEdit);
                System.out.print("Nuevo nombre (" + p.getNombre() + "): ");
                String nuevoNombre = sc.nextLine();
                System.out.print("Nueva edad (" + p.getEdad() + "): ");
                int nuevaEdad = sc.nextInt();
                sc.nextLine();
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                System.out.println("Datos actualizados.");
                break;

            case 5:
                if (pacientes.isEmpty()) {
                    System.out.println("No hay pacientes.");
                    break;
                }
                for (int i = 0; i < pacientes.size(); i++) {
                    System.out.println((i + 1) + ". " + pacientes.get(i).getNombre());
                }
                System.out.print("Seleccione paciente a eliminar: ");
                int idxDel = sc.nextInt() - 1;
                sc.nextLine();

                if (idxDel < 0 || idxDel >= pacientes.size()) {
                    System.out.println("Índice inválido.");
                    break;
                }

                pacientes.remove(idxDel);
                System.out.println("Paciente eliminado.");
                break;

            case 6:
                volver = true;
                break;

            default:
                System.out.println("Opción inválida.");
            }
        }
    }

}
