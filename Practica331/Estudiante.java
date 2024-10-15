
import java.util.Scanner;

public class Estudiante extends Persona {

    private int matricula;
    private float promedio;
    private String email;

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public void setPromedio(float promedio) 
    {
        this.promedio = promedio;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public int getMatricula() 
    {
        return matricula;
    }

    public float getPromedio() 
    {
        return promedio;
    }

    public String getEmail() 
    {
        return email;
    }

    private void modificarMatricula(int nuevaMatricula) 
    {
        setMatricula(nuevaMatricula);
    }

    public void modificarDatos() 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una nueva matricula: ");
        modificarMatricula(scanner.nextInt());
        System.out.println("\nEsta es su nueva matricula: " + getMatricula());
    }
}