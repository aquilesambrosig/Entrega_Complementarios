import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
     
        List<Integer> numeros = new ArrayList<>(5);
        
        numeros.add(1);
        numeros.add(23);
        numeros.add(234);
        numeros.add(49);
        numeros.add(12);
        imprimir(numeros);
        System.out.println("-------------------AGREGO AL COMIENZO Y AL FINAL---------------");
        numeros.add(0, 66);
        numeros.add(99);
        imprimir(numeros);
        
        
}
public static void imprimir(List<Integer> numeros) {

    for (Integer n: numeros)  {
        System.out.println(n);
        }
    System.out.print("Tamaño de la lista: ");    
    System.out.println(numeros.size());
  
    
    }


}