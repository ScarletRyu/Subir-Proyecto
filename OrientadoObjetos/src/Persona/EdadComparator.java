package Persona;

import java.util.Comparator;

public class EdadComparator implements Comparator<String>{

	@Override
	public int compare(String Persona1, String Persona2) {
		if(Persona1.compareToIgnoreCase(Persona2) < 0){
			return -1;
		}else if(Persona1.compareToIgnoreCase(Persona2) > 0){
			return 1;
		}else{
			
			return 0;	
		}
		
	}

}
