public class ExemploInt {
  public static void main(String[] args) {
    int populacaoUberlandia = 699097;
    int populacaoUberlandia2 = 2_147_483_647;
    //Não compila pois ultrapassa o valor suportado
    int populacaoUberlandia2 = 2_147_483_648;
  }
}