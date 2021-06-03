import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char seguir;


        do {
        int nota = scan.nextInt();
       
        
        if (nota>=92) {
            System.out.println("Excelente");
        }
        else if (nota >= 85) {
            System.out.println("Sobresaliente");
             }
        else if (nota>=75) {
            System.out.println("Distinguido");
        }
        else if (nota>=60) {
            System.out.println("Bien");

        }   
        else {
            System.out.println("Desaprobado");
        } 
        System.out.printf("¿Desea introducir otro número (s/n)?: ");
        seguir = scan.next().charAt(0);
    }
    while (seguir != 'n');
    scan.close();

    }
}