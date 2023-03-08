import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> agenda = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //adding elements for exemple

        agenda.add("primeiroNome");
        agenda.add("5555555555");
        agenda.add("segundoNome");
        agenda.add("8888888888");
        agenda.add("terceiroNome");
        agenda.add("1111111111");

        System.out.println("\nDigite o numero ou o nome para consultar: \n");
        String consulta = scanner.nextLine();

        for (String x: agenda){
            int element = agenda.indexOf(x);

            if(x.equals(consulta)){
                System.out.println(agenda.get(element+1));
                break;
            }
            if (!x.equals(consulta)){
                System.out.println("n encontrado");
                break;
            }
        }
    }
}