public class Estudiante 
{
    // Variables de instancia
    private String name;
    private int matricula;
    private float prom;

    // Setters y getters

        // Setters

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public void setProm(float prom) 
    {
        this.prom = prom;
    }

        // Getters

    public String getName() 
    {
        return name;
    }

    public int getMatricula() 
    {
        return matricula;
    }

    public float getProm() 
    {
        return prom;
    }

        // Método setGet, exclusivo de la sección dos del ejercicio

    // Haciendo uso de genericos para crear un método flexible y que pueda recibir cualquier tipo de dato/objeto
    public <T> void setGet(T data)
    {
        // Validando cada caso... si es String, Integer o Float
        if(data instanceof String)
        {
            setName((String) data); // Casting de T a String
            System.out.println(getName());
        }

        if(data instanceof Integer) 
        {
            setMatricula((int) data); // Casting de T a int
            System.out.println(getMatricula());   
        }

        if(data instanceof Float)
        {
            setProm((float) data); // Casting de T a float
            System.out.println(getProm());   
        }
    }
}
