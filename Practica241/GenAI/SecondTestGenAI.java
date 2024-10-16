//package GenAI;

// Clase Corazon
class Corazon {
    private int frecuenciaCardiaca; // Frecuencia en latidos por minuto
    private double tamano; // Tamaño en cm
    private String estado; // Estado del corazón (ej: saludable, enfermo)

    // Constructor
    public Corazon(int frecuenciaCardiaca, double tamano, String estado) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.tamano = tamano;
        this.estado = estado;
    }

    // Getters y Setters
    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Clase Pulmon
class Pulmon {
    private double capacidad; // Capacidad en litros
    private int frecuenciaRespiratoria; // Frecuencia en respiraciones por minuto
    private String estado; // Estado del pulmón (ej: saludable, enfermo)

    // Constructor
    public Pulmon(double capacidad, int frecuenciaRespiratoria, String estado) {
        this.capacidad = capacidad;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.estado = estado;
    }

    // Getters y Setters
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

// Clase CuerpoHumano (clase principal)
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;

    // Constructor
    public CuerpoHumano(Corazon corazon, Pulmon pulmonIzquierdo, Pulmon pulmonDerecho) {
        this.corazon = corazon;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.pulmonDerecho = pulmonDerecho;
    }

    // Métodos para acceder a las partes del cuerpo humano
    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public void setPulmonIzquierdo(Pulmon pulmonIzquierdo) {
        this.pulmonIzquierdo = pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public void setPulmonDerecho(Pulmon pulmonDerecho) {
        this.pulmonDerecho = pulmonDerecho;
    }
}

// Clase principal con ejemplo de uso
public class SecondTestGenAI {
    public static void main(String[] args) {
        // Crear el corazón
        Corazon corazon = new Corazon(72, 12.0, "saludable");

        // Crear pulmones
        Pulmon pulmonIzquierdo = new Pulmon(3.0, 16, "saludable");
        Pulmon pulmonDerecho = new Pulmon(3.0, 16, "saludable");

        // Crear cuerpo humano usando el corazón y los pulmones
        CuerpoHumano cuerpo = new CuerpoHumano(corazon, pulmonIzquierdo, pulmonDerecho);

        // Acceder a los atributos de las partes del cuerpo humano
        System.out.println("Frecuencia cardiaca: " + cuerpo.getCorazon().getFrecuenciaCardiaca() + " latidos por minuto");
        System.out.println("Capacidad del pulmón izquierdo: " + cuerpo.getPulmonIzquierdo().getCapacidad() + " litros");
        System.out.println("Estado del corazón: " + cuerpo.getCorazon().getEstado());
        System.out.println("Frecuencia respiratoria del pulmón derecho: " + cuerpo.getPulmonDerecho().getFrecuenciaRespiratoria() + " respiraciones por minuto");
    }
}
