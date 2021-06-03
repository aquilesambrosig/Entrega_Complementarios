import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
     
        List<String> baraja = Arrays.asList("Acuña", "Gomez", "Lo Celso", "Messi", "Aguero", "Armani", "Correa", "Buendia", "Alario", "Scaloni", "Otamendi", "Paredes");
        List<String> curso1List = baraja.subList(0,4);
        List<String> curso2List = baraja.subList(4,8);
        List<String> curso3List = baraja.subList(8,12);

        System.out.println("Curso1: " + curso1List);
        System.out.println("Curso2: " + curso2List);
        System.out.println("Curso3: "+ curso3List);


    
}
}