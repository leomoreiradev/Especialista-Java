public class ConversaoIntParaLong {
  public static void main(String[] args) {
    int y = 102344;

    //Autocasting, foi feito pois um int cabe no long
    long x1 = y;
    System.out.println("Autocasting: " + x1);

    //Casting manual (opcional) 
    long x2 = (long) y;
    System.out.println("Casting manual: " + x2);
  }
}