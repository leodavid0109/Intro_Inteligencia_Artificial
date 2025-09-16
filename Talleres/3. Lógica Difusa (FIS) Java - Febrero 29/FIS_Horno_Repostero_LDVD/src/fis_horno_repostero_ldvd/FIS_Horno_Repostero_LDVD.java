package fis_horno_repostero_ldvd;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import interfaz.FIS_Horno_Repostero_UI;
//import java.util.Scanner;


public class FIS_Horno_Repostero_LDVD {

    public static void main(String[] args) {
        
        /* APLICACIÓN EN CONSOLA
        Scanner scanner = new Scanner(System.in);
        FIS_Horno_Repostero_LDVD horno = new FIS_Horno_Repostero_LDVD();
        
        System.out.println("Bienvenido al FIS recomendador para un Sistema de Hornos Reposteros.");
        System.out.println("Tenga en cuenta por favor que los datos que solicitamos, los debe ingresar como números del 0 al 10 (siendo 0 el mínimo y 10 el máximo.");
        
        System.out.println("Ingrese el nivel de humedad del horno: ");
        double humedad = scanner.nextDouble();
        System.out.println("Ahora, ingrese el nivel de intensidad de marrón deseado para la preparación: ");
        double marron = scanner.nextDouble();
        System.out.println("Finalmente, ingrese un indicador del volumen del postre a hornear: ");
        double volumen = scanner.nextDouble();
        
        String resultado = horno.calcularTemperatura(humedad, marron, volumen);
        System.out.println(resultado);
        */
        
        FIS_Horno_Repostero_UI gui = new FIS_Horno_Repostero_UI();
        gui.setVisible(true);
    }
    
    public String calcularTemperatura(double humedad, double marron, double volumen){
        
        // Carga archivo de lenguaje de control difuso 'FCL'
        String fileName = "src/fis_horno_repostero_ldvd/FCL_Horno.fcl";
        FIS fis = FIS.load(fileName, true);
        
        if (fis == null){
            System.err.println("No se puede cargar el archivo: '" + fileName + "'");
            return "Error al cargar el sistema difuso";
        }
        
        // Establecer entradas del sistema
        fis.setVariable("HumedadHorno", humedad);
        fis.setVariable("IntensidadMarron", marron);
        fis.setVariable("VolumenPostre", volumen);
        
        // Inicio Funcionamiento del Sistema
        fis.evaluate();
        
        // Salida
        double temperaturaGeneral = fis.getVariable("Temperatura").getValue();
        
        // Grados de pertenencia
        double TemBaja = fis.getVariable("Temperatura").getMembership("Baja");
        double TemMedia = fis.getVariable("Temperatura").getMembership("Media");
        double TemAlta = fis.getVariable("Temperatura").getMembership("Alta");
        
        // Obtener conjunto de mayor pertenencia
        String recomendacion = "";
        
        if (TemBaja >= TemMedia && TemBaja >= TemAlta)
        {
            recomendacion = "Baja";
        } else if (TemMedia >= TemBaja && TemMedia >= TemAlta)
        {
            recomendacion = "Media";
        } else if (TemAlta >= TemBaja && TemAlta >= TemMedia)
        {
            recomendacion = "Alta";
        }
        
        double grado = Math.max(Math.max(TemBaja, TemMedia), TemAlta);
        
        // Muestra gráficos de variables de entrada y salida
        JFuzzyChart.get().chart(fis.getFunctionBlock("horno_repostero"));
        
        // Muestra las reglas activadas y el valor de salida de cada una despues de aplicar las operaciones lógicas
        StringBuilder reglasUsadas = new StringBuilder();
        reglasUsadas.append("Reglas Usadas:\n");
        fis.getFunctionBlock("horno_repostero").getFuzzyRuleBlock("No1").getRules().stream()
                .filter(r -> (r.getDegreeOfSupport() > 0))
                .forEachOrdered(r -> reglasUsadas.append(r.toString()).append("\n"));

        return String.format("""
                    
                    Temperatura: %.2f °C
                    Tipo: %s (Grado de pertenencia: %.2f)
       
                    
                    %s           
                    """,
                temperaturaGeneral, recomendacion, grado, reglasUsadas.toString());

    }   
}
