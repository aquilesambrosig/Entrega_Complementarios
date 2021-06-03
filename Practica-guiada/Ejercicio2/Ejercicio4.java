import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        char seguir;

        

        do {int dia = scan.nextInt();
            switch (dia) {

            

            case 1:
                System.out.println("Lunes");
                
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles"); 
                break;
            case 4:
                System.out.println("Jueves");  
                break;
            case 5:
                System.out.println("Viernes"); 
                 break;
            case 6:
                System.out.println("Sabaduki");
                  break;
            case 7:
                System.out.println("Domingol"); 
                 break;

            default:
        
        }
        System.out.printf("¿Desea introducir otro número (s/n)?: ");
        seguir = scan.next().charAt(0);
                           }
        while (seguir != 'n');
    }

}

