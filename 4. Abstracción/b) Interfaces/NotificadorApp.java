// Para implementar una interfaz se usa la palabra reservada "implements".
public class NotificadorApp implements Notificador {
    @Override
    public void enviarAlerta(String mensaje) {
        System.out.println("Notificación en la app: " + mensaje);
    }
}