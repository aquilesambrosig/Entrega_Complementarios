import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char seguir;

        do {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println("El numero es: " + a);
        System.out.println("El numero es: " + b);
        System.out.println("El numero es: " + c);
        
    System.out.printf("¿Desea repetir la operación (s/n)?: ");
    seguir = scan.next().charAt(0);
    }
    while (seguir != 'n');
    scan.close();

    }
    
}