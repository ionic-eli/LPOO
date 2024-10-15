public class TestStudentClass
{
    public static void main(String[] args) 
    {
        // VERSION 1 = Sin setGet
        Estudiante student1 = new Estudiante(); // Creando una instancia de la clase Stud
        
        System.out.println("VERSIÓN 1 DEL EJERCICIO\n");
            // Ingresando los datos del primer alumno
        student1.setName(GetData.getStringFromUser("Ingresa el nombre del alumno:"));
        student1.setMatricula(GetData.getIntFromUser("Ingresa la matricula del alumno:"));
        student1.setProm(GetData.getFloatFromUser("Ingresa el promedio del alumno:"));

            // Imprimiendo los datos del primer alumno
        System.out.println("\nDatos del alumno");
        System.out.println(student1.getName());
        System.out.println(student1.getMatricula());
        System.out.println(student1.getProm() + "\n");
        
        Estudiante student2 = new Estudiante();

        // Ingresando los datos del segundo alumno
        student2.setName(GetData.getStringFromUser("Ingresa el nombre del alumno:"));
        student2.setMatricula(GetData.getIntFromUser("Ingresa la matricula del alumno:"));
        student2.setProm(GetData.getFloatFromUser("Ingresa el promedio del alumno:"));
            
            // Imprimiendo los datos del segundo 
        System.out.println("\nDatos del alumno");
        System.out.println(student2.getName());
        System.out.println(student2.getMatricula());
        System.out.println(student2.getProm() + "\n");

        // VERSION 2 = Sin setGet
        System.out.println("VERSIÓN 2 DEL EJERCICIO");

        Estudiante student3 = new Estudiante();

        System.out.println("\nDatos del alumno");
        student3.setGet(GetData.getStringFromUser("Ingrese el nombre del estudiante: "));
        student3.setGet(GetData.getIntFromUser("Ingrese la matricula del estudiante: "));
        student3.setGet(GetData.getFloatFromUser("Ingrese el promedio del estudiante"));
        System.out.println(); 
    }
}