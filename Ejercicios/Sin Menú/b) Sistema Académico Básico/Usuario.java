public abstract class Usuario {
    protected String nombre;
    protected String id;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract void mostrarInfo();
}
