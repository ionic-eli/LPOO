public class Rectangle extends Shape 
{
    @Override
    public void draw()
    {
        System.out.println("Estoy dibujando un rectangulo de color " + getColor());
    }
}
