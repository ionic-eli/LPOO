public class CuerpoHumano {

    private String tonoDePiel;
    private float altura;
    private String tipoDeCuerpo;

    public Corazon heart;
    public Pulmon lung;
    public Apendice apendice;
    public Higado higado;
    
    // Definiendo un constructor que me ayudará a inicializar los objetos

    public CuerpoHumano() 
    {
        this.heart = new Corazon();
        this.lung = new Pulmon();
        this.apendice = new Apendice();
        this.higado = new Higado();
    }
    

    public void setTonoDePiel(String tonoDePiel) 
    {
        this.tonoDePiel = tonoDePiel;
    }

    public void setAltura(float altura) 
    {
        this.altura = altura;
    }

    public void setTipoDeCuerpo(String tipoDeCuerpo) 
    {
        this.tipoDeCuerpo = tipoDeCuerpo;
    }

    public String getTonoDePiel() 
    {
        return tonoDePiel;
    }

    public float getAltura() 
    {
        return altura;
    }

    public String getTipoDeCuerpo() 
    {
        return tipoDeCuerpo;
    }
}