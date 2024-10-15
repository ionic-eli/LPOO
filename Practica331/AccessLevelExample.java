public class AccessLevelExample 
{
    public static void main(String[] args) 
    {
        // Instancias de las clases
        Persona guy = new Persona();
        Estudiante student = new Estudiante();
        
//        guy.edad = 10;
        // edad tiene un modificador privado, por lo tanto, no es posible acceder a la variable desde aquí
        
        guy.lugarDeNacimiento = "Tijuana, Baja California";
        System.out.println(guy.lugarDeNacimiento);
        // El atributo lugarDeNacimiento es protected por lo que, aunque no está en el contexto 
        // adecuado es posible acceder a este atributo ya que están ubicados en el mismo paquete
        
        guy.setEdad(19);
        System.out.println(guy.getEdad());
        // Anteriormente se demostró que no es posible hacer una asignación directa desde otro contexto,
        // sin embargo, mediante el método set y get de un atributo privado es posible acceder a los
        // datos de la variable
        
        guy.tomarShower(1, "TresSeme");
        // Es posible acceder a un método protegido desde una instancia de la clase 
        // que declara ese método
        
        student.genero = "Masculino";
        // Es posible acceder a los miembros de la super clase de manera directa siempre y cuando estos
        // sean públicos
        
//        student.edad = 10;
        // Caso contario al anterior, si quiero acceder de manera directa a un atributo privado no me será posible acceder
        // al menos que sea mediante el método set().
        
        student.tomarShower(2, "Loreal"); 
        // Es posible acceder a un método protected de una subclase que herede los atributos
        // y comportamientos de una superclase
        
        // ¿Cómo funciona tener un método privado?
        // Simple, es necesario tener un método público (preferiblemente) que implemente el método privado
        student.setMatricula(2201328);
        System.out.println(student.getMatricula());
        student.modificarDatos();
    }
}
