/*
A empresa que você trabalha descobriu que você está indo muito bem neste curso de Java e pediu para que você desenvolvesse um programa que calcula os pagamentos para os prestadores de serviços da empresa.

Este programa deve receber as seguintes entradas de dados do usuário:

Nome (texto)
Valor por hora (decimal)
Horas trabalhadas (inteiro)
Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento, mostrando os cálculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52
Use a formatação de saída com printf para imprimir na saída e o tipo Scanner para receber a entrada de dados do usuário.
*/

import java.util.Scanner;

public class CalculoDeHorasTrabalhadas {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o nome:");
    String nome = entrada.nextLine();

    System.out.print("Digite o valor hora:");
    double valorHora = entrada.nextDouble();

    System.out.print("Digite as horas trabalhadas:");
    int horasTrabalhadas = entrada.nextInt();

    System.out.print("Digite os descontos:");
    double descontos = entrada.nextDouble();

    double total = valorHora * horasTrabalhadas;

    double totalDevido = total - descontos;

    /*
    Folha de pagamento: Thiago Faria
    172 horas x R$150.20 = R$25834.40
    Descontos: R$482.88
    Total devido: R$25351.52
    */ 
    System.out.println("---------------------------------------");
    System.out.printf("Folha de pagamento: %s%n%d X R$%.2f = R$%.2f%nDescontos: R$%.2f%nTotal devido: R$%.2f",
    nome, horasTrabalhadas, valorHora, total, descontos, totalDevido);
    }
    


}