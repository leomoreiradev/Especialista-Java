import java.util.Scanner;

public class HorarioFuncionamento {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();

    System.out.print("Mes: ");
    int mes = entrada.nextInt();
    

    //Usando Switch Expressions a apartir do JAVA 14
   String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> {
        //Podemos ter condições aqui
        //Ex:
        if (mes == 12) {
          //yield para produzir o resultado
          yield "08:00 às 16:00";
        }
        yield "Fechado";
      }
      case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
      case "sab", "dom" -> "08:00 às 12:00";
      default ->  "Dia invalido";
    };



    //Usando switch com arrow
    //String horarioFuncionamento;
    // switch (diaSemana) {
    //   case "seg" -> horarioFuncionamento = "Fechado";
    //    case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
    //   case "sab", "dom" -> {
    //       horarioFuncionamento = "08:00 às 12:00";
    //       //Podem ser inseridas mais instruções aqui...
    //   }
    //   default -> horarioFuncionamento = "Dia invalido";
    // }





    //Switch tradicional
    //String horarioFuncionamento;
    // switch (diaSemana) {
    //   case "seg":
    //     horarioFuncionamento = "Fechado";
    //     break;
    //   case "ter":
    //   case "qua":
    //   case "qui":
    //   case "sex":
    //     horarioFuncionamento = "08:00 às 18:00";
    //     break;
    //   case "sab":
    //   case "dom":
    //     horarioFuncionamento = "08:00 às 12:00";
    //     break; 
    //   default:
    //     horarioFuncionamento = "Dia invalido";   
    // }

    System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
  }
}