public class ConversaoDoubleParaInt {
  public static void main(String[] args) {
    double largura = 100;
  // não compila pois o compilador n assume o risco de compilar a menos que o programador
  // deixe explicito que quer fazer o casting
  // int tamanho = largura;

  //casting manual (explicito) compila  
  int tamanho = (int) largura;

  System.out.println(tamanho);


  }
}