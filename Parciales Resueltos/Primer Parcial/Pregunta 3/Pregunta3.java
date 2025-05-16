import java.util.ArrayList;
import java.util.Scanner;

public class Pregunta3 {

    public static ArrayList <Estudiante> listaEstudiantes = new ArrayList<>();
    public static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        do{
        System.out.println("1.- Registrar Estudiante");
        System.out.println("2.- Listar Estudiantes");
        System.out.println("3.- Listar el mejor promedio");
        System.out.println("4.- Salir");
        opcion=x.nextInt();
        switch(opcion){
            case 1:
                Registrar();
                break;
            case 2:
                Listar();
                break;
            case 3:
                Promedio();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
        }
        while(opcion!=4);
    }
    
    public static void Registrar(){
        System.out.println("Introduzca el Nombre:");
        x.nextLine();
        String nombre = x.nextLine();
        System.out.println("Introduzca el CI:");
        String CI = x.nextLine();
        System.out.println("Introduzca los 3 parciales:");
        double p1 = x.nextDouble();
        double p2 = x.nextDouble();
        double p3 = x.nextDouble();
        Estudiante estudiante = new Estudiante(nombre, CI, p1, p2, p3);
        listaEstudiantes.add(estudiante);
    }
    
    public static void Listar(){
        int i = 1;
        for(Estudiante u : listaEstudiantes){
            System.out.println("---------------------------");
            System.out.println("Estudiante N"+i);
            System.out.println("Nombre: "+ u.getNombre());
            System.out.println("CI: "+ u.getCI());
            System.out.println("Primer Parcial: "+ u.getP1());
            System.out.println("Segundo Parcial: "+ u.getP2());
            System.out.println("Tercer Parcial: "+ u.getP3());
            System.out.println("----------------------------");
            i++;
        }
    
    }
    
    public static void Promedio(){
        Estudiante control = null;
        double mayor = 0;
        for(Estudiante u : listaEstudiantes){
            double promedio = (u.getP1()+u.getP2()+u.getP3())/3;
            if(promedio>mayor){
                mayor=promedio;
                control = u;
            }
        }
        
        System.out.println("El mejor promedio es: " + mayor);
        System.out.println("Perteniciente al estudiante: "+ control.getNombre() + " " + control.getCI());
    }
    
}
