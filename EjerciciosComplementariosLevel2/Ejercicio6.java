import java.util.*;






public class Ejercicio6 {
    public static void main(String[] args) {
        Map<Integer, Integer> Diccionario = new HashMap<Integer, Integer>();
        
        
        Set<Empleado> lista = new HashSet<>();
        lista.add(new Empleado("Nombre", "Apellido", 40178924, 8, 340));
        lista.add(new Empleado("Aquiles", "Asdefg", 13574481, 4, 332));
        lista.add(new Empleado("Giovanni", "LoCelso", 35125823, 5, 310));
        lista.add(new Empleado("Lionel", "Messi", 4025325, 6, 456));
        lista.add(new Empleado("Lionel", "Scaloni", 41235678, 8, 440)); 

        for (Empleado emp : lista) {
            
            int sueldo = emp.getHorasTrabajadas() * emp.getValoPorHora();
            /*System.out.println(emp.nombre + " - " + emp.dni+" - "+sueldo);*/
            Diccionario.put(emp.getDni(), sueldo);
            
            
            
        }
        System.out.print(Diccionario);
        
    }

    
}

class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int horasTrabajadas;
    private int valoPorHora;

    public Empleado( String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valoPorHora = valorPorHora;
    }
    public int getDni() {
        return dni;
    }
    public int getValoPorHora() {
        return valoPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

        
        
    }
