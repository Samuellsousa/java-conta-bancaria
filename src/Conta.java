import java.util.Scanner;


public class Conta {
    public static void main(String[] args) {
        String nome = "Samuel Sousa";
        String tipoConta = "Corrente";
        double saldo = 1899.59;
        int opcao = 0;


        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: "+ saldo);
        System.out.println("******************************");

        String menu = """
                ** Digite sua opcção **
                1 - Consultar saldo
                2 - transferir valor
                3 - Receber valor 
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            }
        }
    }
}

