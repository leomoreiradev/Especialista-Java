public class ExemploFolatDouble {
  public static void main(String[] arg) {
    double peso = 84.9;
    System.out.println(peso);

    // não compila pois estamos colocando um valor literal double de 64 bits
    //float taxa = 1_294.93;

    //Para poder interpretar como um float precisa colocar um  F apos o numero literal
    float taxa = 1_294.93F;

    System.out.println(taxa);
  }
}