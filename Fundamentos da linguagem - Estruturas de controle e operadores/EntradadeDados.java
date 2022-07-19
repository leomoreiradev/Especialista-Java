import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] arg){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o seu nome:");

    String nome = entrada.nextLine();

     System.out.printf("Oi, %s%n", nome);
  }
}