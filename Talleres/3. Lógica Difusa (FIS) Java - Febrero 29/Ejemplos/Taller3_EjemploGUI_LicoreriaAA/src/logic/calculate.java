package logic;

import net.sourceforge.jFuzzyLogic.FIS;
//import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;

public class calculate {
	private static int plan;
	private static int intensidad;
	private static int cantidad;

	public calculate(int plan, int intensidad, int cantidad) {
		calculate.plan = plan;
		calculate.intensidad = intensidad;
		calculate.cantidad = cantidad;
	}

	public static String calculateFCL() {
		// Carga el archivo de lenguaje de control difuso 'FCL'
		String fileName = "src/logic/FCL_licorera.fcl";
		FIS fis = FIS.load(fileName, true);

		// En caso de error
		if (fis == null) {
			System.err.println("No se puede cargar el archivo: '" + fileName + "'");
			return "";
		}

		// Establecer las entradas del sistema
		fis.setVariable("plan", plan);
		fis.setVariable("intensidad", intensidad);
		fis.setVariable("cantidad", cantidad);

		// Inicia el funcionamiento del sistema
		fis.evaluate();

		// Muestra los gráficos de las variables de entrada y salida
//		JFuzzyChart.get().chart(fis.getFunctionBlock("prop"));

		// Imprime el valor concreto de salida del sistema
		double price = fis.getVariable("precio").getLatestDefuzzifiedValue();
		double percentage = fis.getVariable("porcentaje").getLatestDefuzzifiedValue();

		// Muestra las reglas activadas y el valor de salida de cada una despues de
		// aplicar las operaciones lógicas
		StringBuilder reglasUsadas = new StringBuilder();
		reglasUsadas.append("Reglas Usadas:\n");
		fis.getFunctionBlock("prop").getFuzzyRuleBlock("No1").getRules().stream()
				.filter(r -> (r.getDegreeOfSupport() > 0)).forEachOrdered(r -> {
					reglasUsadas.append(r.toString()).append("\n");
				});

		System.out.println(reglasUsadas.toString());

		return ("Precio sugerido: $" + String.format("%.0f", price) + "\n Con un porcentaje de alcohol de: "
				+ String.format("%.0f", percentage) + "%");
	}
}
