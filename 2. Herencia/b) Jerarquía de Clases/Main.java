/*
La jerarquía de clases es una estructura en la que una clase hereda de otra, formando una cadena
de relaciones padre-hijo. Una subclase puede heredar de una superclase que, a su vez, hereda de otra.
Esto es util ya que en Java no se permite herencia múltiple de clases (una clase solo puede extender de una única clase).
*/

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.respirar();        // método heredado de SerVivo
        miPerro.alimentarCrias();  // método heredado de Mamifero
        miPerro.ladrar();          // método propio
    }
}
