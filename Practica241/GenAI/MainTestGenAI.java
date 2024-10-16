package GenAI;

// Clase Rueda
class Rueda {
    private double tamano; // tamaño en pulgadas
    private String material;
    private double presion; // presión en psi

    // Constructor
    public Rueda(double tamano, String material, double presion) {
        this.tamano = tamano;
        this.material = material;
        this.presion = presion;
    }

    // Getters y Setters
    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
}

// Clase Cuadro
class Cuadro {
    private String tipo; // Tipo de cuadro (e.g., montaña, carretera)
    private String color;
    private double peso; // Peso en kg

    // Constructor
    public Cuadro(String tipo, String color, double peso) {
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

// Clase Bicicleta (clase principal)
class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Métodos para acceder a las partes de la bicicleta
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }
}

// Clase principal con ejemplo de uso
public class MainTestGenAI {
    public static void main(String[] args) {
        // Crear ruedas
        Rueda ruedaDelantera = new Rueda(26, "aluminio", 35);
        Rueda ruedaTrasera = new Rueda(26, "aluminio", 35);

        // Crear cuadro
        Cuadro cuadro = new Cuadro("montaña", "rojo", 12.5);

        // Crear bicicleta usando las ruedas y el cuadro
        Bicicleta miBicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Acceder a los atributos de las partes de la bicicleta
        System.out.println("Tamaño de la rueda delantera: " + miBicicleta.getRuedaDelantera().getTamano() + " pulgadas");
        System.out.println("Material de la rueda trasera: " + miBicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Tipo de cuadro: " + miBicicleta.getCuadro().getTipo());
        System.out.println("Color del cuadro: " + miBicicleta.getCuadro().getColor());
        System.out.println("Peso del cuadro: " + miBicicleta.getCuadro().getPeso() + " kg");
    }
}