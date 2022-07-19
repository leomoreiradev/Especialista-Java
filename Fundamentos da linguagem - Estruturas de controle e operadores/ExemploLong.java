public class ExemploLong {
  public static void main(String[] args) {
    long populacaoUberlandia = 699097;
    //long populacaoUberlandia2 = 2_147_483_647;
    //Não compila pois ultrapassa o valor suportado pelo int
    //pois o valor suportado é ate 2_147_483_647
    //por debaixo dos panos o java converte o int  pra long antes de atribuir a variavel
    //para que esse numero seja interpretado como long é necessario colocar o L
    long populacaoUberlandia2 = 2_147_483_648L;
  }
}