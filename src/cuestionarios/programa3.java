package cuestionarios;

public class programa3 {

	public static void main(String[] args) {
		
		int resultado1 = 0;
		int resultado2 = 0;
		
		String textoResultado = "";
		
		int var1 = 50;
		double var2 = 105.20;
		
		double var3= 21.3;
		
		boolean variable = (var1==50) && (var2 + var3 == 128.5);
		
		if (variable) {
			textoResultado = "variable es true";
			resultado1 = 56 +var1;
			resultado1++;
			
		} else {
			textoResultado = "variable es false";
			resultado1++;
			resultado1 = resultado1 + 4;
			
				if (resultado1 == 5) {
				textoResultado = "resultado1 vale 5";
				resultado2 = 55;
				resultado2++;
			}
		}
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(textoResultado);
	}

}
