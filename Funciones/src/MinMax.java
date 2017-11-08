
public class MinMax {

	public  static int[] minimo_maximo(int[] Numeros) {
		
		
		
		//Recibe un array de 2 numeros y este devolvera un array con min max
		//En la primera casilla del array guarda el min y en la segunda el max.
		
		int max = Numeros[0];
		int min = Numeros[0];
		
		for (int i = 0; i < Numeros.length; i++){
			if(Numeros[i] > max){
				  max = Numeros[i];
			    }
			  }
			 		
		for(int i=1; i < Numeros.length; i++){
		    if(Numeros[i] < min){
			  min = Numeros[i];
			}
		  }
		    
			  
		return new int[] {max, min};
	}
		
	
		    int[ minimo_maximo = new int[2]
		}

}