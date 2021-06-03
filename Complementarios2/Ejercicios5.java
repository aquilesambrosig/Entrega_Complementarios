import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Ejercicios5 {

    
    public static void main(String[] args) {
        
     
        Integer[] horasTrabajadas = {6,7,8,4,5};
        Integer[] precioHora = {350,345,550,600,320};
        List<Integer> dias = new ArrayList<>();
        int total = 0;
        

        for (int i = 0; i < precioHora.length; i++) {
            
            int precioDia = precioHora[i] * horasTrabajadas[i];
            dias.add(precioDia);
            total = total + precioDia;

            
        }
        System.out.println(dias);
        System.out.println("Total final: $ "+total);
        
        
    }
        
    
}
