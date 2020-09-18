package exercicios.exercicio02;

public abstract class Conta {

    private int numero;
    private double saldo;


    //construtor padrão
    public Conta ()
    {
        this.numero = 0;
        this.saldo = 0;
    }

    //construtor
    public Conta (int numero)
    {
        this.numero = numero;
    }


    //método de exibição
    public int getNumero()
    {
        return numero;
    }

    public String exibir() {
        return numero + " : " + saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

 

    public void deposito(double valor)
    {
        if (valor > 0)
        saldo = saldo + valor;
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    

    public void setSaldo (double saldo)
    {
        if (saldo > 0)
       this.saldo = saldo;
        
    }
    
    
}
