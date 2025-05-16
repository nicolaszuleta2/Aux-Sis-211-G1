//Métodos (public static), paso de parámetros, retorno de valores.

import java.util.Scanner;

public class AreaCirculo {

    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double r = sc.nextDouble();
        double area = calcularArea(r);
        System.out.println("El área es: " + area);
        sc.close();
    }
}
