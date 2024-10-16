
import GenAI.Rueda;
import GenAI.Cuadro;

public class Bicicleta {

    public Cuadro cuadro = new Cuadro();
    public Rueda ruedas = new Rueda();
    private String tipoDeBicicleta;
    private String color;
    private String marca;

    public void setTipoDeBicicleta(String tipoDeBicicleta) 
    {
        this.tipoDeBicicleta = tipoDeBicicleta;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getTipoDeBicicleta() 
    {
       return tipoDeBicicleta;
    }

    public String getColor() 
    {
        return color;
    }

    public String getMarca() 
    {
        return marca;
    }
}
