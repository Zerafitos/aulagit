package exercicios.exercicio02;


import java.util.HashMap;

public class GerenciaContas {

    private HashMap<Integer, Conta> listaDeContas ;
    
    public GerenciaContas()
    {
        listaDeContas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public boolean deposito(int numeroConta, double valor) {

        if (valor <= 0) {
            return false;
        }

        if (listaDeContas.containsKey(numeroConta)) {
        listaDeContas.get(numeroConta).deposito(valor);
        return true;
        }

        return false;

    }

    public boolean saque(int numeroConta, double valor) {

        if (listaDeContas.containsKey(numeroConta)) {
            return listaDeContas.get(numeroConta).saque(valor);
            }
        return false;
    }

    public String listarContas()
    {
        String saida = "";
        for (Integer key : listaDeContas.keySet()) {
        saida = saida + listaDeContas.get(key).exibir() + "\n";
        }
        return saida;
        
    }

}
