import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        int aux=0;
        for (int i=2; i<=a/2; i++){
            if(a%i==0){
                aux++;
                break;
            }
        }
        if(aux==0)
            System.out.println("SI");
        else
            System.out.println("NO");
        x.close();
    }    
}
