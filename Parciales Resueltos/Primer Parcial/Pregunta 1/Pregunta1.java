import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a,b;
        a = x.nextInt();
        b = x.nextInt();
        int mayor = a;
        if(b>a)
            mayor=b;
        System.out.println(mayor);
        x.close();
    }
}
