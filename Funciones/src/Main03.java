
import java.io.File;
import java.util.Scanner;
		public class Main03 {
		/*
		 * Menu con funciones
		 * teniendo articulo.txt
		 * 1- contar palabras
		 * 2- contar cuantas veces aparece una palabra introducida por teclado
		 * 3- contar cuantas veces aparece la vocal 'a'
		 * 4- introducir un numero por teclado y que saque la suma del mismo con sus inferiores
		 * 5- introducir un numero por teclado y sacar por pantalla los multiplos de 5 inferiores
		 * 6- utilizad funciones para que el main quede mejor estructurado y simple
		 */
			
				
				 public static int contarPalabras(String s) {
					 	Scanner scan=new Scanner(System.in);
						File fichero = new File("D:\txt1.txt");
						int opcion;
					    int contador = 1, pos;
					    s = s.trim(); 		       //eliminar los posibles espacios en blanco al principio y al final
					    if (s.isEmpty()) {         //si la cadena está vacía
					        contador = 0;
					    } else {
					             pos = s.indexOf(" ");          //se busca el primer espacio en blanco
					             while (pos != -1) {            //mientras que se encuentre un espacio en blanco
					             contador++; 					//se cuenta una palabra
					             pos = s.indexOf(" ", pos + 1);  //se busca el siguiente espacio en blanco
					                }                                               //a continuación del actual
					    }
					    return contador;
				 
				 }
				 public static int contarPalabras2(String s) {
					 
					 
				 }
					}
		
				/* do {
					System.out.println("Introduce un numero de menu");
					System.out.println("-------MENU-------");
					System.out.println("1 - ");
					System.out.println("2 - ");
					System.out.println("3 - ");
					System.out.println("4 - ");
					
					//leer la opcion
					opcion = scan.nextInt();
				
					//switch
					switch(opcion) {
					case 1 :
						System.out.println("");
						System.out.println("");
						break;
					case 2 :
						System.out.println("");
						System.out.println("");
						break;
					case 3 :
						System.out.println("");
						System.out.println("");
						break;
					case 4 :
						System.out.println("");
						break;
						
					}
					
				
			}
				while(opcion !=4);
				System.out.println("Fin del programa");
		}
		}
		
		*/
		
		
