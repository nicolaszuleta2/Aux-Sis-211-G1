//Entradas del usuario y operadores.

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = x.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = x.nextInt();
        int suma = a + b;
        System.out.println("La suma es: " + suma);
        x.close();
    }
}
