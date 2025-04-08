import java.util.Scanner;

    public class DesafioCurso {

        public static void main(String[] args) {
            int operacao = 0;
            String nome = "Julia Freire dos Santos";
            double saldo = 2500.00;


            String tipoConta = "Corrente";
            String menu = """
                   Operações
                1- Consultar o saldo.
                2- Receber valor.
                3- Transferir valor.
                4- Sair.
                """;

            Scanner leitura = new Scanner(System.in);
            while (operacao != 4) {
                System.out.println(menu);
                operacao = leitura.nextInt();

                //Consultar o saldo.
                if (operacao == 1) {
                    System.out.println("Nome do cliente:   " + nome);
                    System.out.println("Tipo de conta:    " + tipoConta);
                    System.out.println("Saldo inicial     " + saldo);
                    System.out.println("*******************************************");


                }
                //Receber valor.
                if (operacao == 2) {
                    Scanner credito = new Scanner(System.in);
                    System.out.println("Seu saldo no momento: R$ " + saldo);
                    System.out.println("Informe o valor a receber:");
                    double valor = credito.nextDouble();
                    double creditado = valor;
                    saldo += creditado;


                    System.out.println("Saldo atualizado R$ " + saldo);

                }

                //Transferir valor.
                if (operacao == 3) {
                    Scanner debito = new Scanner(System.in);
                    System.out.println("Seu saldo no momento: R$ " + saldo);
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorD = debito.nextDouble();
                    double debitado = valorD;
                    if (valorD > saldo) {
                        System.out.println("Valor não disponível");
                    } else {
                        saldo -= debitado;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }

                }
                //Sair.
                if (operacao == 4) {
                    System.out.println("Conta fechada com sucesso!");


                }

            }

            leitura.close();
        }
    }




