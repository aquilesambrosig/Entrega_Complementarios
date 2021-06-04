import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {
      
        char seguir;
        List<String> ciudades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        
        do {
       
        
        
        agregar(ciudades);
    
    System.out.printf("¿Agregar otra ciudad (s/n)?: ");
    seguir = scan.next().charAt(0);}
while (seguir != 'n');

for (String ciudad: ciudades)  {
    System.out.println(ciudad);
    }
scan.close();
}
        

        
        public static List agregar(List ciudades){
            Scanner scan = new Scanner(System.in);
            List<String> c = ciudades;

            c.add(scan.nextLine());
            return c;
            


}
           
    
}
