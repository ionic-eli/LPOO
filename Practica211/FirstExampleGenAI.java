class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String matricula;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

public class FirstExampleGenAI {
    public static void main(String[] args) {
        // Crear objetos de Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        // Asignar valores con setters
        estudiante1.setNombre("Carlos");
        estudiante1.setEdad(20);
        estudiante1.setMatricula("A123");

        estudiante2.setNombre("María");
        estudiante2.setEdad(22);
        estudiante2.setMatricula("B456");

        estudiante3.setNombre("Luis");
        estudiante3.setEdad(21);
        estudiante3.setMatricula("C789");

        // Mostrar los valores con getters
        System.out.println("Estudiante 1: " + estudiante1.getNombre() + ", " + estudiante1.getEdad() + ", " + estudiante1.getMatricula());
        System.out.println("Estudiante 2: " + estudiante2.getNombre() + ", " + estudiante2.getEdad() + ", " + estudiante2.getMatricula());
        System.out.println("Estudiante 3: " + estudiante3.getNombre() + ", " + estudiante3.getEdad() + ", " + estudiante3.getMatricula());
    }
}