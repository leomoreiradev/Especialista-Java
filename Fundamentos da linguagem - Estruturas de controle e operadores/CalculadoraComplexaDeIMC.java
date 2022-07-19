import java.util.Scanner;

public class CalculadoraComplexaDeIMC {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite o sexo: M ou F: ");
      char sexo = entrada.next().charAt(0);

      if(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();
        double imc = peso / (altura * altura);

        if (sexo == 'F' || sexo == 'f') {
          if(imc < 19.1) {
            System.out.println("Abaixo do peso");
          } else if(imc <= 25.8) {
            System.out.println("No peso ideal");
          } else if(imc <= 27.3) {
            System.out.println("Um pouco acima do peso");    
          } else if (imc <= 32.3) {
            System.out.print("Acima do peso ideal");
          } else {
            System.out.print("Obeso");
          }
        } else if(sexo == 'M' || sexo == 'm'){
          if(imc < 20.7) {
          System.out.println("Abaixo do peso");
        } else if(imc <= 26.4) {
          System.out.println("No peso ideal");
        } else if(imc <= 27.8) {
          System.out.println("Um pouco acima do peso");    
        } else if (imc <= 31.1) {
          System.out.print("Acima do peso ideal");
        } else {
          System.out.print("Obeso");
        }
      }
    } else {
        System.out.println("Entrada inválida! A entrada deve ser \"M\" ou \"F\"");  
      }
  } 
}