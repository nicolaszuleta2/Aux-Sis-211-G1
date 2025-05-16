//Búsqueda en arreglos(arrays).

import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número a buscar: ");
        int buscado = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                System.out.println("Número encontrado en la posición " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado.");
        }
        sc.close();
    }
}
