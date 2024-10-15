public class ExamplePersona 
{
    public static void main(String args[])
    {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        
        // Datos de Adrián
        System.out.println("Datos de Elí\n");
        persona1.setEdad(19);
        persona1.setGenero("Masculino");
        persona1.setLugarDeNacimiento("Tijuana, Baja California");
        persona1.setNacionalidad("Mexicano");
        persona1.setIdioma("Español");
        System.out.println(persona1);
        Persona.comer("Espagueti", 100);
        persona1.dormir(8);
        persona1.hacerEjercicio(2, 15);
        System.out.println();
        
        // Datos de Pellegrín
        System.out.println("Datos de Pellegrín\n");
        persona2.setEdad(20);
        persona2.setGenero("Masculino");
        persona2.setLugarDeNacimiento("Tijuana, Baja California");
        persona2.setNacionalidad("Mexicano");
        persona2.setIdioma("Español e Inglés");
        System.out.println(persona2);
        Persona.comer("Sandwich del deli gourmet", 100);
        persona2.dormir(10);
        persona2.hacerEjercicio(1, 30);
        System.out.println();
        
        // Datos de persona random (no hay tercer integrante)
        System.out.println("Datos de un integrante que no existe\n");
        persona3.setEdad(22);
        persona3.setGenero("Masculino");
        persona3.setLugarDeNacimiento("Tijuana, Baja California");
        persona3.setNacionalidad("Mexicano");
        persona3.setIdioma("Inglés");
        System.out.println(persona3);
        Persona.comer("Pizza", 150);
        persona3.dormir(6);
        persona3.hacerEjercicio(2, 50);
    }
}
