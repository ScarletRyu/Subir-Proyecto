import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestionPersona {
	public static void main(String[] args) {
		
		File fichero1 = new File("D:/Resultado");
		Scanner scan2 = null;
		try {
			scan2 = new Scanner(fichero1);
			
	
	}catch(FileNotFoundException e) {
		
	e.printStackTrace();
	}

	String linea = scan2.nextLine();
	String[] partes = linea.split(";");
		
	Persona e1 = new Persona();
	e1.setNombre("pepito");
	e1.setApellidos("grillo");
	e1.setEdad("32");
	
	
	//Eliminar un Entrenador 
			System.out.print("Introduce nombre del entrenador");
			String Persona = scan2.nextLine();
			
			
			
	}
	
	
	
}
