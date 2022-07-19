public class ConversaoDoubleParaFloat {
  public static void main(String[] args) {
    double peso1 = 20.5;

    //Não compila pois o valor de double é  64 bits e o  float é 32
    //float peso2 = peso1;

    //Para que isso aconteça precisamos deixar explicito a conversão com o casting manual
    //ATENÇÂO!!! Caso o valor convertido for maior que o float suporte serao perdidos bits
    float peso2 = (float) peso1;

    System.out.println(peso1);
    System.out.println(peso2);

    float taxa1 = 934.5F;
    //Autocasting, pois o float é menor que o double logo
    //um valor float cabe dentro de um double
    double taxa2 = taxa1;

    //Casting manual (opcional)
    double taxa2 = (double) taxa1;

    System.out.println(taxa1);
    System.out.println(taxa2);




  }
}