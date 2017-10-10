import java.util.Scanner;

public class While {
    public static void main(String[] ar) {
        int contador = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Introduce numero");
      int max = scan.nextInt();
        while (contador < max) {
            contador = contador +1;
            System.out.println("contador: " + contador);
        }
    }
}