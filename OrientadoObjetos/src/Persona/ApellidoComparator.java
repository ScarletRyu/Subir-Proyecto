package Persona;

import java.util.Comparator;

//ordena personas por apellido
public class ApellidoComparator implements Comparator<Persona>{

	
	
	@Override
	public int compare(Persona p1, Persona p2) {
		
		return p1.getApellido().compareToIgnoreCase(p2.getApellido());
	}

}

