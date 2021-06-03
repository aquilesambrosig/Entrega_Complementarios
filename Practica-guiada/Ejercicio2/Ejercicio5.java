import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        char seguir;


        Scanner scan = new Scanner(System.in);
       

        do{

        int a = scan.nextInt();
       

        for (int i = 1; i <= 10; i++) {
            System.out.println(a*i);
            
        }
        System.out.printf("¿Desea introducir otro número (s/n)?: ");
        seguir = scan.next().charAt(0);
        
    }
   while(seguir != 'n');
   scan.close();
    }
    
}

