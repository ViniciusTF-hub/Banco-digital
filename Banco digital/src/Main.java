import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Cliente vinicius = new Cliente();
		vinicius.setNome("Vinicius");
        
        Conta cc = new ContaCorrente(vinicius);

        Conta cp = new ContaPoupanca(vinicius);
        boolean continuar = true;

        while (continuar) {
            // Exibe o menu
            System.out.println("\nMenu:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Imprimir Extrato Conta Corrente");
            System.out.println("5. Imprimir Extrato Conta Poupança");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                 
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    break;

                case 2:
                   
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    cc.sacar(valorSaque);
                    break;

                case 3:
                    
                    System.out.print("Digite o valor a ser transferido: R$ ");
                    double valorTransferencia = scanner.nextDouble();
                   
                    cc.transferir(valorTransferencia, cp);
                    break;

                case 4:
                
                    cc.imprimirExtrato();
                    break;
                case 5:
                
                    cp.imprimirExtrato();
                    break;

                case 6:

                    continuar = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}