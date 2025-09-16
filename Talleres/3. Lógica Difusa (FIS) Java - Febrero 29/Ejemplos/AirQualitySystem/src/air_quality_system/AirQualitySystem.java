package air_quality_system;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import interfaz.AirQualityUI;
import java.util.Scanner;

public class AirQualitySystem {
    
    public static void main(String[] args) {
        
        AirQualityUI gui = new AirQualityUI();
        gui.setVisible(true);
        
        // Por consola
        /*
        Scanner scanner = new Scanner(System.in);
        AirQualitySystem airQuality = new AirQualitySystem();
        while(true) {
            System.out.println("=== Sistema de Calidad del Aire ===");
            System.out.println("1. Evaluar calidad del aire");
            System.out.println("2. Salir");
            System.out.print("Elección: ");
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("\nIngrese el nivel de CO2 (0-100)");
                    double co2 = scanner.nextDouble();
                    System.out.println("Ingrese el nivel de partículas (0-50)");
                    double particulas = scanner.nextDouble();
                    System.out.println("Ingrese la temperatura (0-40)");
                    double temperatura = scanner.nextDouble();
                    
                    if (co2 > 100 || particulas > 50 || temperatura > 40 || co2 < 0 || particulas < 0 || temperatura < 0) {
                        System.out.println("Ingrese valores válidos");
                        break;
                    }
                    
                    String resultado = airQuality.evaluarCalidadAire(co2, particulas, temperatura);
                    System.out.println(resultado);
                    break;
                    
                case 2:
                    System.out.println("============ Adiós ============");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        */
    }
    
    public String evaluarCalidadAire(double co2, double particulas, double temperatura) {
        
        String fileName = "src/air_quality_system/calidad_aire.fcl";
        FIS fis = FIS.load(fileName, true);
        
        if (fis == null) {
            System.err.println("Error: No se puede cargar el archivo '" + fileName + "'");
            return "Error al cargar el sistema difuso";
        }
        
        // Entradas
        fis.setVariable("co2", co2);
        fis.setVariable("particulas", particulas);
        fis.setVariable("temperatura", temperatura);
        fis.evaluate();
        
        // Salidas
        double calidadGeneral = fis.getVariable("calidad_general").getValue();
        double riesgoSalud = fis.getVariable("riesgo_salud").getValue();
        
        // Grados de pertenencia
        double pertenenciaMala = fis.getVariable("calidad_general").getMembership("mala");
        double pertenenciaModerada = fis.getVariable("calidad_general").getMembership("moderada");
        double pertenenciaBuena = fis.getVariable("calidad_general").getMembership("buena");
        double pertenenciaBajo = fis.getVariable("riesgo_salud").getMembership("bajo");
        double pertenenciaMedio = fis.getVariable("riesgo_salud").getMembership("medio");
        double pertenenciaAlto = fis.getVariable("riesgo_salud").getMembership("alto");
        
        // Obtener conjunto con mayor pertenencia
        String calidadMayor = obtenerConjuntoMayor(pertenenciaMala, pertenenciaModerada, pertenenciaBuena, "mala", "moderada", "buena");
        double gradoCalidad = obtenerGradoMayor(pertenenciaMala, pertenenciaModerada, pertenenciaBuena);
        String riesgoMayor = obtenerConjuntoMayor(pertenenciaBajo, pertenenciaMedio, pertenenciaAlto, "bajo", "medio", "alto");
        double gradoRiesgo = obtenerGradoMayor(pertenenciaBajo, pertenenciaMedio, pertenenciaAlto);
        
        // Gráficos
        JFuzzyChart.get().chart(fis.getFunctionBlock("calidad_aire"));
        
        return String.format("""  
                             
            Calidad General: %.2f
            Categoría: %s (Grado de pertenencia: %.2f)
            
            Riesgo para la Salud: %.1f%%
            Nivel: %s (Grado de pertenencia: %.2f)             
            """, 
            calidadGeneral, calidadMayor, gradoCalidad, riesgoSalud, riesgoMayor, gradoRiesgo);
    }
    
    private String obtenerConjuntoMayor(double valor1, double valor2, double valor3, String cat1, String cat2, String cat3) {
        if (valor1 >= valor2 && valor1 >= valor3) return cat1;
        if (valor2 >= valor1 && valor2 >= valor3) return cat2;
        return cat3;
    }
    
    private double obtenerGradoMayor(double valor1, double valor2, double valor3) {
        return Math.max(Math.max(valor1, valor2), valor3);
    }
}