import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    public static void main(String[] args) {
     
        
        int a = 1;
        int b =  6;
        fizzBuzzFuncion(a,b);
        System.out.print(fizzBuzzFuncion(a, b));
    }

        public static List fizzBuzzFuncion(int a, int b) {
            List<String> numeros = new ArrayList<>();
            
            for (int i = a; i < b; i++) {
                if ((i%2==0) && (i%3==0)) {numeros.add("FizzBuzz");}
                else if (i%2==0) { numeros.add("Fizz");}
                else if (i%3==0) {numeros.add("Buzz");}
                else {String num = String.valueOf(i);
                    numeros.add(num);}

                
                
                
            }
            return numeros;
            
        }
    
}
