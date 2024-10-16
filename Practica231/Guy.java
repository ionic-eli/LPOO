public class Guy {
    public String nombre;
    protected String lugarDeNacimiento;
    public int edad;
    private String nacionalidad;
    protected String genero;

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    protected void tomarShower() {
        System.out.println(nombre + " está tomando una ducha.");
    }

    private void relajarse() {
        System.out.println(nombre + " está relajándose.");
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static void main(String[] args) {
        Guy persona = new Guy();
        persona.nombre = "Juan Pérez";
        persona.lugarDeNacimiento = "Ciudad de México";
        persona.edad = 30;
        persona.genero = "Masculino";
        persona.setNacionalidad("Mexicana");

        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Lugar de Nacimiento: " + persona.lugarDeNacimiento);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Género: " + persona.genero);
        System.out.println("Nacionalidad: " + persona.getNacionalidad());

        persona.comer();
        persona.dormir();
        persona.tomarShower();
    }
}

