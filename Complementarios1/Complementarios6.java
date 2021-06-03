/**
 * Complementarios6
 */
import java.util.Scanner;
public class Complementarios6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = 5;
        int potencia = 3;
        int resultado = multiplicacion(base, potencia);
        scan.close();
      
       System.out.println(resultado);

        
    }
        
    private static int multiplicacion(int x, int y)
    {   int res = x;
        for (int i = 1; i < y; i++) {
            
            res = res*x;
            
        }
        return res;
            
            
        }
    
    }
