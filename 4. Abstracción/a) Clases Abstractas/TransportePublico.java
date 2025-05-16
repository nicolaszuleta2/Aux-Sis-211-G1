// Para definir una clase abstracta se usa la palabra reservada "abstract"
public abstract class TransportePublico {
    protected String linea;

    public TransportePublico(String linea) {
        this.linea = linea;
    }

    // Método abstracto
    public abstract void iniciarRuta();

    public void detener() {
        System.out.println("El vehículo de la línea " + linea + " se ha detenido.");
    }
}
