// Para implementar una interfaz se usa la palabra reservada "implements".
public class NotificadorEmail implements Notificador {
    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("Enviando email: " + mensaje);
    }
}