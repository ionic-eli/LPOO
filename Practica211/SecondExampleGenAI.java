class Student {
    // Atributos
    private String nombre;
    private int edad;
    private String matricula;

    // Método setGet para manejar los datos
    public void setGet(String atributo, String valor) {
        switch (atributo.toLowerCase()) {
            case "nombre":
                this.nombre = valor;
                System.out.println("Nombre: " + this.nombre);
                break;
            case "edad":
                this.edad = Integer.parseInt(valor);
                System.out.println("Edad: " + this.edad);
                break;
            case "matricula":
                this.matricula = valor;
                System.out.println("Matrícula: " + this.matricula);
                break;
            default:
                System.out.println("Atributo no válido");
                break;
        }
    }
}

public class SecondExampleGenAI {
    public static void main(String[] args) {
        // Crear objetos de Studen
        Student estudiante1 = new Student();
        Student estudiante2 = new Student();
        Student estudiante3 = new Student();

        // Usar el método setGet para asignar y mostrar valores
        estudiante1.setGet("nombre", "Carlos");
        estudiante1.setGet("edad", "20");
        estudiante1.setGet("matricula", "A123");

        estudiante2.setGet("nombre", "María");
        estudiante2.setGet("edad", "22");
        estudiante2.setGet("matricula", "B456");

        estudiante3.setGet("nombre", "Luis");
        estudiante3.setGet("edad", "21");
        estudiante3.setGet("matricula", "C789");
    }
}
