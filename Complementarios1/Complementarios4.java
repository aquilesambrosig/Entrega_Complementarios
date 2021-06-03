import java.util.Scanner;

public class Complementarios4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resultado = factorial(num);
      
         

        System.out.printf("El factorial de %d es: %d", num, resultado);
    }
        
    private static int factorial(int x)
    {
        int res=x;
        if (x!=1) {
            res = res*factorial(x-1);
        }
        return res;
    
    }
}

