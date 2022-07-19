import java.util.Scanner;

public class ExameCortisol {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Cortisol: ");
    double cortisol = entrada.nextDouble();
    // Cortiso ideal de 6 a 18.4

    //Usando o operador logico AND
    boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4; 
    System.out.printf("Cortisol Normal: %b%n", resultadoNormal);

   //Usando o operador logico OR
   boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

   System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);

  }
}