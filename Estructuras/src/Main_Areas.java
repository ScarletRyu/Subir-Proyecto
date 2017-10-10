import java.util.Scanner;

public class Main_Areas {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int opcion;
		
        
       
		do {
			System.out.println("Introduce un numero de menu");
			System.out.println("-------MENU-------");
			System.out.println("1 - Lado de un circulo");
			System.out.println("2 - Lado de un cuadrado");
			System.out.println("3 - Lado de un triangulo");
			System.out.println("4 - Salir");

			
			opcion = scan.nextInt();
			
			switch(opcion) {
			
			case 1 :
				System.out.println("Ingrese el radio del circulo:");
				double radio = scan.nextInt();
				double Resultado1 = Math.PI * (radio * radio);
				System.out.print("El area del circulo es: " + Resultado1);
				break;
				
			case 2 :
				System.out.println("Ingrese el lado del cuadrado:");
				double  lado = scan.nextInt();
				double Resultado2 = (lado * lado);
				 System.out.print("El area del cuadrado es: " + Resultado2);
				break;
				
			case 3 :
				System.out.println("Ingrese el lado del triangulo:");
				lado = scan.nextInt();
				double Resultado3 = (((Math.sqrt(3))/(4))*(Math.pow(lado, 2)));
				System.out.print("El area del circulo es: " + Resultado3);
				break;
				
			case 4 :
				System.out.println("Cerrando sistema...");
				break;
				
				default:
					System.out.println("Opcion mal");
					break;
			}
	}
		while(opcion !=4);
		System.out.println("Fin del programa");
}
}
