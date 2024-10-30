public class CuerpoHumanoA
{
    private String tonoDePiel;
    private float altura;
    private String tipoDeCuerpo;

    public String getTonoDePiel() {
        return tonoDePiel;
    }

    public void setTonoDePiel(String tonoDePiel) {
        this.tonoDePiel = tonoDePiel;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTipoDeCuerpo() {
        return tipoDeCuerpo;
    }

    public void setTipoDeCuerpo(String tipoDeCuerpo) {
        this.tipoDeCuerpo = tipoDeCuerpo;
    }

    // Clases anidadas no estáticas

    public class Apendice
    {
        private float longitud;
        private float diametro;
        private boolean estadoDeInflamación;

        public float getLongitud() {
            return longitud;
        }
        public void setLongitud(float longitud) {
            this.longitud = longitud;
        }
        public float getDiametro() {
            return diametro;
        }
        public void setDiametro(float diametro) {
            this.diametro = diametro;
        }
        public boolean getEstadoDeInflamación() {
            return estadoDeInflamación;
        }
        public void setEstadoDeInflamación(boolean estadoDeInflamación) {
            this.estadoDeInflamación = estadoDeInflamación;
        } 
    }

    public class Higado
    {
        private float funcionHepatica;
        private float volumenHepatico;
        private float nivelBilirrubina;

        public float getFuncionHepatica() {
            return funcionHepatica;
        }
        public void setFuncionHepatica(float funcionHepatica) {
            this.funcionHepatica = funcionHepatica;
        }
        public float getVolumenHepatico() {
            return volumenHepatico;
        }
        public void setVolumenHepatico(float volumenHepatico) {
            this.volumenHepatico = volumenHepatico;
        }
        public float getNivelBilirrubina() {
            return nivelBilirrubina;
        }
        public void setNivelBilirrubina(float nivelBilirrubina) {
            this.nivelBilirrubina = nivelBilirrubina;
        }
    }

    public class Pulmon
    {
        private float capacidadPulmonar;
        private int frecuenciaRespiratoria;
        private float oxigenacion;
        Pulmon[] pulmones = new Pulmon[2];

        Pulmon(){}

        Pulmon(Pulmon pDerecho, Pulmon pIzquierdo)
        {
            pulmones[0] = pDerecho;
            pulmones[1] = pIzquierdo;
        }

        public float getCapacidadPulmonar() {
            return capacidadPulmonar;
        }
        public void setCapacidadPulmonar(float capacidadPulmonar) {
            this.capacidadPulmonar = capacidadPulmonar;
        }
        public int getFrecuenciaRespiratoria() {
            return frecuenciaRespiratoria;
        }
        public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
            this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        }
        public float getOxigenacion() {
            return oxigenacion;
        }
        public void setOxigenacion(float oxigenacion) {
            this.oxigenacion = oxigenacion;
        }   
    }

    public class Corazon
    {
        private int frecuenciaCardiaca;
        private float presionAterial;
        private float volumenSistplico;

        public int getFrecuenciaCardiaca() {
            return frecuenciaCardiaca;
        }
        public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
            this.frecuenciaCardiaca = frecuenciaCardiaca;
        }
        public float getPresionAterial() {
            return presionAterial;
        }
        public void setPresionAterial(float presionAterial) {
            this.presionAterial = presionAterial;
        }
        public float getVolumenSistplico() {
            return volumenSistplico;
        }
        public void setVolumenSistplico(float volumenSistplico) {
            this.volumenSistplico = volumenSistplico;
        }
    }
}