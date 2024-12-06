public class DrawingApplication 
{
    public static void main(String[] args)
    {
        // Uso de polimorfismo y enlace dinámico
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        
        // Sobrecarga de métodos
        circle.setColor("Red");
        circle.setColor("Red", 80);
        
        rectangle.setColor("Blue");
        rectangle.setColor("Blue", 40);
        
        triangle.setColor("Yellow");
        triangle.setColor("Yellow", 20);
        
        // Sobreescritura de métodos
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }   
}