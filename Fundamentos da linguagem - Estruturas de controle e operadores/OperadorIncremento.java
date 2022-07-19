public class OperadorIncremento {
    public static void main(String[] args) {
      int totalDownloads = 10;
      //totalDownloads++;

      //incremento pos fixado primeiro atribui a variavel e depois incrementa
      //int novoTotalDownloads = totalDownloads++;
     //incremento pre fixado primeiro incrementa depois atribui a uma nova variavel
      int novoTotalDownloads = ++totalDownloads;

      System.out.println("Total de downloads: " + totalDownloads);
      System.out.println("Novo Total de downloads: " + novoTotalDownloads);
   }
}