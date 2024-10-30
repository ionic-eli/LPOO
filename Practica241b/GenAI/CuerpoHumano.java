public class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;
    private String nombre;

    public CuerpoHumano(String nombre) {
        this.nombre = nombre;
        this.corazon = new Corazon();
        this.pulmonIzquierdo = new Pulmon("Izquierdo");
        this.pulmonDerecho = new Pulmon("Derecho");
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Clase anidada (interna) Corazon
    public class Corazon {
        private int latidosPorMinuto;

        public int getLatidosPorMinuto() {
            return latidosPorMinuto;
        }

        public void setLatidosPorMinuto(int latidosPorMinuto) {
            this.latidosPorMinuto = latidosPorMinuto;
        }

        public void latir() {
            System.out.println("El corazón está latiendo a " + latidosPorMinuto + " latidos por minuto.");
        }
    }

    // Clase anidada (interna) Pulmon
    public class Pulmon {
        private String lado;
        private double capacidad;

        public Pulmon(String lado) {
            this.lado = lado;
        }

        public String getLado() {
            return lado;
        }

        public double getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(double capacidad) {
            this.capacidad = capacidad;
        }

        public void respirar() {
            System.out.println("El pulmón " + lado + " está respirando con una capacidad de " + capacidad + " litros.");
        }
    }
}