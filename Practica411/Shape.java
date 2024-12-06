public abstract class Shape
{
    protected String color;
    
    public abstract void draw();
    
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setColor(String color, int opacity)
    {
        this.color = color;
        System.out.println("Definiendo un color con la opacidad:" + opacity);
    }
    
    public String getColor()
    {
        return color;
    }
}