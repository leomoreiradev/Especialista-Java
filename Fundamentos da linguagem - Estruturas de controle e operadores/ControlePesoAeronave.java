import java.util.Scanner;

public class ControlePesoAeronave {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso maximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();

    // System.out.print("Quantidade de passageiros: ");
    // int totalPassageiros = entrada.nextInt();

    int pesoTotalPassageiros = 0;

    //Usando o for
    //int passageiroAtual = 0;

    // for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++){
    //   System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
    //   int pesoPassageiro = entrada.nextInt();  

    //   pesoTotalPassageiros += pesoPassageiro;
    // }


    //Usando o while

    boolean incluirNovoPassageiro = true;
     while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro){
      System.out.print("Peso do passageiro:");
      int pesoPassageiro = entrada.nextInt();  

      pesoTotalPassageiros += pesoPassageiro;
      System.out.print("Incluir novo passageiro?");
      incluirNovoPassageiro = entrada.nextBoolean();
    }

    System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situacao da aeronave: %s%n",pesoTotalPassageiros > pesoMaximo ? "Peso excedido" : "Liberado");
  }
}