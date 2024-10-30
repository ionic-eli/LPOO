public class Main {
    public static void main(String[] args) {
        // Crear instancia de CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano("Juan");

        // Configurar atributos del corazón
        cuerpo.getCorazon().setLatidosPorMinuto(72);
        cuerpo.getCorazon().latir();

        // Configurar atributos de los pulmones
        cuerpo.getPulmonIzquierdo().setCapacidad(2.5);
        cuerpo.getPulmonDerecho().setCapacidad(2.5);
        cuerpo.getPulmonIzquierdo().respirar();
        cuerpo.getPulmonDerecho().respirar();

        // Mostrar el nombre del cuerpo
        System.out.println("El nombre del cuerpo es: " + cuerpo.getNombre());
    }
}
