/*
Una interfaz es un contrato que define métodos que una clase debe
implementar. Todos los métodos son abstractos por defecto (excepto los default o static).
Se usa para definir comportamientos comunes que pueden compartir clases sin importar su jerarquía.
*/

public class Main {
    public static void main(String[] args) {
        Notificador email = new NotificadorEmail();
        Notificador app = new NotificadorApp();

        email.enviarAlerta("Puerta trasera abierta");
        app.enviarAlerta("Movimiento detectado en cámara 3");
    }
}
