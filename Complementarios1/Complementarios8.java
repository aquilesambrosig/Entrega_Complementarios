import java.util.Scanner;

public class Complementarios8 {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        char seguir;


        do {
        System.out.printf("Nombre: ");
            String Nombre = scan.nextLine();
        System.out.printf("Edad: ");
            String Edad = scan.nextLine();
        System.out.printf("Dirección: ");    
            String Direccion = scan.nextLine();
        System.out.printf("Ciudad: ");
            String Ciudad = scan.nextLine();
        imprimirNumero(Nombre, Edad, Direccion, Ciudad);
        System.out.printf("¿Desea repetir la operación (s/n)?: ");
        seguir = scan.next().charAt(0);
       
        }
        while (seguir != 'n');
    }

    public static void imprimirNumero(String Nombre, String Edad, String Direccion, String Ciudad) {
        
        
        System.out.println(Nombre+" - "+Edad+" - "+Direccion+" - "+Ciudad);
      
        
    
    }
}
