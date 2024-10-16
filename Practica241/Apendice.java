public class Apendice 
{
    private float longitud;
    private float diametro;
    private boolean estadoInflamacion;

    public void intsetLongitud(float longitud) 
    {
        this.longitud = longitud;
    }

    public void setDiametro(float diametro) 
    {
        this.diametro = diametro;
    }

    public void setEstadoInflamacion(boolean estadoInflamacion) 
    {
        this.estadoInflamacion = estadoInflamacion;
        
    }

    public float getLongitud() {
        return longitud;
    }

    public float getDiametro() {
        return diametro;
    }

    public boolean getEstadoInflamacion() 
    {
        return estadoInflamacion;
    }
}
