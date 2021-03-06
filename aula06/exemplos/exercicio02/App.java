package exemplos.exercicio02;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        GerenciaContas contas = new GerenciaContas();
  
        double limite;
        ContaPoupanca.setTaxa(0.1);
        int numeroConta;
        double valor;


        do {

            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Exibir todas as contas");
            System.out.println("7-Consultar Saldo");
            System.out.println("8-Sair");
            System.out.print("-->");
            opcao = teclado.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Criando uma conta corrente.");
                    System.out.println("Informe o número da conta");
                    numeroConta = teclado.nextInt();
                    //cc = new ContaCorrente(numeroConta);
                    //listaDeContas.add(cc);
                    contas.novaContaCorrente(numeroConta);
                    break; // parada pra fazer somente a opção digitada
                case 2:
                    System.out.println("Criando uma conta especial.");
                    System.out.println("Informe o número da conta");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite:");
                    limite = teclado.nextDouble();
                    //ce = new ContaEspecial(numeroConta, limite);
                    //listaDeContas.add(ce);
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                case 3:
                    System.out.println("Criando uma conta poupança.");
                    System.out.println("Informe o número da conta");
                    numeroConta = teclado.nextInt();
                    //cp = new ContaPoupanca(numeroConta);
                    //listaDeContas.add(cp);
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 4:
                    System.out.println("Informe o número da conta");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do depósito:");
                    valor = teclado.nextDouble();   

                    if(contas.deposito(numeroConta, valor))
                    {
                     System.out.println("Depósito realizado");
                    }
                    else{
                    System.out.println("Depósito não realizado");
                    }
                    break;
                case 5:

                System.out.println("Informe o número da conta");
                numeroConta = teclado.nextInt();
                System.out.println("Informe o valor do saque:");
                valor = teclado.nextDouble();   

                if(contas.deposito(numeroConta, valor))
                {
                 System.out.println("Saque realizado");
                }
                else{
                System.out.println("Saque não realizado");
                }
                    
                    break;
                case 6:
                  System.out.println(contas.listarContas());

                    break;
                case 7:
                    System.out.println(contas.listarContas());
                    break;
                
                default:
                System.out.println("Opção inválida!");
                    break;
            }



        } while (opcao != 8);
       
        teclado.close();

        // ContaCorrente cc1 = new ContaCorrente(12345, 500);
        // ContaEspecial ce1 = new ContaEspecial(12346, 0, 100);
        // ContaPoupanca cp1 = new ContaPoupanca(12347, 0);

        // ContaCorrente cc2 = new ContaCorrente(22345, 200);
        // ContaEspecial ce2 = new ContaEspecial(22346, 1000, 300);
        // ContaPoupanca cp2 = new ContaPoupanca(22347, 2000);

        // ContaPoupanca.setTaxa(0.1);

        // System.out.println("A conta de numero " + cc1.getConta() + " tem saldo de R$"
        // + cc1.getSaldo());
        // System.out.println("A conta de numero " + ce1.getConta() + " tem saldo de R$"
        // + ce1.getSaldo() + " e limite de R$ " + ce1.getLimite());
        // System.out.println("A conta de numero " + cp1.getConta() + " tem saldo de R$"
        // + cp1.getSaldo());

        // System.out.println("A conta de numero " + cc2.getConta() + " tem saldo de R$"
        // + cc2.getSaldo() + " e limite de R$ " + cc2.getLimite());
        // System.out.println("A conta de numero " + ce2.getConta() + " tem saldo de R$"
        // + ce2.getSaldo() + " e limite de R$ " + ce2.getLimite());
        // System.out.println("A conta de numero " + cp2.getConta() + " tem saldo de R$"
        // + cp2.getSaldo());

        // ContaCorrente
        // System.out.println("\nOperação de Saque");
        // cc1.saque(100);
        // System.out.println("A conta de numero " + cc1.getConta() + " agora tem saldo
        // de R$" + cc1.getSaldo() + "\n");
        // System.out.println("\nOperação de Deposito");
        // cc1.deposito(100);
        // System.out.println("A conta de numero " + cc1.getConta() + " agora tem saldo
        // de R$" + cc1.getSaldo() + "\n");
        // System.out.println("\nOperação de Saque");
        // cc1.saque(600);
        // System.out.println("A conta de numero " + cc1.getConta() + " agora tem saldo
        // de R$" + cc1.getSaldo() + "\n");

        // ContaEspecial
        // System.out.println("\nOperação de Saque");
        // ce1.saque(200);
        // System.out.println("A conta de numero " + ce1.getConta() + " agora tem saldo
        // de R$" + ce1.getSaldo() + " e limite de R$ " + ce1.getLimite() + "\n");
        // System.out.println("\nOperação de Deposito");
        // ce1.deposito(100);
        // System.out.println("A conta de numero " + ce1.getConta() + " agora tem saldo
        // de R$" + ce1.getSaldo() + " e limite de R$ " + ce1.getLimite() + "\n");
        // System.out.println("\nOperação de Saque");
        // ce1.saque(1100);
        // System.out.println("A conta de numero " + ce1.getConta() + " agora tem saldo
        // de R$" + ce1.getSaldo() + " e limite de R$ " + ce1.getLimite() + "\n");

        // ContaPoupança
        // System.out.println("\nOperação de Saque");
        // cp1.saque(100);
        // System.out.println("A conta de numero " + cp1.getConta() + " agora tem saldo
        // de R$" + cp1.getSaldo() + "\n");
        // System.out.println("\nOperação de Deposito");
        // cp1.deposito(100);
        // System.out.println("A conta de numero " + cp1.getConta() + " agora tem saldo
        // de R$" + cp1.getSaldo() + "\n");
        // System.out.println("\nOperação de Saque");
        // cp1.saque(50);
        // System.out.println("A conta de numero " + cp1.getConta() + " agora tem saldo
        // de R$" + cp1.getSaldo() + "\n");

    }

}
