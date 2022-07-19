public class ExemploByteShort {
  public static void main(String[] args) {
    //valor max
    byte idade = 127;
    //nao compila
    byte idade = 128;
    //valor max
    short quantidadeEstoque = 32767;

    //nao compila
    short quantidadeEstoque = 32768;
  }
}