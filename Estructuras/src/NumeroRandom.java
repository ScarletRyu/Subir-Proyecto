import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] ar) {

int intentos = 1;
int  numero_a_acertar = (int)(Math.random()*10);
System.out.println("Introduce numero del 0 al 9");
Scanner scan = new Scanner(System.in);
int numero_del_usuario = scan.nextInt();
intentos ++; //lo mismo que intentos = intentos +1
while(numero_a_acertar != numero_del_usuario){
	System.out.println("No has acertado, introduce otro numero");
	numero_del_usuario = scan.nextInt();
	intentos = intentos +1;
}
System.out.println("Has acertado!! el numero es: " + numero_a_acertar);
System.out.println("Has necesitado " + intentos + "intentos");
}
}