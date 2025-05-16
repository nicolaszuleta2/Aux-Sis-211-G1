public class Paciente {
    private String nombre;
    private int edad;
    private Medico medicoAsignado;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.medicoAsignado = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void asignarMedico(Medico medico) {
        this.medicoAsignado = medico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad +
                (medicoAsignado != null ? ", Médico: " + medicoAsignado.getNombre() : ", Sin médico asignado");
    }
}
