import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Colaborador> lista = new ArrayList<>();
        int opcion, id = 1;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Gerente");
            System.out.println("2. Registrar Técnico");
            System.out.println("3. Registrar Pasante");
            System.out.println("4. Mostrar colaboradores");
            System.out.println("5. Ver total registrados");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nG = scanner.nextLine();
                    System.out.print("Salario base: ");
                    double sbG = scanner.nextDouble();
                    System.out.print("Bono extra: ");
                    double bono = scanner.nextDouble();
                    lista.add(new Gerente(nG, id++, sbG, bono));
                    break;

                case 2:
                    System.out.print("Nombre: ");
                    String nT = scanner.nextLine();
                    System.out.print("Salario base: ");
                    double sbT = scanner.nextDouble();
                    System.out.print("Proyectos completados: ");
                    int p = scanner.nextInt();
                    lista.add(new Tecnico(nT, id++, sbT, p));
                    break;

                case 3:
                    System.out.print("Nombre: ");
                    String nP = scanner.nextLine();
                    lista.add(new Pasante(nP, id++));
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("No hay colaboradores registrados.");
                    } else {
                        for (Colaborador c : lista) {
                            c.mostrarInformacion();
                            System.out.println("Salario total: " + c.calcularSalario());
                            System.out.println("------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total registrados: " + Colaborador.getContadorColaboradores());
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
