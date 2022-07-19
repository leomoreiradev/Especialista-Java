public class FormatandoComPrintf {
  public static void main(String[] args) {
    String nome1 = "Thiago";
    System.out.printf("Olá, %s%n", nome1 );

    int quantidade = 48;
    //%d para numeros inteiros long e int
    System.out.printf("Quantidade: %d itens%n", quantidade);

    double peso = 938.22;
    //%f para numeros de ponto flutuante float e double
    //.2 limita a precisao de casas decimais
    System.out.printf("Peso: %.2f", peso);
  }
}