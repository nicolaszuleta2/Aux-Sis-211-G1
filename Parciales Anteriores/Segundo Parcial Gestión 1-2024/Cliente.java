// Cliente.java
public class Cliente {
    private String nombre;
    private String ci;

    public Cliente() {
        // Constructor por defecto
    }

    public Cliente(String nombre, String ci) {
        setNombre(nombre);
        setCi(ci);
    }

    public void setCi(String ci) {
        if (ci == null || ci.trim().isEmpty()) {
            throw new IllegalArgumentException("La cédula no puede estar vacía");
        }
        this.ci = ci.trim();
    }

    public String getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (CI: " + ci + ")";
    }
}
