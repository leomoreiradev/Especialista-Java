public class OperadoresComparacao {
  public static void main(String[] args) {
    int pesoProdutos = 1000;
    //int pesoProdutos = 900;
    int limitePesoCaminhao = 1000;

    boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;

    //boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;

    boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;

    System.out.printf("Carga excedida: %b%n", cargaExcedida);

    System.out.printf("Carga Liberada: %b%n", cargaLiberada);

  }
}