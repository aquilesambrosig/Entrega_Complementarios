/**
 * Complementarios3
 */
import java.util.Scanner;
public class Complementarios3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        secuencia(num);
        scan.close();
      
         

        
    }
        
    private static void secuencia(int x)
    {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
             
            System.out.print(j);   
            }
            System.out.println();
            
            
        }
    
    }
}