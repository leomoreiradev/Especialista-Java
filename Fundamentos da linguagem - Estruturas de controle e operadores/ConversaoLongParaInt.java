public class ConversaoLongParaInt {
  public static void main(String[] args) {
    long x = 10L;
    
    //Não compila pois não há como saber com  precisão se o valor de long cabe no int
    //int y = x;

    //Convertendo de forma manual, fazendo o casting de long para int
    //Caso de fato o valor de do long x for maior que a capacidade do int y serão perdidos bits
    //Nesta caso da certo pois o valor 10L cabe dentro do y
    int y = (int) x;

    System.out.println(x);
    System.out.println(y);

    long a = 9300000035L;

    int b = (int) a;  

    System.out.println(a);
    System.out.println(b);
   }
}