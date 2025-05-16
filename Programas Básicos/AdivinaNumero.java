//Uso de while, Random, lógica condicional.

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random rand = new Random();
        int secreto = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int intento;

        do {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("Muy bajo");
            } else if (intento > secreto) {
                System.out.println("Muy alto");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != secreto);
        
        sc.close();
    }
}

