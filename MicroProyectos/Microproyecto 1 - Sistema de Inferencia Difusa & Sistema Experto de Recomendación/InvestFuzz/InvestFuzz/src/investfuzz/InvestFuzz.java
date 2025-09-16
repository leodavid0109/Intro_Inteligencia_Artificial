package investfuzz;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import interfaz.InvestFuzzUI;

public class InvestFuzz {

    public static void main(String[] args) {
        
        InvestFuzzUI gui = new InvestFuzzUI();
        gui.setVisible(true);
    }
    
    /**
     *
     * @param riesgo
     * @param rentabilidad
     * @param plazo
     * @return
     */
    public String evaluarPortafolioInversion(double riesgo, double rentabilidad, double plazo) {
        
        String fileName = "src/investfuzz/FCL_InvestFuzz.fcl";
        FIS fis = FIS.load(fileName, true);
        
        if (fis == null) {
            System.err.println("Error: No se puede cargar el archivo '" + fileName + "'");
            return "Error al cargar el sistema difuso";
        }
        
        // Entradas
        fis.setVariable("Riesgo", riesgo);
        fis.setVariable("Rentabilidad", rentabilidad);
        fis.setVariable("Plazo", plazo);
        fis.evaluate();
        
        // Salidas
        double diversificacionGeneral = fis.getVariable("Diversificacion").getValue();
        double liquidezGeneral = fis.getVariable("Liquidez").getValue();
        
        // Grados de pertenencia
        double perDivBajo = fis.getVariable("Diversificacion").getMembership("Bajo");
        double perDivModerado = fis.getVariable("Diversificacion").getMembership("Moderado");
        double perDivAlto = fis.getVariable("Diversificacion").getMembership("Alto");
        double perDivMuyAlto = fis.getVariable("Diversificacion").getMembership("MuyAlto");
        
        double perLiqMuyBaja = fis.getVariable("Liquidez").getMembership("MuyBaja");
        double perLiqBaja = fis.getVariable("Liquidez").getMembership("Baja");
        double perLiqModerada= fis.getVariable("Liquidez").getMembership("Moderada");
        double perLiqAlta = fis.getVariable("Liquidez").getMembership("Alta");
        
        // Obtener conjunto de mayor pertenencia
        String mejorDiversificacion = obtenerPertenenciaConjunto(perDivBajo, perDivModerado, perDivAlto, perDivMuyAlto, "Bajo", "Moderado", "Alto", "MuyAlto");
        double gradoDiversificacion = obtenerGrado(perDivBajo, perDivModerado, perDivAlto, perDivMuyAlto);
        String mejorLiquidez = obtenerPertenenciaConjunto(perLiqMuyBaja, perLiqBaja, perLiqModerada, perLiqAlta, "MuyBaja", "Baja", "Moderada", "Alta");
        double gradoLiquidez = obtenerGrado(perLiqMuyBaja, perLiqBaja, perLiqModerada, perLiqAlta);
        
        // Gráficos
        JFuzzyChart.get().chart(fis.getFunctionBlock("FCL_InvestFuzz"));
        
        return String.format("""  
                             
            Diversificación: %.2f
            Nivel: %s (Grado de pertenencia: %.2f)
            
            Tipo de Liquidez: %.1f%%
            Nivel: %s (Grado de pertenencia: %.2f)             
            """, 
            diversificacionGeneral, mejorDiversificacion, gradoDiversificacion, liquidezGeneral, mejorLiquidez, gradoLiquidez);
    }
    
    private String obtenerPertenenciaConjunto(double num1, double num2, double num3, double num4, String nom1, String nom2, String nom3, String nom4) {
    if (num1 >= num2 && num1 >= num3 && num1 >= num4) return nom1;
    if (num2 >= num1 && num2 >= num3 && num2 >= num4) return nom2;
    if (num3 >= num1 && num3 >= num2 && num3 >= num4) return nom3;
    return nom4;
}
    
    private double obtenerGrado(double num1, double num2, double num3, double num4) {
        return Math.max(Math.max(num1, num2), Math.max(num3, num4));
    }
    
}
