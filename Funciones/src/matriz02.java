import java.io.File;
import java.util.Scanner;

public class matriz02 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("D:\txt1.txt");
		Scanner s = new Scanner(f);
		
		int num_lineas = contarlineas(s);
		String[][] matriz = new String[num_lineas][2];
		
		s = new Scanner(f);
		
		int i = 0;
		while(s.hasnextline()){
			String linea = s.nextLine();
			matriz[i] = linea.split(" ");
			i++;
			
		}
//sacar matriz por la pantalla
		System.out.println("fin");
	}

}
