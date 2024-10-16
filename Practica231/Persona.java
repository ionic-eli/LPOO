public class Persona {

    private int edad;
    public String genero;
    protected String lugarDeNacimiento;
    public String nacionalidad;
    public String idioma;

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
        System.out.println("Tu " + comida + " tiene " + caloriasGeneradas + " calorias.");
    }

    public void dormir(float tiempo) 
    {
        System.out.println("Dormiste un total de: " + tiempo + " horas.");
    }

    protected void tomarShower(float duración, String marcaDeShampoo) 
    {
        System.out.println("¿De verdad duraste " + duración + " horas tratandote de limpiar con el shampoo " + marcaDeShampoo + "?");
    }
}