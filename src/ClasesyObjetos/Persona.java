package ClasesyObjetos;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre de la persona es: " + this.nombre);
        System.out.println("La edad de la persona es: " + this.edad);
    }
}