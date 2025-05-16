/*
Sobrecarga de métodos (Overloading), es cuando en una misma clase hay métodos
con el mismo nombre, pero con distintos parámetros (tipo, número o ambos).
Esto se resuelve en tiempo de compilación y no requiere herencia.
*/

public class Main {
    public static void main(String[] args) {
        Sumas suma = new Sumas();

        System.out.println(suma.sumar(2, 3));       // 5
        System.out.println(suma.sumar(1, 2, 3));  // 6
        System.out.println(suma.sumar(2.5, 3.5));   // 6.0
    }
}
