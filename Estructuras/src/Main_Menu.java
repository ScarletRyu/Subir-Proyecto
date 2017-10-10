import java.util.Scanner;

public class Main_Menu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("Introduce un numero de menu");
			System.out.println("-------MENU-------");
			System.out.println("1 - Grabar CD audio");
			System.out.println("2 - Grabar CD datos");
			System.out.println("3 - Guardar CD en disco");
			System.out.println("4 - Salir");
			
			//leer la opcion
			opcion = scan.nextInt();
			
			
			//switch
			switch(opcion) {
			case 1 :
				System.out.println("Grabando CD audio...");
				System.out.println("CD Copiado!!");
				break;
			case 2 :
				System.out.println("Grabando CD datos...");
				System.out.println("Datos grabados!!");
				break;
			case 3 :
				System.out.println("Guardando CD en disco...");
				System.out.println("Datos guardados!!");
				break;
			case 4 :
				System.out.println("Cerrando sistema...");
				break;
				
			}
			
		
	}
		while(opcion !=4);
		System.out.println("Fin del programa");
}
}

	
		
