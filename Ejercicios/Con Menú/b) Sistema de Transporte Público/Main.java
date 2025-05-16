import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<VehiculoPublico> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ TRANSPORTE PÚBLICO ---");
            System.out.println("1. Registrar Bus");
            System.out.println("2. Registrar Minibús");
            System.out.println("3. Registrar Trufi");
            System.out.println("4. Mostrar vehículos registrados");
            System.out.println("5. Ver total de vehículos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Placa: ");
                    String placaBus = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capBus = sc.nextInt();
                    lista.add(new Micro(placaBus, capBus));
                    break;

                case 2:
                    System.out.print("Placa: ");
                    String placaMini = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capMini = sc.nextInt();
                    lista.add(new Minibus(placaMini, capMini));
                    break;

                case 3:
                    System.out.print("Placa: ");
                    String placaTrufi = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capTrufi = sc.nextInt();
                    lista.add(new Trufi(placaTrufi, capTrufi));
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        for (VehiculoPublico v : lista) {
                            v.mostrarInfo();
                            System.out.println("-----------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total de vehículos registrados: " + VehiculoPublico.getContadorVehiculos());
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
