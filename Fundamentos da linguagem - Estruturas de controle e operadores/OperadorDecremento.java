public class OperadorDecremento {
    public static void main(String[] args) {
    int limiteTentativasLogin = 10;

    //pos fixado
    //limiteTentativasLogin--;
    //int novoLimiteTentativasLogin = limiteTentativasLogin--;

    //pre fixado
    //--limiteTentativasLogin;
    int novoLimiteTentativasLogin = --limiteTentativasLogin;

    System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);

    System.out.println("Novo Limite de tentativas de login: " +  novoLimiteTentativasLogin);
   }
}