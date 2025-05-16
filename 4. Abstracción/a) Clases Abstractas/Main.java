/*
Una clase abstracta es una clase que no se puede instanciar directamente, y puede
tener métodos abstractos (sin cuerpo) y métodos normales (con implementación).
Se usa para definir una base común para las clases hijas.
Los métodos abstractos deben ser implementados por las subclases.
*/

public class Main {
    public static void main(String[] args) {
        TransportePublico t = new Bus("102");
        t.iniciarRuta();   // Bus de la línea 102 ha iniciado su ruta.
        t.detener();       // El vehículo de la línea 102 se ha detenido.
    }
}
