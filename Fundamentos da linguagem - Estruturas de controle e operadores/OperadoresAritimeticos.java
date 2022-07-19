public class OperadoresAritimeticos {
  public static void main(String[] args) {
    int minhaIdade = 40;
    int suaIdade = 25;
    //Adição
    int totalIdades = minhaIdade + suaIdade + 100;

    System.out.println("Total das idades: " + totalIdades); 

    //Subtração
    int diferencaIdades = minhaIdade - suaIdade;

    System.out.println("Diferença das idades: " + diferencaIdades);

    //Multiplicação
    int multiplicacao = 2 * suaIdade;
    System.out.println("Dobro da sua idade: " + multiplicacao);

    //Divisao
    int metadeDaSuaIdade = suaIdade / 2;
    System.out.println("Metade da sua idade: " + metadeDaSuaIdade);

    //Resto (modulo)
    int restoDaDivisao = 7 % 2;
    System.out.println("Resto da divisão:" + restoDaDivisao);
  }
}