import java.util.Scanner;
public class Complementarios9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        
        scan.close();
        
      
       contador(entrada, 'a');
    }
    
    public static void contador(String entrada, Character x){
        
        int res= 0;

        for(char ch: entrada.toCharArray()) {
           if(ch == x)
              res = res+ 1;
           
        }
        System.out.print(res);
    }
    
}
