import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private String especialidad;
    private List<Paciente> pacientesAsignados;

    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientesAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void asignarPaciente(Paciente paciente) {
        pacientesAsignados.add(paciente);
    }

    public List<Paciente> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public void mostrarPacientes() {
        if (pacientesAsignados.isEmpty()) {
            System.out.println("No tiene pacientes asignados.");
        } else {
            System.out.println("Pacientes asignados:");
            for (Paciente p : pacientesAsignados) {
                System.out.println("- " + p.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especialidad: " + especialidad;
    }
}
