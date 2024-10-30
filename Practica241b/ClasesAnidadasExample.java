public class ClasesAnidadasExample
{
    public static void main(String[] args) 
    {
        // Paso 4A - Creando una instancia de la clase externa 
        CuerpoHumanoA cuerpoDeAdrian = new CuerpoHumanoA();

        CuerpoHumanoA.Apendice apendiceDeAdrian = cuerpoDeAdrian.new Apendice();
        CuerpoHumanoA.Corazon corazonDeAdrian = cuerpoDeAdrian.new Corazon();
        CuerpoHumanoA.Higado higadoDeAdrian = cuerpoDeAdrian.new Higado();
        CuerpoHumanoA.Pulmon pulmonesDeAdrian = cuerpoDeAdrian.new Pulmon(cuerpoDeAdrian.new Pulmon(), cuerpoDeAdrian.new Pulmon());

            // Dando valores mediante setters
        
        System.out.println("Datos de los organos de Adrian");
        apendiceDeAdrian.setEstadoDeInflamación(false);
        System.out.println(apendiceDeAdrian.getEstadoDeInflamación());
        
        corazonDeAdrian.setFrecuenciaCardiaca(110);
        System.out.println(corazonDeAdrian.getFrecuenciaCardiaca());
        
        higadoDeAdrian.setVolumenHepatico(34);
        System.out.println(higadoDeAdrian.getVolumenHepatico());
        
        pulmonesDeAdrian.pulmones[0].setCapacidadPulmonar(75); // Pulmón izquierdo
        System.out.println("Pulmón izquierdo: " + pulmonesDeAdrian.pulmones[0].getCapacidadPulmonar());
        
        pulmonesDeAdrian.pulmones[1].setCapacidadPulmonar(95); // Pulmón derecho
        System.out.println("Pulmón derecho: " + pulmonesDeAdrian.pulmones[1].getCapacidadPulmonar() + "\n");

        // Paso 4B - Instanciando unicamente la clase externa e incializando las instancias de las clases anidadas
        // desde el constructor de la clase externa

        CuerpoHumanoB cuerpoDeX = new CuerpoHumanoB();

            // Dando valores mediante setters

        System.out.println("Datos del cuerpo de X");
        cuerpoDeX.apendice.setEstadoDeInflamación(true);
        System.out.println(cuerpoDeX.apendice.getEstadoDeInflamación());

        cuerpoDeX.corazon.setFrecuenciaCardiaca(95);
        System.out.println(cuerpoDeX.corazon.getFrecuenciaCardiaca());

        cuerpoDeX.higado.setVolumenHepatico(16);
        System.out.println(cuerpoDeX.higado.getVolumenHepatico());

        cuerpoDeX.pulmones.pulmones[0].setCapacidadPulmonar(95);
        cuerpoDeX.pulmones.pulmones[1].setCapacidadPulmonar(76);

        System.out.println("Pulmón izquierdo: " + cuerpoDeX.pulmones.pulmones[0].getCapacidadPulmonar());
        System.out.println("Pulmón derecho: " + cuerpoDeX.pulmones.pulmones[1].getCapacidadPulmonar());
    }
}