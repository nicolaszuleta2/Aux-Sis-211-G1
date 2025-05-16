/*
La palabra reservada "super" es una referencia especial e implícita, que
permite acceder a miembros (atributos y métodos) de la superclase desde la subclase.
Se usa también para llamar al constructor de la superclase desde la subclase.
*/

public class Main {
    public static void main(String[] args) {
        Gato miGato = new Gato();
        miGato.mostrarInfo();
        miGato.hacerSonido();
    }
}