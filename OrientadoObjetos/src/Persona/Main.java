package Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Persona> alumnos = new ArrayList<Persona>();

		Persona persona = new Persona();
		persona.setNombre("Joxe");
		persona.setApellido("Badiola");
		persona.setDni("12233434l");
		alumnos.add(persona);

		alumnos.add(new Persona("n4", "a4", "dni4"));
		alumnos.add(new Persona("n3", "a3", "dni3"));
		alumnos.add(new Persona("n2", "a2", "dni2"));
		alumnos.add(new Persona("b1", "a1", "dni1"));

		// crear lista y rellenarla con nombres <String>
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("imanol");
		nombres.add("ander");
		nombres.add("zubizarreta");
		
		imprimirListaStrings(nombres);
		NombreComparator nc = new NombreComparator();
		
		nombres.sort(nc);
		
		imprimirListaStrings(nombres);
		//-----------------------
		
		imprimirListaPersonas(alumnos);
		ApellidoComparator pc = new ApellidoComparator();
		alumnos.sort(pc);
		System.out.println("Lista ordenada por apellido:");
		imprimirListaPersonas(alumnos);
		
		System.out.println("Lista ordenada por edad de menor a mayor");



	}//fin metodo main
	
	
	private static void imprimirListaPersonas(ArrayList<Persona> alumnos) {
		System.out.println("La lista de personas.....");
		Iterator<Persona> i = alumnos.iterator();
		while(i.hasNext()){
			i.next().mostrarPersona();
		}
		System.out.println("Fin lista de personas.....");
		
	}


	public static void imprimirListaStrings(ArrayList<String> nombres){
		System.out.println("La lista es:---------------");
		Iterator<String> i = nombres.iterator();

		while (i.hasNext()) {
			String nombre = i.next();
			System.out.println(nombre);
		}
		System.out.println("Fin de la lista:---------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}



