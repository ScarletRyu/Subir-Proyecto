
public class Funciones {

	public static void main(String[] args) {
		 public class Main {

			// funcion
		    boolean es_par(int numero) {
			if (numero % 2 == 0) {
			return true;
			} else {
			return false;
			}
			}

			static String concatenar(String st1, String st2) {
				
			return st1 + " " + st2;

			}

			static String pasar_a_minusculas(String frase) {
			return frase.toLowerCase();
			}

			boolean es_primo(int numero) {

			boolean es_primo = true;

			for (int i = 2; i < numero; i++) {

			if (numero % i == 0) {
			es_primo = false;
			}

			}

			return es_primo;
			}

			static int max(int[] numeros){
				 int maxValue = numeros[0];
				  for(int i=1; i < numeros.length; i++){
				    if(numeros[i] > maxValue){
					  maxValue = numeros[i];
				    }
				  }
				  return maxValue;			
			}

			public static int min(int[] numeros){
				  int minValue = numeros[0];
				  for(int i=1; i<numeros.length; i++){
				    if(numeros[i] < minValue){
					  minValue = numeros[i];
					}
				  }
				  return minValue;
			}

			
			
			static double media(int[] numeros){
				int suma = 0;
				for (int i = 0; i < numeros.length; i++){
					suma = suma + numeros[i];
				}
				return suma/numeros.length;
			}

			// procedimiento
			static void escribir(String frase) {
			System.out.println(frase);
			}
			

			static void escribir_en_mayuscula(String frase) {
			escribir(frase.toUpperCase());
			}

			private static void escribir_array(int[] numeros) {

			}

			public static void main(String[] args) {

			int zenbakia = 10;

			if (es_par(zenbakia)) {
			escribir(zenbakia + " es par");
			} else {
			escribir(zenbakia + " no es par");
			}

			escribir_en_mayuscula(concatenar("hola", "mundo"));

			if (es_primo(5)) {
			escribir(5 + " es primo");
			}

			int[] numeros = { 12, 4, 4, 7, 3, 6, 3 };

			System.out.println(media(numeros));
			double media = media(numeros);
			}
		
		 }
	}
}
		 
		 

		 
	



