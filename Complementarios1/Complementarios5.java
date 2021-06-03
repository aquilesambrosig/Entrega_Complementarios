/**
 * Complementarios5
 */
import java.util.Scanner;
public class Complementarios5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 5;
        int num2 = 6;
        int resultado = multiplicacion(num1, num2);
        scan.close();
      
       System.out.println(resultado);

        
    }
        
    private static int multiplicacion(int x, int y)
    {   int res = y;
        for (int i = 1; i < x; i++) {
            
            res = res + y;
            
        }
        return res;
            
            
        }
    
    }
