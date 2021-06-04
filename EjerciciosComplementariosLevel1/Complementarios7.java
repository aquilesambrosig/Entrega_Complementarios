import java.util.Scanner;

/**
 * Complementarios7
 */

public class Complementarios7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        
        scan.close();
      
       printLowerCase(a);
    }
    
    public static void printLowerCase(String a){
        for(char ch: a.toCharArray()) {
           if(ch >= 'a' && ch <= 'z')
              ch += 'A' - 'a';
           System.out.print(ch);
        }
    }


}
