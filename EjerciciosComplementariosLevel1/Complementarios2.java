import java.util.Scanner;
public class Complementarios2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int multiplicacion = num1*num2;
        int suma = num1+num2;
        int resta = num1-num2;
        int division = num1/num2;
        int modulo = num1 % num2;

        scan.close();
      
       System.out.printf("%d + %d = %d %n",num1,num2, suma);
       System.out.printf("%d - %d = %d %n",num1,num2, resta);

       System.out.printf("%d * %d = %d %n",num1,num2, multiplicacion);
       System.out.printf("%d / %d = %d %n",num1,num2, division);
       System.out.printf("%d // %d = %d %n",num1,num2, modulo);
    }
        
      
}
