// Ejemplo de polimorfismo en tiempo de ejecución usando un array[]
public class Main {
    public static void main(String[] args) {
        // Array polimórfico
        Documento[] documentos = new Documento[3];
        documentos[0] = new PDF();
        documentos[1] = new Word();
        documentos[2] = new Excel();

        // Polimorfismo: se ejecuta el método correspondiente al tipo real
        for (Documento doc : documentos) {
            doc.abrir();
        }
    }
}
