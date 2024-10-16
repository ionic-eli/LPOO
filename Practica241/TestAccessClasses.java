
import GenAI.Bicicleta;
import GenAI.Cuadro;

public class TestAccessClasses 
{
    public static void main(String args[])
    {
        // Caso 1. Ejemplo de la clase Bicicleta
        Bicicleta bici = new Bicicleta(); // Creando una instancia de la clase Bicicleta y asignando datos
        bici.setMarca("BMX");
        bici.cuadro.setMaterial("Caucho");
        bici.ruedas.setDiametro(20);
        
        System.out.println("Datos de la bicicleta");
        System.out.println(bici.getMarca());
        System.out.println(bici.cuadro.getMaterial());
        System.out.println(bici.ruedas.getDiametro() + "\n");
        
        // Para demostrar un ejemplo de agregación, crearé una instancia de cuadro y modificaré el valor 
        // previamente asignado desde la clase bici
        Cuadro cuadro = new Cuadro();
        cuadro.setMaterial("Metal");
        System.out.println("Material de cuadro modificado desde la instancia del main: " + cuadro.getMaterial() + "\n");
        
        // Caso 2. Ejemplo de la clase CuerpoHumano
        // Si bien podemos crear instancias de Corazon, Pulmon , etc. Esto hará que
        // la composición pierda sentido por lo que solo accesaremos desde la clase todo
        CuerpoHumano human = new CuerpoHumano();
        
        System.out.println("Datos de la clase CuerpoHumano");
        human.setAltura(1.85f);
        human.apendice.setDiametro(10);
        human.heart.setVolumenSistplico(15);
        human.higado.setNivelBilirrubina(25);
        human.lung.setCapacidadPulmonar(90);
        
        System.out.println("Altura: "+ human.getAltura());
        System.out.println("Diametro del apendice: " + human.apendice.getDiametro() + " cm");
        System.out.println("Volumen sistplico del corazón: " + human.heart.getVolumenSistplico() + " mg");
        System.out.println("Nivel de bilirrubina del higado: "+ human.higado.getNivelBilirrubina() + "%");
        System.out.println("Capacidad pulmonar: "+ human.lung.getCapacidadPulmonar() + "L");
        
        // Si deseo acceder a la instancia lung desde este archivo no será posible ya que
        // es vital acceder a ese atributo desde la instancia human
    }
}
