public class Persona {

    private int edad;
    private String genero;
    private String lugarDeNacimiento;
    private String nacionalidad;
    private String idioma;

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) 
    {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public void setNacionalidad(String nacionalidad) 
    {
        this.nacionalidad = nacionalidad;
    }

    public void setIdioma(String idioma) 
    {
        this.idioma = idioma;
    }

    public int getEdad() 
    {
        return edad;
    }

    public String getGenero() 
    {
        return genero;
    }

    public String getLugarDeNacimiento() 
    {
        return lugarDeNacimiento;
    }

    public String getNacionalidad() 
    {
        return nacionalidad;
        
    }

    public String getIdioma() 
    {
        return idioma;
    }

    public static void comer(String comida, float caloriasGeneradas) 
    {
        System.out.println("El platillo: " + comida + " está generando " + caloriasGeneradas + " generadas en su cuerpo");
    }

    public void dormir(float tiempo) 
    {
        System.out.println("Usted ha dormido un total de " + tiempo + " horas.");
    }

    public void hacerEjercicio(float tiempo, float aumentoMasaMuscular) 
    {
        System.out.println("Usted ha hecho ejercicio durante " + tiempo + " y ha aumentado un total de " + aumentoMasaMuscular + " kg.");
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", genero=" + genero + ", lugarDeNacimiento=" + lugarDeNacimiento + ", nacionalidad=" + nacionalidad + ", idioma=" + idioma + '}';
    }   
}