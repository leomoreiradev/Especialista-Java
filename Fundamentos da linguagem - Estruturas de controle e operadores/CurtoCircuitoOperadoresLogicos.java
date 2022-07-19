public class CurtoCircuitoOperadoresLogicos {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    //Como para ser true toda a expressao precisa ser verdadeira
    //Quando na primeira parte da false, o programa nao segue a diante
    //Usando AND
    boolean resultado1 = x == 15 && y++ == 20;

    System.out.println(resultado1);
    System.out.println(y);

    //Usando OR
    //Se a primeira expressao for true ja finaliza 
    //pois entra o curto circuito
    boolean resultado2 = x == 10 || y++ == 20;
    System.out.println(resultado2);
    System.out.println(y);
  }
}