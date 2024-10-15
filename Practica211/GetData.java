import java.util.Scanner; // Librería que nos permite ingresar datos por teclado

public class GetData
{
    private static Scanner getData = new Scanner(System.in); // Creando una instancia de la clase Scanner
    // Este error me aparece si no pongo Static en el scanner: Cannot make a static reference to the non-static field getData 

    // Método para recibir cadenas de caracteres
    public static String getStringFromUser(String msg)
    {
        System.out.print(msg + " ");
        return getData.nextLine();
    }

    // Método para recibir numeros enteros
    public static int getIntFromUser(String msg)
    {
        System.out.print(msg + " ");
        int value = getData.nextInt();
        getData.nextLine(); // Consumir el carácter de nueva línea restante
        return value;
    }

    // Método para recibir numeros flotantes
    public static Float getFloatFromUser(String msg)
    {
        System.out.print(msg + " ");
        float value = getData.nextFloat();
        getData.nextLine(); // Consumir el carácter de nueva línea restante
        // En lenguaje C esto es como limpiar el buffer
        return value;
    }
}