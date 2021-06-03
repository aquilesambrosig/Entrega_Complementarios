import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio3 {

    

    public static void main(String[] args) {
     
        List<String> baraja = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A");
        System.out.println(baraja);
        Collections.reverse(baraja);
        System.out.println(baraja);
        Collections.shuffle(baraja);
        System.out.println(baraja);
        
       
        
        
    }

    
    
}
    

