package exemplos.exercicio02;

import java.util.ArrayList;

public class GerenciaContas {

    private ArrayList<Conta> listaDeContas = new ArrayList<>();

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.add(new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.add(new ContaEspecial(numeroConta, limite));
    }

    public boolean deposito(int numeroConta, double valor) {

        /*
         * for (int i = 0; i < listaDeContas.size(); i++) { if
         * (listaDeContas.get(i).getNumero() == numeroConta) {
         * listaDeContas.get(i).deposito(valor); break; } }
         */
        if (valor <= 0) {
            return false;
        }
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta) {
                conta.deposito(valor);
                return true;
            }
        }
        return false;

    }

    public boolean saque(int numeroConta, double valor) {
        for (Conta conta : listaDeContas) {
            if (conta.getNumero() == numeroConta)
            {
                conta.saque(valor);
            return conta.saque(valor);
            }
        }
        return false;
    }

    public String listarContas()
    {
        String saida = "";
        for (int i = 0; i < listaDeContas.size(); i++)
        {
            saida = saida + listaDeContas.get(i).exibir() + "\n";
        }
        return saida;
        
    }

}
