public class Empleado {
    int dni;
    String nombre;
    String apellido;
    int horasTrabajadas;
    int valoPorHora;

    public Empleado( String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valoPorHora = valorPorHora;
        
    }
}