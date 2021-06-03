import java.util.Scanner;
public class Complementarios1 {

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        
        scan.close();
        
      
       holaMundo(usuario);
    }
    
    public static void holaMundo(String usuario){
        
      
        System.out.println("HOLA " + usuario);
    }
    
}
